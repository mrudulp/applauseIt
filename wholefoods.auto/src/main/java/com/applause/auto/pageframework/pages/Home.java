package com.applause.auto.pageframework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.applause.auto.pageframework.utils.Waiter;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Home {
	@AndroidFindBy(id = "com.wholefoods.wholefoodsmarket:id/etHomeSearch")
	private WebElement searchInput;
	@AndroidFindBy(id = "com.wholefoods.wholefoodsmarket:id/recipeSearchClearBtn")
	private WebElement searchClearCrossButton;
	@AndroidFindBy(id = "com.wholefoods.wholefoodsmarket:id/imgSearch")
	private WebElement searchBtn ;

	private AppiumDriver driver;

	public Home(AppiumDriver driver)
	{
		System.out.println("Home created");
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		loadPage();
	}
	public void loadPage()
	{
		Waiter.waitForElementToBeClickable(this.driver, searchInput,4500);
	}

	public SearchResults searchForText(String text)
	{
        searchInput.sendKeys(text);
        Waiter.waitForElementToBeClickable(this.driver, searchClearCrossButton);
        searchBtn.click();
        return new SearchResults(driver);
	}
}
