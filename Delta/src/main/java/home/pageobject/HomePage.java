package home.pageobject;

import common.WebAPI;
import home.webelement.WebElementHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends WebElementHomePage {


    @FindBy(how = How.XPATH, using = WebElementHomePage.webElementOnBoardExperience)
    public static WebElement onBoardExperience;

    public static WebElement getOnBoardExperience() {
        return onBoardExperience;
    }

    @FindBy(how = How.XPATH, using = WebElementHomePage.webElementClickTravelInfo)
    public static WebElement clickTravelInfo;

    public static WebElement getClickTravelInfo() {

        return clickTravelInfo;
    }

    public static void doClickOnBoardExperience() {
        Actions actions = new Actions(driver);
        WebElement target = driver.findElement(By.xpath(webElementOnBoardExperience));
        actions.moveToElement(target).perform();

    }

    @FindBy(how = How.XPATH, using = WebElementHomePage.webElementSearchButton)
    public static WebElement clickSearchButton;

    @FindBy(how = How.XPATH, using = WebElementHomePage.webElementSearchBox)
    public static WebElement writeSearchBox;

    public static WebElement getWriteSearchBox(){
        return writeSearchBox;
    }
    public static void doClickSearchButtonAndWrite() throws InterruptedException {
        driver.findElement(By.xpath(webElementSearchButton)).click();
        driver.findElement(By.xpath(webElementSearchBox)).sendKeys("flights", Keys.ENTER);
        Thread.sleep(3000);
        //driver.findElement(By.xpath(webElementSearchBoxButton)).click();
    }
    @FindBy(how = How.XPATH, using = WebElementHomePage.flightStatus)
    public static WebElement clickFlightStatus;

    public static WebElement getClickFlightStatus(){
        return clickFlightStatus;
    }
    public static void doClickFlightStatus() throws InterruptedException{
       //driver.findElement(By.xpath(flightStatus)).click();
        getClickFlightStatus().click();
    }
    @FindBy(how = How.XPATH, using = WebElementHomePage.skyMiles)
    public static WebElement hoverSkyMiles;

    @FindBy(how = How.XPATH, using = WebElementHomePage.knowSkyMiles)
    public static WebElement clickKnowSkyMiles;

    @FindBy(how = How.XPATH, using = WebElementHomePage.skyMilesOptions)
    public static WebElement clickSkyMilesOptions;

    @FindBy(how = How.XPATH, using = WebElementHomePage.howToEarnMiles)
    public static WebElement clickHowToEarnMiles;

    @FindBy(how = How.XPATH, using = WebElementHomePage.airlinePartners)
    public static WebElement clickAirlinePartners;

    public static WebElement getHoverSkyMiles(){
        return hoverSkyMiles;
    }
    public static WebElement getClickKnowSkyMiles(){return clickKnowSkyMiles;}
    public static WebElement getClickSkyMilesOptions(){return clickSkyMilesOptions;}
    public static WebElement getClickHowToEarnMiles(){return clickHowToEarnMiles;}
    public static WebElement getClickAirlinePartners(){return clickAirlinePartners;}

    public static void doHoverSkyMiles() throws InterruptedException {
        Actions actions=new Actions(driver);
        WebElement target=driver.findElement(By.xpath(skyMiles));
        actions.moveToElement(target).perform();
        getClickKnowSkyMiles().click();
        Thread.sleep(2000);
        getClickSkyMilesOptions().click();
        Thread.sleep(2000);
        getClickHowToEarnMiles().click();
        Thread.sleep(2000);
        getClickAirlinePartners().click();
    }
    @FindBy(how = How.XPATH, using = WebElementHomePage.deltaSearchButton)
    public static WebElement clickDeltaSearchButton;

    @FindBy(how = How.XPATH, using = WebElementHomePage.deltaSearchBox)
    public static WebElement typeDeltaSearchBox;

    @FindBy(how = How.XPATH, using = WebElementHomePage.skyMilesCreditCard)
    public static WebElement clickSkyMilesCreditCard;

    @FindBy(how= How.XPATH, using =WebElementHomePage.getToKnowSkyMiles)
    public static WebElement clickGetToKnowSkyMiles;

    @FindBy(how = How.XPATH, using = WebElementHomePage.deltaSkyMilesAmex)
    public static WebElement clickDeltaSkySmilesAmex;

    @FindBy(how = How.XPATH, using = WebElementHomePage.personalCards)
    public static WebElement clickPersonalCards;

    public static WebElement getClickDeltaSearchButton(){return clickDeltaSearchButton;}
    public static WebElement getTypeDeltaSearchBox(){return typeDeltaSearchBox;}
    public static WebElement getClickSkyMilesCreditCard(){return clickSkyMilesCreditCard;}
    public static WebElement getClickGetToKnowSkyMiles(){return clickGetToKnowSkyMiles;}
    public static WebElement getClickDeltaSkySmilesAmex(){return  clickDeltaSkySmilesAmex;}
    public static WebElement getClickPersonalCards(){return  clickPersonalCards;}

    public static void doSearchCreditCards() throws InterruptedException{
        getClickDeltaSearchButton().click();
        getTypeDeltaSearchBox().sendKeys("credit card", Keys.ENTER);
        driver.navigate().back();
        Actions actions=new Actions(driver);
        WebElement target=driver.findElement(By.xpath(skyMiles));
        actions.moveToElement(target).perform();
        getClickSkyMilesCreditCard().click();
        Thread.sleep(2000);
        getClickGetToKnowSkyMiles().click();
        Thread.sleep(2000);
        getClickDeltaSkySmilesAmex().click();
        Thread.sleep(3000);
        getClickPersonalCards().click();

    }

}

