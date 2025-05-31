package com.vtiger.SmokeTest;

import org.testng.annotations.Test;

import com.client.vtiger.generic.baseUtility.BaseClass;
import com.client.vtiger.objectRepository.HomePage;

public class ProductsLinkTest extends BaseClass{
	
	@Test
	public void productsLinkTest() {
		HomePage hp = new HomePage(driver);
		hp.getproductlink().click();
		
	}

}
