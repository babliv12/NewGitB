package com.client.vtiger.ListenerUtility;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.internal.BaseClassFinder;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.client.vtiger.WebDriverUtility.UtilityClassObject;
import com.client.vtiger.generic.baseUtility.BaseClass;

public class ListImpClass implements ITestListener,ISuiteListener{
	public ExtentReports report;
	public static ExtentTest test;
	
	
	public void onStart(ISuite suite) {
	System.out.println("Report configuration");
	String time =new Date().toString().replace(" ", "_").replace(":"," ");
	ExtentSparkReporter spark = new ExtentSparkReporter("./AdvanceReport/report "+time+".html");
	spark.config().setDocumentTitle("CRM Test Suite Results");
	spark.config().setReportName("CRM Report");
	spark.config().setTheme(Theme.DARK);
	
	// add Env information and create test
	report=new  ExtentReports();
	report.attachReporter(spark);
	report.setSystemInfo("OS", "Windows-10");
	report.setSystemInfo("Browser", "CHROME-100");
	
	
}
public void onFinish(ISuite suite) {
	System.out.println("Report backUp");
	report.flush();
	

	
}
public void onTestStart(ITestResult result) {
	System.out.println("===== =====> "+result.getMethod().getMethodName()+">======Start=======");
	 test = report.createTest(result.getMethod().getMethodName());
	UtilityClassObject.setTest(test);
	 test.log(Status.INFO, result.getMethod().getMethodName()+"==> Started <==");
	
}
public void onTestSuccess(ITestResult result) {
	System.out.println("===== =====> "+result.getMethod().getMethodName()+">======End=======");
	test.log(Status.PASS, result.getMethod().getMethodName()+"==> Completed <==");

}
public void onTestFailure(ITestResult result) {
	String testName=result.getMethod().getMethodName();
	
	TakesScreenshot tss = (TakesScreenshot) BaseClass.sdriver;
	
	String filePath = tss.getScreenshotAs(OutputType.BASE64);
	
	String time =new Date().toString().replace(" ", "_").replace(":"," ");
	
	test.addScreenCaptureFromBase64String(filePath, testName+"_"+time);
	test.log(Status.FAIL, result.getMethod().getMethodName()+"==> Failed <==");


	}
	

	

public void onTestSkipped(ITestResult result) {
	
	
}
public void onTestFailureButWithinSuccessPercentage(ITestResult result) {
	
}

}
