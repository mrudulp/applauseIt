package com.applause.auto.pageframework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.applause.auto.pageframework.utils.Waiter;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SearchResults {

	@AndroidFindBy(id = "com.wholefoods.wholefoodsmarket:id/searchResultsNumber")
    private WebElement searchResultCount;

	private AppiumDriver driver;

	public SearchResults(AppiumDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		Waiter.waitForElementToBePresentable(driver, searchResultCount);
		getResultCount();
	}

	public int getResultCount()
	{
		String resultText = searchResultCount.getText();
	    System.out.println("Results are " + resultText);
	    return Integer.parseInt(resultText);
	}

}
