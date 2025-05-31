package com.vtiger.SmokeTest;

import org.testng.annotations.Test;

import com.client.vtiger.generic.baseUtility.BaseClass;
import com.client.vtiger.objectRepository.HomePage;

public class TicketsLinkTest extends BaseClass {
	
	@Test
	
	public void ticketsLinkTest() {
		
		HomePage hp = new HomePage(driver);
		
		hp.getticketslink().click();
		
	}

}
