package com.jth.autopilot.test.wikipedia;

import static org.junit.Assert.assertEquals;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.jth.autopilot.core.test.AutopilotTest;
import com.jth.autopilot.pageobject.wikipedia.WikipediaPageObject;

public class WikipediaSearchTest extends AutopilotTest{

	private static final String WIKIPEDIA_SEARCH_RESULT_HEADING = "wikipedia.search.result.heading";
	private static final String WIKIPEDIA_SEARCH_TERM = "wikipedia.search.term";
	private static final String WIKIPEDIA_URL = "wikipedia.url";
	
	private WikipediaPageObject wikipediaPageObject;
	
	@BeforeClass
	public void beforeClass(){
		wikipediaPageObject = new WikipediaPageObject();
	}
	
	@Test
	public void testSearchButton() {
		wikipediaPageObject.navigateToWikipedia(getTestData(WIKIPEDIA_URL));
		wikipediaPageObject.setSearchBox(getTestData(WIKIPEDIA_SEARCH_TERM));
		wikipediaPageObject.clickSeachButton();
		
		assertEquals(getTestData(WIKIPEDIA_SEARCH_RESULT_HEADING),wikipediaPageObject.getSearchResultHeading());
	}
}
