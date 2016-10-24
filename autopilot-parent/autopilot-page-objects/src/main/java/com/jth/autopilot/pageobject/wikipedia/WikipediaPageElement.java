package com.jth.autopilot.pageobject.wikipedia;

import com.jth.autopilot.core.PageElement;

public enum WikipediaPageElement implements PageElement {
	SEARCH_BOX("#searchInput"),
	SEARCH_BUTTON("#search-form > fieldset > button"),
	SEARCH_RESULT_HEADING("#firstHeading");

	private String cssSelector;
	
	private WikipediaPageElement(String cssSelector){
		this.cssSelector = cssSelector;
	}
	
	public String getCssSelector() {
		return cssSelector;
	}

}
