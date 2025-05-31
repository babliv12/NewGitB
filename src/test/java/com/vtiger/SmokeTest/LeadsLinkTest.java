package com.vtiger.SmokeTest;

import org.testng.annotations.Test;

import com.client.vtiger.generic.baseUtility.BaseClass;
import com.client.vtiger.objectRepository.HomePage;

public class LeadsLinkTest extends BaseClass{
	
@Test

public void leadsLinkTest() {
 HomePage hp = new HomePage(driver);
 hp.getleadslink().click();
	
}

}
