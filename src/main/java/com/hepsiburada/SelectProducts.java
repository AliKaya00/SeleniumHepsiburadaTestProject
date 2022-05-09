package com.hepsiburada;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class SelectProducts extends BasePageHepsiburada {
    //By productLocator = By.id("product-info-button");
    By productNumber = By.cssSelector("div[data-test-id=\"product-info-wrapper\"]");
    By selectProductVerifyLocator = By.xpath("//span[contains(text(),'75 TL üzeri kargo bedava')]");


    public SelectProducts(WebDriver driver) {
        super(driver);
    }
    public void addCartsToRandomProducts() {
        List<WebElement> yatakOdasiProducts = findElements(productNumber);
        Random rnd = new Random();
        WebElement random = yatakOdasiProducts.get(rnd.nextInt(yatakOdasiProducts.size()));
        random.click();
        BasePageHepsiburada basePageHepsiburada = new BasePageHepsiburada(driver);
        basePageHepsiburada.swicthToTabs();


    }

    public boolean isOnSelectedProductPage() {
     return isDisplayed(selectProductVerifyLocator);
    }
}
