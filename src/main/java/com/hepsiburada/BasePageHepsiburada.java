package com.hepsiburada;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class BasePageHepsiburada {

    WebDriver driver;

    FluentWait<WebDriver> wait;


    public BasePageHepsiburada(WebDriver driver)     {
        this.driver = driver;
        wait = new FluentWait<>(driver);
        wait.withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofMillis(1000))
                .ignoring(NoSuchElementException.class);

    }

    public List<WebElement> findElements(By locator) {
        return driver.findElements(locator);

    }
    public WebElement find(By locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

    }

    public void click(By locator){
        find(locator).click();
    }
    public void scroll(By locator){
        Actions actions = new Actions(driver);
        actions.moveToElement(find(locator)).build().perform();
    }

    public Boolean isDisplayed(By locator) {
        return find(locator).isDisplayed();

    }
    public void swicthToTabs(){
        ArrayList<String> newTab = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(newTab.get(1));


    }
}

