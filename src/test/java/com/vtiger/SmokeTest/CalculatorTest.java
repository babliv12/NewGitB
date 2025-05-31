package com.vtiger.SmokeTest;

import org.testng.annotations.Test;

import com.client.vtiger.generic.baseUtility.BaseClass;
import com.client.vtiger.objectRepository.HomePage;

public class CalculatorTest extends BaseClass{
	
	@Test
	
	public void calculatorTest() {
		
		HomePage hp = new HomePage(driver);
		hp.getcalculatorimg().click();
		
	}

}
