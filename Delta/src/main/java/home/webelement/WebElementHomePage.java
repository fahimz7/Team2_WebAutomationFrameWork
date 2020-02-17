package home.webelement;

import common.WebAPI;
import org.seleniumhq.jetty9.server.PushBuilder;

public class WebElementHomePage extends WebAPI {
    //Delta travel hover travel info and click on board experience
    public static final String webElementClickTravelInfo="//a[@id='secondary-static-link-0']";
    public static final String webElementOnBoardExperience="//a[@id='headSectab1']";

    //Delta Search button and box
    public static final String webElementSearchButton="//ngc-search[@class='d-none d-lg-block ng-tns-c0-0 ng-star-inserted']//div[@class='search-container d-inline-block float-lg-none']";
    public static final String webElementSearchBox="//*[@id=\"search_input\"]";

    //Delta flight status button
    public static final String flightStatus="//a[@id='headPrimary4']";

    //Delta hover skymiles
    public static final String skyMiles="//*[@id=\"headSectab2\"]";
    public static final String knowSkyMiles="//a[@id='secondary-static-link-0']";
    public static final String skyMilesOptions="//*[@id=\"accordion1\"]/div/div[1]/div/a";
    public static final String howToEarnMiles="//*[@id=\"accordion2\"]/li[2]/div[1]/div/a";
    public static final String airlinePartners="//li[contains(@class,'additional-nav-item')]//a[contains(text(),'Airline Partners')]";

    //Delta Search credit Cards

    public static final String deltaSearchButton="//ngc-search[@class='d-none d-lg-block ng-tns-c0-0 ng-star-inserted']//a[@class='search icon-search-icon circle-outline']";
    public static final String deltaSearchBox="//input[@id='search_input']";
    public static final String skyMilesCreditCard="//*[@id=\"secondary-static-link-5\"]";
    public static final String getToKnowSkyMiles="//*[@id=\"accordion1\"]/div/div[1]/div/a";
    public static final String deltaSkyMilesAmex="//*[@id=\"accordion2\"]/li[5]/div[1]/div/a";
    public static final String personalCards="//*[@id=\"collapseInner4\"]/div/ul/li[2]/a";
    public static final String blueAmexCard="//a[contains(text(),'Delta SkyMiles Blue American Express Card')]";
    public static final String blueAmexRatesAndFees="//*[@id=\"maincontent\"]/div[6]/div/div/div/div[1]/div/div/div/div/div[4]/div/a";
    public static final String applyNowBlueAmex="//*[@id=\"maincontent\"]/div[6]/div/div/div/div[3]/div/div[2]/span/a";
    public static final String enterFirstName="//*[@id=\"first-name-52\"]";
    public static final String enterLastName="//input[@id='last-name-56']";

    //Explore more option from homepage
    public static final String ExploreMore="//*[@id=\"homepage:banner-promoquilt\"]/div/div[4]/div/div/div/div/div/div/a";
    public static final String goldAMexApply="//*[@id=\"Personal\"]/section[4]/div[2]/div/div[1]/div/a";

    //Click Signup
    public static final String signUp="//a[@class='sign-up btn btn-link']";
    public static final String signUpFirstName="//*[@id=\"basicInfoFirstName\"]";
    public static final String signUpLastName="//*[@id=\"basicInfoLastName\"]";
    public static final String clickGender="//span[@id='basicInfoGender-button']//span[@class='ui-icon ui-icon-triangle-1-s']";
    public static final String clickMale="//*[@id=\"ui-id-67\"]";
    public static final String clickMonth="//*[@id=\"basicInfoMob-button\"]/span[1]";
    public static final String clickMarch="/html[1]/body[1]/div[8]/ul[1]/li[4]";
    public static final String clickDayOfBirthButton="//*[@id=\"basicInfoDob-button\"]/span[1]";
    public static final String clickBirthDay="/html[1]/body[1]/div[9]/ul[1]/li[24]";
    public static final String clickYearButton="//*[@id=\"basicInfoYob-button\"]/span[1]";
    public static final String clickYearDate="/html[1]/body[1]/div[10]/ul[1]/li[27]";
    public static final String clickAddressTypeButton="//*[@id=\"aType-1-button\"]/span[1]";
    public static final String clickAddressType="/html[1]/body[1]/div[12]/ul[1]/li[2]";
    public static final String enterAddress="//*[@id=\"addr1-1\"]";
    public static final String enterCity="//*[@id=\"cityCountyWard-1\"]";
    public static final String clickStateButton="//span[@id='stateProv-1-button']//span[@class='ui-icon ui-icon-triangle-1-s']";
    public static final String clickState="/html[1]/body[1]/div[13]/ul[1]/li[41]";
    public static final String enterPostalCode="//*[@id=\"postal-1\"]";

}
