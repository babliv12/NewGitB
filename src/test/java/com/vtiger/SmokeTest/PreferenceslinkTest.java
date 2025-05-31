package com.vtiger.SmokeTest;

import org.testng.annotations.Test;

import com.client.vtiger.generic.baseUtility.BaseClass;
import com.client.vtiger.objectRepository.HomePage;

public class PreferenceslinkTest extends BaseClass{
	
	@Test
	public void preferencesLinkTest() {
		
		HomePage hp = new HomePage(driver);
		
		hp.getpreferenceslink();
	}

}
