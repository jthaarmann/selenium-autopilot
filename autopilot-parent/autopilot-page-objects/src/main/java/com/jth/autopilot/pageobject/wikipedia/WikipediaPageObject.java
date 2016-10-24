package com.jth.autopilot.pageobject.wikipedia;

import com.jth.autopilot.core.AutopilotWebDriver;

public class WikipediaPageObject {

	private AutopilotWebDriver getWebDriver() {
		return AutopilotWebDriver.CHROME;
	}
	
	public String getSearchResultHeading() {
		return getWebDriver().findText(WikipediaPageElement.SEARCH_RESULT_HEADING);
	}
	
	public void setSearchBox(String text) {
		getWebDriver().enterText(WikipediaPageElement.SEARCH_BOX, text);
	}
	
	public void clickSeachButton() {
		getWebDriver().click(WikipediaPageElement.SEARCH_BUTTON);
	}

	public void navigateToWikipedia(String url) {
		getWebDriver().navigateToUrl(url);
	}
}
