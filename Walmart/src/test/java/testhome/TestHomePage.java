package testhome;

import home.pageobject.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestHomePage extends HomePage {
    static HomePage homepage;



    //PageFactory
    public void getInItElements() {
        homepage = PageFactory.initElements(driver, HomePage.class);
    }
//    @Test(priority = 1)
//    public void testDoSearch() {
//        getInItElements();
//        homepage.doSearch("boost mobile phones");
//    }
//    @Test(priority = 2)
//    public void testDoSearchForTshirt() {
//        getInItElements();
//        homepage.doSearch("t-shirt");
//    }
//    @Test(priority = 3)
//    public void testDoSearchButton() {
//        getInItElements();
//        homepage.doSearchButton();
//    }
//    @Test(priority = 4)
//    public void testDoGroceryButton() {
//        getInItElements();
//        homepage.doSearchGrocery();
//    }
//    @Test(priority = 5)
//    public void testDoAccountButton() {
//        getInItElements();
//        homepage.doSearchAccount();
//    }
//    @Test(priority = 6)
//    public void testDoStoresLocationButton() {
//        getInItElements();
//        homepage.doSearchStoresLocation();
//    }
//    @Test(priority = 7)
//    public void testDoAllDepartmentsButton() throws InterruptedException {
//        getInItElements();
//        homepage.doSearchAllDepartmentsButton();
//
//    }
    @Test(priority = 8)
    public void testDoAutoAndTire() throws InterruptedException {
        getInItElements();
        doSearchAllDepartmentsButton();
        sleepFor(2);
        doAutoAndTire();
        sleepFor(2);
    }


    @Test(priority = 9)
    public void testDoBabyButton() throws InterruptedException{
        getInItElements();
        doSearchAllDepartmentsButton();
        sleepFor(2);
        doSearchBabyButton();
        sleepFor(2);
    }
   @Test(priority = 10)
    public void testDoBeautyButton() throws InterruptedException {
        getInItElements();
        doSearchAllDepartmentsButton();
        sleepFor(2);
        doSearchBeautyButton();
        sleepFor(2);
    }
    @Test(priority = 11)
    public void testDoHomeButton() throws InterruptedException {
        getInItElements();
        doSearchAllDepartmentsButton();
        sleepFor(2);
        doSearchHomeButton();
        sleepFor(2);
    }
    @Test(priority = 12)
    public void testDoMusicButton() throws InterruptedException {
        getInItElements();
        doSearchAllDepartmentsButton();
        sleepFor(2);
        doSearchMusicButton();
        sleepFor(2);
    }
    @Test(priority = 13)
    public void testDoOffice() throws InterruptedException {
        getInItElements();
        doSearchAllDepartmentsButton();
        sleepFor(2);
        doSearchOfficeButton();
        sleepFor(2);
    }
    @Test(priority = 14)
    public void testDoPets() throws InterruptedException {
        getInItElements();
        doSearchAllDepartmentsButton();
        sleepFor(2);
        doSearchPetsButton();
        sleepFor(2);
    }
    @Test(priority = 15)
    public void testDoToys() throws InterruptedException {
        getInItElements();
        doSearchAllDepartmentsButton();
        sleepFor(2);
        doSearchToysButton();
        sleepFor(2);
    }



}