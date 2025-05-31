package com.vtiger.SmokeTest;

import org.testng.annotations.Test;

import com.client.vtiger.generic.baseUtility.BaseClass;
import com.client.vtiger.objectRepository.HomePage;

public class CalendarTest extends BaseClass{
	@Test
	
	public void calendarTest() {
		
		HomePage hp=new HomePage(driver);
		hp.getcalendarimg().click();
		
	}

}
