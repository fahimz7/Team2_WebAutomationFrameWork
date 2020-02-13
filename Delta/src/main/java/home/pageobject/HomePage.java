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

}

