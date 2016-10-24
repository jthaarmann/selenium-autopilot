package com.jth.autopilot.test.wikipedia;

import static org.junit.Assert.assertEquals;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.jth.autopilot.core.test.AutopilotTest;
import com.jth.autopilot.pageobject.wikipedia.WikipediaPageObject;

public class WikipediaSearchTest extends AutopilotTest{

	private WikipediaPageObject wikipediaPageObject;
	
	@BeforeClass
	public void beforeClass(){
		wikipediaPageObject = new WikipediaPageObject();
	}
	
	@Test
	public void testSearchButton() {
		wikipediaPageObject.navigateToWikipedia(getProperty("wikipedia.url"));
		wikipediaPageObject.setSearchBox(getProperty("wikipedia.search.term"));
		wikipediaPageObject.clickSeachButton();
		
		assertEquals(getProperty("wikipedia.search.result.heading"),wikipediaPageObject.getSearchResultHeading());
	}
}
