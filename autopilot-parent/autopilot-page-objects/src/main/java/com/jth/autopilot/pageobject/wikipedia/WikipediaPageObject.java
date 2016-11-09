package com.jth.autopilot.pageobject.wikipedia;

import com.jth.autopilot.core.AutopilotUtils;

public class WikipediaPageObject {

	public String getSearchResultHeading() {
		return AutopilotUtils.findText(WikipediaPageElement.SEARCH_RESULT_HEADING);
	}
	
	public void setSearchBox(String text) {
		AutopilotUtils.enterText(WikipediaPageElement.SEARCH_BOX, text);
	}
	
	public void clickSeachButton() {
		AutopilotUtils.click(WikipediaPageElement.SEARCH_BUTTON);
	}

	public void navigateToWikipedia(String url) {
		AutopilotUtils.navigateToUrl(url);
	}
}
