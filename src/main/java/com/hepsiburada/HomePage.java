package com.hepsiburada;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePageHepsiburada {

    By evYasamLocator = By.xpath("//span[contains(text(),'Ev, Yaşam, Kırtasiye, Ofis')]");
    By yatakOdasiLocator = By.xpath("//span[contains(text(),'Yatak Odası')]");


    public HomePage(WebDriver driver) {
        super(driver);
    }


    public void selectYatakOdasi() {

        click(evYasamLocator);
        scroll(evYasamLocator);
        click(yatakOdasiLocator);

    }

}


