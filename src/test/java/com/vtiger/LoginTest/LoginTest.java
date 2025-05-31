package com.vtiger.LoginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.client.vtiger.generic.baseUtility.BaseClass;
import com.client.vtiger.objectRepository.LoginPage;

public class LoginTest{


	@Test
		public void loginToApp() {
		WebDriver driver = new ChromeDriver();
		LoginPage lp = new LoginPage(driver);
		lp.loginToApp("http://49.249.28.218:8888/", "admin", "admin");
		
		
		
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://49.249.28.218:8888/");
//		driver.findElement(By.name("user_name")).sendKeys("admin");
//		driver.findElement(By.name("user_password")).sendKeys("admin");
//		driver.findElement(By.id("submitButton")).click();
//		
		
	}
}
