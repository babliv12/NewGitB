package com.vtiger.SmokeTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.client.vtiger.objectRepository.HomePage;
import com.client.vtiger.objectRepository.LoginPage;

public class LogoutTest {
	
	@Test
	public void loginToApp() {
	WebDriver driver = new ChromeDriver();
	LoginPage lp = new LoginPage(driver);
	lp.loginToApp("http://49.249.28.218:8888/", "admin", "admin");
	
	HomePage hp = new HomePage(driver);
	hp.logout();
	
	}
	

}
