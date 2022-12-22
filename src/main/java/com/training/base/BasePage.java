package com.training.base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	WebDriver driver;
	public HashMap<String, By> ObjRep = new HashMap<String, By>();
	
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void addObject(String logicalName, By by) {
		ObjRep.put(logicalName, by);
		
		
	}
	
	public void enterValue(String logicalName, String inputData) {
		WebElement element= getWebElement(logicalName);
		waitforElement(element);
		element.click();
		element.clear();
		element.sendKeys(inputData);
		
	}
	
	

	public void clickElement(String logicalName) {
		WebElement element = getWebElement(logicalName);
		waitforclickElement(element);
		if(element.isDisplayed()) {
		element.click();
		}
		
	}
	
	public void clickElementByJS(String logicalName) {
		WebElement element = getWebElement(logicalName);
		waitforElement(element);
		
		if(element.isDisplayed()) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true);",element);
			js.executeScript("arguments[0].click();",element);
			
		}
		
	}
	
	public void clickElementByActions(String logicalName) {
		WebElement element = getWebElement(logicalName);
		waitforElement(element);
		
		if(element.isDisplayed()) {
			Actions action = new Actions(driver);
			action.moveToElement(element).click().perform();
			
		}
	}
	
	public String getpassworderrmsg(String element) {
		WebElement passworderrmsg = getWebElement(element);
		return passworderrmsg.getText();
	}
	
	
	  public void selectddoption(String elementName,String option) {
	  
	  Select selectdd = new Select(getWebElement(elementName));
	  selectdd.selectByVisibleText(option);
	  
	  }
	 
	
	public void enterIntoTextBox(String logicalName, String InputData) {
		WebElement element= getWebElement(logicalName);
		enterIntoTextBox(element,InputData);
		
	}
	
	

	public void clickCheckBox(String logicalName) {
		WebElement element = getWebElement(logicalName);
		clickCheckBox(element);
		
	}
	
	public String getElementValue(String elementName) {
		waitforElement(getWebElement(elementName));
		WebElement element = getWebElement(elementName);
		return element.getText();
	}
	
	public String getElementValue(String elementName,String prefilledId) {
		if(getWebElement(elementName).isDisplayed()) {
			getWebElement(elementName).click();
		}
		waitforElement(getWebElement(elementName));
		WebElement element = getWebElement(elementName);
		return element.getText();
	}
	
	

	public void clickonButton(String logicalName) {
		WebElement element = getWebElement(logicalName);
		clickonButton(element);
		
	}
	
/*-------------------------------------------------------------*/
	
	private void enterIntoTextBox(WebElement element, String inputData) {
		waitforElement(element);
		element.sendKeys(inputData);
		
	}
	
	private void waitforElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	
	private void waitforclickElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
	}

	private void clickonButton(WebElement element) {
		waitforElement(element);
		element.click();
		
	}

	private void clickCheckBox(WebElement element) {
		waitforElement(element);
		element.click();
		
	}
	private WebElement getWebElement(String logicalName) {
		By by = ObjRep.get(logicalName);
		WebElement element = driver.findElement(by);
		return element;
	}

	public String getTextValue(String elementName) {
		By by = ObjRep.get(elementName);
		WebElement element = driver.findElement(by);
		waitforElement(element);
		if(element.isDisplayed()) {
			return element.getText();
		}
		else 
			return "";
	}

	public List<String> clickElement(String elementName, String menuitems) {
		List<String> elements = new ArrayList<String>();
		WebElement menulink = driver.findElement(ObjRep.get(elementName));
		waitforElement(menulink);
		menulink.click();
		List<WebElement> ddoptions = driver.findElements(ObjRep.get(menuitems));
		for(WebElement item:ddoptions) {
			elements.add(item.getText());
		}
		return elements;
	}

	public void switchtoframe(String frame) {
		
		WebElement frameElement = driver.findElement(ObjRep.get(frame));
		waitforElement(frameElement);
		driver.switchTo().frame(frameElement);
		
	}
	
	public void switchdefault() {
		driver.switchTo().defaultContent();
	}

	public void clickpostElement(String postlink) {
		
		
	}

	public void uploadFile(String chooseFile) {
		WebElement file = driver.findElement(ObjRep.get(chooseFile));
		file.sendKeys("C:\\\\Users\\\\jdman\\\\Documents\\\\testfile.txt");
	}

	public void scrollToElement(String elementName) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		By by = ObjRep.get(elementName);
		WebElement element = driver.findElement(by);
		waitforElement(element);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",element);
	}

	public boolean isElementDisplayed(String tab) {
		By by = ObjRep.get(tab);
		List<WebElement> displayedTabs= driver.findElements(by);
			return displayedTabs.contains(displayedTabs);
		}

	public boolean isElementDisplayed(String tabs, String selected) {
		By by = ObjRep.get(tabs);
		List<WebElement> displayedTabs= driver.findElements(by);
		for(WebElement item:displayedTabs) {
			if(item.getText().equalsIgnoreCase(selected)) {
				
				return true;	
			}			
		}
		return false;
	}

	public void switchToAlert() {
		driver.switchTo().alert().accept();
	}

	public void scrolldown() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
	}

	public boolean isWindowOpened() {
		Iterator<String> it = driver.getWindowHandles().iterator();
		String parent = it.next();
		String child = null;
		boolean isOpened = false;
		while(it.hasNext()) {
			 child = it.next();
		}
		if(child!=null) {
			isOpened = true;
		}
		return isOpened;
	}
	}

	

	


