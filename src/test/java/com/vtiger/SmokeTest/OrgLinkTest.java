package com.vtiger.SmokeTest;

import org.testng.annotations.Test;

import com.client.vtiger.generic.baseUtility.BaseClass;
import com.client.vtiger.objectRepository.HomePage;

public class OrgLinkTest extends BaseClass {
	@Test
	public void orgLinkTest() {
		
		HomePage hp=new HomePage(driver);
		hp.getorglink().click();
		
		
		
		
	}

}
