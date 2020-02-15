package home.webelement;

import common.WebAPI;

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
}
