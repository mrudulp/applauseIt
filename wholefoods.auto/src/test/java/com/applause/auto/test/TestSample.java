package com.applause.auto.test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.applause.auto.framework.test.BaseAppiumTest;
import com.applause.auto.pageframework.pages.Home;
import com.applause.auto.pageframework.pages.SearchResults;
//import com.applause.auto.pageframework.pages.SearchResults;
import com.applause.auto.pageframework.testdata.TestConstants;

public class TestSample extends BaseAppiumTest {

	private String searchString = "coffee";

	@BeforeMethod(alwaysRun = true)
	public static void testSetup() {
		System.out.println("Before Method");
	}
	
	@Test(groups = { TestConstants.TestNGGroups.REG }, description = "")
	public void testSearchResults() {
		System.out.println("Search Results");
		
		Home hs = new Home(driver);
		
		SearchResults sr = hs.searchForText(searchString);
		Assert.assertTrue(sr.getResultCount() > 0);
		
	}
	
	@AfterClass(alwaysRun = true)
	public static void testCloseDown(){
		driver.quit();
	}
}
