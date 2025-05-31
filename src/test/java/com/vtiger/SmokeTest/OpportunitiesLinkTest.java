package com.vtiger.SmokeTest;

import org.testng.annotations.Test;

import com.client.vtiger.generic.baseUtility.BaseClass;
import com.client.vtiger.objectRepository.HomePage;

public class OpportunitiesLinkTest extends BaseClass{
	
	@Test 
	public void opportunitiesLinkTest() {
		
		HomePage hp = new HomePage(driver);
		hp.getopportunitieslink().click();
	}

}
