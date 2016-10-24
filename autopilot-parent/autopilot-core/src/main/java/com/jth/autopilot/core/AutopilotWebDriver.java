package com.jth.autopilot.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public enum AutopilotWebDriver {

	CHROME(new ChromeDriver());
	
	private AutopilotWebDriver(WebDriver webDriver) {
		this.webDriver = webDriver;
	}

	private WebDriver webDriver;

	public WebDriver getWebDriver() {
		return webDriver;
	}
	
	public void quit(){
		getWebDriver().quit();
	}
	
	public void enterText(PageElement pageElement, String text){
		getWebDriver().findElement(By.cssSelector(pageElement.getCssSelector())).sendKeys(text);
	}
	
	public String findText(PageElement pageElement){
		return getWebDriver().findElement(By.cssSelector(pageElement.getCssSelector())).getText();
	}
	
	public void navigateToUrl(String url){
		getWebDriver().get(url);
	}
	
	public void click(PageElement pageElement){
		getWebDriver().findElement(By.cssSelector(pageElement.getCssSelector())).click();
	}
}
