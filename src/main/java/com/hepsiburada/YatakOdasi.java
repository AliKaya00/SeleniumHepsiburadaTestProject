package com.hepsiburada;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class YatakOdasi extends BasePageHepsiburada {


    By yatakOdasiVerifyLocator = By.xpath("//h1[contains(text(),'Yatak Odası Takımları ve Modelleri')]");

    public YatakOdasi(WebDriver driver) {
        super(driver);

    }

    public boolean isOnYatakOdasiPage() {
        return isDisplayed(yatakOdasiVerifyLocator);
    }
}