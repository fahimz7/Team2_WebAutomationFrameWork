package TestHome;

import home.HomePage;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;

public class TestHomePage extends HomePage {
    static HomePage homepage;

    //PageFactory
    public void getInItElements(){
        homepage= PageFactory.initElements(driver,HomePage.class);
    }

    @Test
    public void testMainPageHamburgerMenu() throws InterruptedException {
        getInItElements();
        getMainPageHamburgerMenu().click();
        sleepFor(5);
    }

    @Test
    public void testInvesting() throws InterruptedException {
        getInItElements();
        getMainPageHamburgerMenu().click();
        getInvesting().click();
        sleepFor(5);
    }

    @Test
    public void testSliderCheckingAccounts() throws InterruptedException {
        getInItElements();
        getSliderCheckingAccounts().click();
        sleepFor(5);
    }

    @Test
    public void testSliderCFreeCreditScore() throws InterruptedException {
        getInItElements();
        getSliderCFreeCreditScore().click();
        sleepFor(5);
    }

    @Test
    public void testSliderFindACredditCard() throws InterruptedException {
        getInItElements();
        getSliderFindACredditCard().click();
        sleepFor(2);
    }



    @Test
    public void testATMandBranch() throws InterruptedException {
        getInItElements();
        getMainPageHamburgerMenu().click();
        getATMandBranch().click();
        sleepFor(2);
    }

    @Test
    public void testMainPageHomeMenu() throws InterruptedException {
        getInItElements();
        getMainPageHamburgerMenu().click();
        getMainPageHomeMenu().click();
        sleepFor(2);
    }

    @Test
    public void testMainPageSignIn() throws InterruptedException {
        getInItElements();
        getMainPageHamburgerMenu().click();
        getMainPageSignIn().click();
        sleepFor(2);
    }
    @Test
    public void testFreeCreditScore() throws InterruptedException {
        getInItElements();
        getMainPageHamburgerMenu().click();
        getFreeCreditScore().click();
        sleepFor(2);
    }

    @Test
    public void testNewsAndStories() throws InterruptedException {
        getInItElements();
        getMainPageHamburgerMenu().click();
        getNewsAndStories().click();
        sleepFor(2);
    }

    @Test
    public void testCreditCards() throws InterruptedException {
        getInItElements();
        getMainPageHamburgerMenu().click();
        getCreditCards().click();
        sleepFor(2);
    }

    @Test
    public void testCheckingAccounts() throws InterruptedException {
        getInItElements();
        getMainPageHamburgerMenu().click();
        getCheckingAccounts().click();
        sleepFor(2);
    }

    @Test
    public void testSavingsAccounts() throws InterruptedException {
        getInItElements();
        getMainPageHamburgerMenu().click();
        getSavingsAccounts().click();
        sleepFor(2);
    }

    @Test
    public void testCDs() throws InterruptedException {
        getInItElements();
        getMainPageHamburgerMenu().click();
        getCDs().click();
        sleepFor(2);
    }

    @Test
    public void testCarBuyingAndLoans() throws InterruptedException {
        getInItElements();
        getMainPageHamburgerMenu().click();
        getCarBuyingAndLoans().click();
        sleepFor(2);
    }

    @Test
    public void testHomeEquity() throws InterruptedException {
        getInItElements();
        getMainPageHamburgerMenu().click();
        getHomeEquity().click();
        sleepFor(2);
    }

    @Test
    public void testMortgage() throws InterruptedException {
        getInItElements();
        getMainPageHamburgerMenu().click();
        getMortgage().click();
        sleepFor(5);
    }

    @Test
    public void testSliderHomeLending() throws InterruptedException {
        getInItElements();
        getMainPageHamburgerMenu().click();
        getSliderHomeLending().click();
        sleepFor(5);
    }

    @Test
    public void testSliderCarBuyingAndLoad() throws InterruptedException {
        getInItElements();
        getMainPageHamburgerMenu().click();
        getSliderCarBuyingAndLoad().click();
        sleepFor(5);
    }
}

