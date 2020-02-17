package testhome;

import common.WebAPI;
import home.pageobject.AboutPage;
import home.pageobject.HomePage;
import io.cucumber.java.sl.In;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestHomePage extends HomePage{


    public void getInItElements(){PageFactory.initElements(driver,HomePage.class);
        PageFactory.initElements(driver,AboutPage.class);

    }
//    @Test(priority = 1)
//    public void testDoClickOnBoardExperience() throws InterruptedException {
//        getInItElements();
//        driver.manage().window().maximize();
//        doClickOnBoardExperience();
//        Thread.sleep(2000);
//        getClickTravelInfo().click();
//        Thread.sleep(3000);
//    }
//        @Test(priority = 2)
//        public void testDoClickSearchButtonAndWrite() throws InterruptedException{
//        getInItElements();
//        doClickSearchButtonAndWrite();
//        Thread.sleep(3000);
//
//        }
//        @Test(priority = 3)
//        public void testFlightSearch() throws InterruptedException{
//        getInItElements();
//        doClickFlightStatus();
//        Thread.sleep(3000);
//        }
//        @Test(priority = 4)
//        public void testHoverSkyMiles() throws InterruptedException{
//        getInItElements();
//        doHoverSkyMiles();
//        Thread.sleep(3000);
//        }
        @Test(priority = 1)
        public void testSearchCreditCards() throws InterruptedException{
        getInItElements();
        doSearchCreditCards();
        Thread.sleep(3000);
        }

}
