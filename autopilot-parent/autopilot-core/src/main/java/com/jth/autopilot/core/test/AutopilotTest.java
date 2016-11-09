package com.jth.autopilot.core.test;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.jth.autopilot.core.AutopilotWebDriver;

public class AutopilotTest {

	private Properties properties;
	
	private void loadProperties() throws IOException {
		properties = new Properties();
		properties.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("local/user.properties"));
		properties.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("local/data.properties"));
		System.out.print(properties);
	}
	
	protected String getTestData(String key){
		return properties.getProperty(key);
	}
	
	@BeforeSuite
	public void beforeSuite() throws IOException{
		loadProperties();
		System.setProperty("webdriver.chrome.driver", Thread.currentThread().getContextClassLoader().getResource("drivers/chromedriver.exe").getPath());
	}
	
	@AfterSuite
	public void afterSuite(){
		for(AutopilotWebDriver autopilotWebDriver : AutopilotWebDriver.values()) {
			autopilotWebDriver.getWebDriver().quit();
		}
	}
	
}
