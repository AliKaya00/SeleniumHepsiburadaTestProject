package org.hepsiburada;

import com.hepsiburada.*;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;



public class Test_Add_To_Cart extends BaseTest {

    HomePage homePage;
    SelectProducts selectProducts;
    AddToCart addToCart;
    CartPage cartPage;
    YatakOdasi yatakOdasi;


    @Test
    @Order(1)
    public void selectYatakOdasi() {
        homePage = new HomePage(driver);
        homePage.selectYatakOdasi();
        yatakOdasi = new YatakOdasi(driver);
        yatakOdasi.isOnYatakOdasiPage();
        Assertions.assertTrue(yatakOdasi
                .isOnYatakOdasiPage(), "couldn't find product");

    }

    @Test
    @Order(2)
    public void addRandomProduct() {
        selectProducts = new SelectProducts(driver);
        selectProducts.addCartsToRandomProducts();
        Assertions.assertTrue(selectProducts
                .isOnSelectedProductPage(), "was not on selected product page");

    }

    @Test
    @Order(3)
    public void goToCart() {
        addToCart = new AddToCart(driver);
        addToCart.clickToCart();
        cartPage = new CartPage(driver);
        cartPage.clickGoToCart();
        Assertions.assertTrue(addToCart
                .isAddedToCart(),"couldn't added to cart");

    }

    @Test
    @Order(4)
    public void deleteProductsFromCart() {
        cartPage = new CartPage(driver);
        cartPage.deleteAllProducts();
        Assertions.assertTrue(cartPage
                .isDeletedProducts(), "Products are deleted");

    }
}

//This comment is for new analysis in Sonarqube

