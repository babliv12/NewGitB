package com.client.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
/**
 * @author ashis
 * 
 * Contains Login page elements and Business lib like login()
 */
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.client.vtiger.WebDriverUtility.WebDriverUtility;

public class LoginPage extends WebDriverUtility { 
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(name="user_name")
	private WebElement usernameEdt;
	
	@FindBy(name="user_password")
	private WebElement passwordEdt;
	
	@FindBy(id="submitButton")
	private WebElement loginBtn;
	
	// Rule 4 Object Encapsulation

	public WebElement getUsernameEdt() {
		return usernameEdt;
	}

	public WebElement getPasswordEdt() {
		return passwordEdt;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	
	public void loginToApp(String Url, String Username, String Password) {
		waitForPageToLoad(driver);
		driver.get(Url);
		driver.manage().window().maximize();
		usernameEdt.sendKeys(Username);
		passwordEdt.sendKeys(Password);
		loginBtn.click();
		
		
	}
	
	
	
	
	
}
