package com.jth.autopilot.core;

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
	
}
