package com.hepsiburada;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCart extends BasePageHepsiburada {

    By cartLocator = By.id("addToCart");
    By cartPageVerifyLocator = By.xpath(".//*[contains(@fill,'#5AD363')]");
    By cartPageVerifyLocator2 = By.xpath("//span[contains(text(),'Ürün sepetinizde')]");
    By cartPageVerifyLocator3 = By.xpath(".//*[contains(@fill,'#439E4A')]");
    By cartPageVerifyLocator4 = By.cssSelector("svg");


    public AddToCart(WebDriver driver) {
        super(driver);

    }

    public void clickToCart() {
        scroll(cartLocator);
        click(cartLocator);
    }
    public boolean isAddedToCart(){
        return isDisplayed(cartPageVerifyLocator4);
    }
}



