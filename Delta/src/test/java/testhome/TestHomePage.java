package testhome;

import common.WebAPI;

import home.pageobject.HomePage;
import io.cucumber.java.sl.In;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestHomePage extends HomePage{


    public void getInItElements(){PageFactory.initElements(driver,HomePage.class);

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
//        @Test(priority = 1)
//        public void testSearchCreditCards() throws InterruptedException{
//        getInItElements();
//        doSearchCreditCards();
//        Thread.sleep(3000);
//        }
        @Test(priority = 1)
    public void testSignUpPage() throws InterruptedException{
        xPathClick(signUp);
        sleepFor(3);
        xPathClick(signUpFirstName);
        Thread.sleep(2000);
        xPathSendKey(signUpFirstName, "Fahim");
        xPathClick(signUpLastName);
        xPathSendKey(signUpLastName,"Zaman");
        Thread.sleep(3000);
        xPathClick(clickGender);
        xPathClick(clickMale);
        Thread.sleep(3000);
        scrollUpDown(200);
        sleepFor(3);
        xPathClick(clickMonth);
        xPathClick(clickMarch);
        sleepFor(3);
        xPathClick(clickDayOfBirthButton);
        xPathClick(clickBirthDay);
        sleepFor(3);
        xPathClick(clickYearButton);
        xPathClick(clickYearDate);
        sleepFor(2);
        xPathClick(clickAddressTypeButton);
        xPathClick(clickAddressType);
        sleepFor(2);
        xPathSendKey(enterAddress,"965 TINTON AVE APT 1");
        xPathSendKey(enterCity,"BRONX");
        sleepFor(3);
        xPathClick(clickStateButton);
        xPathClick(clickState);
        sleepFor(3);
        xPathSendKey(enterPostalCode,"10029");
        sleepFor(2);
        xPathSendKey(enterAreaCode,"718");
        xPathSendKey(enterPhoneNumber,"523-3747");
        sleepFor(3);
        xPathSendKey(enterEmail,"fzaman@gmail.com");
        xPathSendKey(confirmEmail,"fzaman@gmail.com");
        sleepFor(3);
        xPathSendKey(enterUserName,"fahimQA");
        xPathSendKey(enterPassword,"fahim1234");
        sleepFor(3);
        xPathSendKey(confirmPassword,"fahim1234");
        xPathClick(selectQuestion1Button);
        xPathClick(selectFirstQuestion);
        xPathSendKey(enterFirstAnswer,"Aroz");
        sleepFor(3);
        xPathClick(selectQuestion2Button);
        xPathClick(selectSecondQuestion);
        xPathSendKey(enterSecondAnswer,"Bangladesh");
        sleepFor(3);
        }

}
