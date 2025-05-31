package com.vtiger.SmokeTest;

import org.testng.annotations.Test;

import com.client.vtiger.generic.baseUtility.BaseClass;
import com.client.vtiger.objectRepository.HomePage;

public class DocumentsLinkTest extends BaseClass{
	
	@Test
	
	public void documentLinkTest() {
		
		HomePage hp = new HomePage(driver);
		
		hp.getdocumentlink().click();
	}

}
