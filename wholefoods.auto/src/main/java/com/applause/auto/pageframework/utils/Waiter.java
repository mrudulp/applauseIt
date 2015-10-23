package com.applause.auto.pageframework.utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Waiter {

    public static void waitForElementToBeClickable(RemoteWebDriver driver, WebElement elementToBeWaitedFor)
    {
        waitForElementToBeClickable(driver,elementToBeWaitedFor,1500);
    }

    public static void waitForElementToBeClickable(RemoteWebDriver driver, WebElement elementToBeWaitedFor, int sleepTime)
    {
        //WebDriverWait wait = new WebDriverWait(driver, 1000, sleepTime);
        WebDriverWait wait = new WebDriverWait(driver, sleepTime);
        wait.until(ExpectedConditions.elementToBeClickable(elementToBeWaitedFor));
    }
    public static void waitForElementToBePresentable(RemoteWebDriver driver, WebElement elementToBeWaitedFor)
    {
        waitForElementToBePresentable(driver, elementToBeWaitedFor, 1500);
    }

    public static void waitForElementToBePresentable(RemoteWebDriver driver, WebElement elementToBeWaitedFor, int sleepTime)
    {
        //WebDriverWait wait = new WebDriverWait(driver, 1000, sleepTime);
        WebDriverWait wait = new WebDriverWait(driver, sleepTime);
        wait.until(ExpectedConditions.visibilityOf(elementToBeWaitedFor));
    }
}
