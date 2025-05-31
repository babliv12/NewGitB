package com.vtiger.SmokeTest;

import org.testng.annotations.Test;

import com.client.vtiger.generic.baseUtility.BaseClass;
import com.client.vtiger.objectRepository.HomePage;

public class ClockTest extends BaseClass{
	@Test
	
	public void clockTest() {
		
		HomePage hp = new HomePage(driver);
		hp.getclockimg().click();
	}

}
