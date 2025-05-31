package com.client.vtiger.WebDriverUtility;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	public WebDriver driver=null;
	// implicitlyWait....
	public void waitForPageToLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
	}
	
	 // explicit wait for visibility of element....
	public void waitForElementPresent(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(element));	
	}
	
	// explicit wait for element to be clickable....
		public void waitForElementToBeClickable(WebDriver driver, WebElement element) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.elementToBeClickable(element));
		}
		
	// explicit wait to check alert is present....
		public void waitForAlertToBePresent(WebDriver driver, WebElement element) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.alertIsPresent());
		}
		
		// explicit wait to match the title....
				public void waitForTitleIs(WebDriver driver, WebElement element, String title) {
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
				wait.until(ExpectedConditions.titleContains(title));
	}
		
		// maximize window
			 public void maximizeWindow (WebDriver driver) {
				 driver.manage().window().maximize();
			 }
				
		
			 // switching to tab based on URL
	public void switchToTabOnUrl(WebDriver driver, String partialUrl) {
		Set<String> set = driver.getWindowHandles();
		Iterator <String> iterator = set.iterator();
		while(iterator.hasNext()) {
		String windowId = iterator.next();
		driver.switchTo().window(windowId);
		String actUrl = driver.getCurrentUrl();
		if(actUrl.contains(partialUrl)) {
			break;
			}
		}
	}
		
	// switching to tab based on Title
		
		public void switchToTabOnTitle (WebDriver driver, String partialTitle) {
			Set<String> set = driver.getWindowHandles();
			
			Iterator <String> iterator = set.iterator();
			
			while(iterator.hasNext()) {
			
			String windowId = iterator.next();
			
			driver.switchTo().window(windowId);
			
			String actUrl = driver.getCurrentUrl();
			
			if(actUrl.contains(partialTitle)) {
				break;
			}
			
			}
			}
			
		// switching to frame based on index
			public void switchToFrame(WebDriver driver, int index) {
			driver.switchTo().frame(index);
	}
			
			// switching to frame based on name
			public void switchToFrame(WebDriver driver, String nameID) {
			driver.switchTo().frame(nameID);
		
	}
			// switching to frame based on element
		public void switchToFrame(WebDriver driver, WebElement element) {
		driver.switchTo().frame(element);
	}
	
		// switching to alert and accept
		public void switcToAlertAndAccept(WebDriver driver) {
		driver.switchTo().alert().accept();
		
	}
		// switching to alert and dismiss
		public void switcToAlertAndDismiss(WebDriver driver) {
		driver.switchTo().alert().dismiss();
		}
		
		// selecting from dropdown based on text
		public void select(WebElement element, String text) {
			Select sel = new Select(element);
			sel.selectByVisibleText(text);
		}
		
		// selecting from dropdown based on index
		public void select(WebElement element, int index) {
			Select sel = new Select(element);
			sel.selectByIndex(index);	
		}
		
		// mouse action for move to element
		public void mouseMoveOnElement(WebDriver driver, WebElement element) {
		Actions act = new Actions (driver);
		act.moveToElement(element).perform();
		}
		
		// mouse action to double click on element
		public void doubleClick(WebDriver driver, WebElement element) {
			Actions act = new Actions (driver);
			act.doubleClick(element).perform();
		}
		
		// mouse action to double click on element
		public void contextClick(WebDriver driver, WebElement element) {
			Actions act = new Actions (driver);
			act.contextClick(element).perform();
		}
		
		
}	
		
		
		
		
		
	
		
	
	

