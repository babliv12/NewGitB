package com.vtiger.IntegrationTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.client.vtiger.generic.baseUtility.BaseClass;
import com.client.vtiger.generic.excelUtility.ExcelUtility;
import com.client.vtiger.objectRepository.CreateNewOrganizationPage;
import com.client.vtiger.objectRepository.HomePage;
import com.client.vtiger.objectRepository.OrganizationInfoPage;
import com.client.vtiger.objectRepository.OrganizationsPage;

public class CreateOrgTest extends BaseClass{
	
	@Test
	public void createNewOrgTest() throws Throwable {
		ExcelUtility eu = new ExcelUtility();
		String orgName= elib.getDataFromExcel("org",1,2)+ jlib.getRandomValue();
		
		HomePage hp = new HomePage(driver);
		hp.getorglink().click();
		
		OrganizationsPage op = new OrganizationsPage(driver);
		op.getCreateNewOrgBtn().click();
		
		CreateNewOrganizationPage cop= new CreateNewOrganizationPage(driver);
		cop.createOrg(orgName);
		
		
		
		// verify header message expected result
		OrganizationInfoPage oip= new OrganizationInfoPage(driver);
		String actOrgName=oip.getHeaderMsg().getText();
		
		SoftAssert sasrt = new SoftAssert();
		
		sasrt.assertEquals(actOrgName, orgName);
		
		
			 
		 String actualOrgName= driver.findElement(By.id("dtlview_Organization Name")).getText();
		 
		 sasrt.assertEquals(actualOrgName, orgName);
		
		
		
					
	}
	

}
