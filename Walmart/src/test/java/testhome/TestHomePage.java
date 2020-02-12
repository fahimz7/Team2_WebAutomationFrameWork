package testhome;

import common.WebAPI;
import home.pageobject.AboutPage;
import home.pageobject.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestHomePage extends WebAPI {
    static HomePage homepage;
    static AboutPage aboutpage;


    //PageFactory
    public void getInItElements() {
        homepage = PageFactory.initElements(driver, HomePage.class);
        aboutpage = PageFactory.initElements(driver, AboutPage.class);


    }

    @Test(priority = 1)
    public void testDoSearch() {
        getInItElements();
        homepage.doSearch("boost mobile phones");
    }


    @Test(priority = 2)
    public void testDoSearchForTshirt() {
        getInItElements();
        homepage.doSearch("t-shirt");
    }

    @Test(priority = 3)
    public void testDoSearchButton() {
        getInItElements();
        homepage.doSearchButton();
    }

    @Test(priority = 4)
    public void testDoGroceryButton() {
        getInItElements();
        homepage.doSearchGrocery();

    }

    @Test(priority = 5)
    public void testDoAccountButton() {
        getInItElements();
        homepage.doSearchAccount();

    }

    @Test(priority = 6)
    public void testDoStoresLocationButton() {
        getInItElements();
        homepage.doSearchStoresLocation();
    }
}