package com.vtiger.SmokeTest;

import org.testng.annotations.Test;

import com.client.vtiger.generic.baseUtility.BaseClass;
import com.client.vtiger.objectRepository.HomePage;

public class EmailLinkTest extends BaseClass{
	
	@Test
	 public void emailLinkTest() {
		
		HomePage hp = new HomePage(driver);
		hp.emaillink().click();
	}

}
