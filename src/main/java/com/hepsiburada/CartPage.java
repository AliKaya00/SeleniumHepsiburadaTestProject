package com.hepsiburada;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePageHepsiburada {
    By cartLocator2 = By.id("shoppingCart");
    By cartLocator3 = By.xpath("//button[contains(text(),'Sepete git')]");
    By selectRemoveAllProductsLocator = By.xpath("//div[@class='delete_all_2uTds']");
    By selectDeleteLocator = By.xpath("//button[normalize-space()='Sil']");
    By deletedLocator = By.xpath("//h1[contains(text(),'Sepetin şu an boş')]");


    public CartPage(WebDriver driver){
        super(driver);
    }
    public void clickGoToCart(){
        if (isDisplayed(cartLocator3))
            click(cartLocator3);
        else click(cartLocator2);
    }
    public void deleteAllProducts(){
        click(selectRemoveAllProductsLocator);
        click(selectDeleteLocator);

    }
    public boolean isDeletedProducts(){
        return isDisplayed(deletedLocator);
    }

}
