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
}
