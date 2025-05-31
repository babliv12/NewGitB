package com.client.vtiger.generic.baseUtility;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.client.vtiger.WebDriverUtility.UtilityClassObject;
import com.client.vtiger.WebDriverUtility.WebDriverUtility;
import com.client.vtiger.databaseUtility.DataBaseUtility;
import com.client.vtiger.generic.excelUtility.ExcelUtility;
import com.client.vtiger.generic.fileUtility.FileUtility;
import com.client.vtiger.generic.javaUtility.JavaUtility;
import com.client.vtiger.objectRepository.HomePage;
import com.client.vtiger.objectRepository.LoginPage;

public class BaseClass {
	
	//create object
	//public DataBaseUtility dblib= new DataBaseUtility();
	public FileUtility flib =new FileUtility();
	public ExcelUtility elib= new ExcelUtility();
	public JavaUtility jlib = new JavaUtility();
	public WebDriverUtility wlib = new WebDriverUtility();
	public WebDriver driver = null;
	public static WebDriver sdriver=null;

	
	@BeforeSuite(alwaysRun = true)
	public void configBS() throws Throwable {
		System.out.println("==connect to DB, Report Config==");
		//dblib.getDbConnection();
	}
	

	@BeforeClass (alwaysRun = true)
	public void configBC() throws Throwable {
		System.out.println("==Launch the Browser==");
		String Browser= flib.getDataFromPropertiesFile("Browser");
		
		
	
		if(Browser.equals("chrome")) {
			
			driver= new ChromeDriver();
		} else if (Browser.equals("firefox")) {
			
			driver= new FirefoxDriver();
		} else if (Browser.equals("edge")) {
			
			driver= new EdgeDriver();
		} else {
			driver = new ChromeDriver();
		}
		
		sdriver=driver;
		//UtilityClassObject.setDriver(driver);
		
	}
	
@BeforeMethod(alwaysRun = true)
	
	public void configBM() throws Throwable {
		
		System.out.println("==Login==");
		String Url= flib.getDataFromPropertiesFile("Url");
		String Username= flib.getDataFromPropertiesFile("Username");
		String Password= flib.getDataFromPropertiesFile("Password");
		
	
		
		LoginPage lp = new LoginPage(driver);
		lp.loginToApp(Url, Username,Password);
	}

@AfterMethod(alwaysRun = true)

	public void configAM() {
	
	System.out.println("==Logout==");
	HomePage hp = new HomePage(driver);
	hp.logout();
}
	
	@AfterClass(alwaysRun = true)
	public void configAC() {
		System.out.println("==Close the Browser==");
		driver.quit();
}

	
	@AfterSuite(alwaysRun = true)
	public void configAS() throws Throwable {
		System.out.println("==close DB, Report backup==");
		//dblib.closeDbConnection();
		
	}
}
