package com.vtiger.SmokeTest;

import org.testng.annotations.Test;

import com.client.vtiger.generic.baseUtility.BaseClass;
import com.client.vtiger.objectRepository.HomePage;

public class ChatTest extends BaseClass{
	
	@Test
	
	public void chatTest() {
		
		HomePage hp = new HomePage(driver);
		hp.getchatimg().click();
	}

}
