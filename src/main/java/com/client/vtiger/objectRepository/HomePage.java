package com.client.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(linkText="Organizations")
	private WebElement orglink;
	
	@FindBy (linkText="Contacts")
	private WebElement contactlink;
	
	@FindBy (linkText="Campaigns")
	private WebElement campaignlink;
	
	@FindBy (linkText="Products")
	private WebElement productlink;
	
	@FindBy (linkText="Documents")
	private WebElement documentlink;
	
	@FindBy (linkText="More")
	private WebElement morelink;
	
	@FindBy (xpath="//img[@title='Open Calculator...']")
	private WebElement calculatorimg;
	
	@FindBy (xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement adminImg;
	
	@FindBy (linkText="My Preferences")
	private WebElement preferenceslink;
	
	@FindBy (xpath="//img[@src='themes/softed/images/mainSettings.PNG']")
	private WebElement settingsimg;
	
	@FindBy(linkText="CRM Settings")
	private WebElement settingslink;
	
	@FindBy (linkText="Email")
	private WebElement emaillink;
	
	@FindBy (linkText="Trouble Tickets")
	private WebElement ticketslink;
	
	@FindBy (linkText="Leads")
	private WebElement leadslink;
	
	@FindBy(linkText="Sign Out")
	private WebElement signOutLink;
	
	@FindBy (linkText="Dashboard")
	private WebElement dashboardlink;
	
	@FindBy (xpath="//img[@src='themes/softed/images/btnL3Calendar.gif']")
	private WebElement calendarimg;
	
	@FindBy (xpath="//img[@src='themes/softed/images/btnL3Clock.gif']")
	private WebElement clockimg;
	
	@FindBy (xpath="//img[@src='themes/softed/images/btnL3Clock.gif']")
	private WebElement chatimg;
	
	@FindBy (linkText="Opportunities")
	private WebElement opportunitieslink;
	
	
	
	public WebElement getorglink() {
		return orglink;
	}

	public WebElement getcontactlink() {
		return contactlink;
	}
		
		public WebElement getcampaignlink() {
			return campaignlink;
		}
		
		public WebElement getproductlink() {
			return productlink;
			
		}
		
		public WebElement getcalculatorimg() {
			return calculatorimg;
		}
			
			public WebElement getdocumentlink() {
				return documentlink;
			
		}
			
			public WebElement getpreferenceslink() {
				return preferenceslink;
			}
			
		public WebElement getmorelink() {
			return morelink;
			
		}
		
		public WebElement emaillink() {
			return emaillink;
		}
			public WebElement getsettingsimg() {
				return settingsimg;
			}
		
			public WebElement getsettingslink() {
				return settingslink;
			}
			
			public WebElement getticketslink() {
				return ticketslink;
			}
			
			public WebElement getdashboardlink() {
				return dashboardlink;
			}
			public WebElement getleadslink() {
				return leadslink;
			}
			
			public WebElement getcalendarimg() {
				return calendarimg;
			}
			
			public WebElement getclockimg() {
				return clockimg;
			}
			
			public WebElement getchatimg() {
				return chatimg;
			}
			
			public WebElement getopportunitieslink() {
				return opportunitieslink;
			}
	
	public void navigateToCampaignPage() {
		Actions act = new Actions (driver);
		act.moveToElement(morelink).perform();
		campaignlink.click();
		
	}
	
	
	public void preferences() {
		Actions act = new Actions (driver);
		act.moveToElement(adminImg).perform();
		preferenceslink.click();
	}
	
	public void settings() {
		Actions act = new Actions (driver);
		act.moveToElement(settingsimg).perform();	
		settingslink.click();
		
	}
	
	public void logout() {
		Actions act = new Actions (driver);
		act.moveToElement(adminImg).perform();
		signOutLink.click();
}

}

