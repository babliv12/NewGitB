package com.vtiger.SmokeTest;

import org.testng.annotations.Test;

import com.client.vtiger.generic.baseUtility.BaseClass;
import com.client.vtiger.objectRepository.HomePage;

public class DashboardLinkTest extends BaseClass{
	
	@Test
	
	public void dashboardLinkTest() {
		
		HomePage hp = new HomePage(driver);
		hp.getdashboardlink().click();
	}

}
