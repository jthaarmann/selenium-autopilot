package com.jth.autopilot.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutopilotUtils {

	public static WebDriver getWebDriver() {
		return AutopilotWebDriver.CHROME.getWebDriver();
	}
	
	public static void quit(){
		getWebDriver().quit();
	}
	
	public static void enterText(PageElement pageElement, String text){
		getWebDriver().findElement(By.cssSelector(pageElement.getCssSelector())).sendKeys(text);
	}
	
	public static String findText(PageElement pageElement){
		return getWebDriver().findElement(By.cssSelector(pageElement.getCssSelector())).getText();
	}
	
	public static void navigateToUrl(String url){
		getWebDriver().get(url);
	}
	
	public static void click(PageElement pageElement){
		getWebDriver().findElement(By.cssSelector(pageElement.getCssSelector())).click();
	}
	
}
