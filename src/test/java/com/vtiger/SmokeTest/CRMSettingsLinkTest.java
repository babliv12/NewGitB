package com.vtiger.SmokeTest;

import org.testng.annotations.Test;

import com.client.vtiger.generic.baseUtility.BaseClass;
import com.client.vtiger.objectRepository.HomePage;

public class CRMSettingsLinkTest extends BaseClass{
	
	@Test
	
	public void settingsTest() {
	
		HomePage hp = new HomePage(driver);
		hp.getsettingsimg().click();
	}

}
