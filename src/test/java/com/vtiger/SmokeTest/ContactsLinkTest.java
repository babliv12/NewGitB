package com.vtiger.SmokeTest;

import org.testng.annotations.Test;

import com.client.vtiger.generic.baseUtility.BaseClass;
import com.client.vtiger.objectRepository.HomePage;

public class ContactsLinkTest extends BaseClass {
	@Test
	
	public void contactsLinkTest() {
		HomePage hp =new HomePage(driver);
		hp.getcontactlink().click();
	}

}
