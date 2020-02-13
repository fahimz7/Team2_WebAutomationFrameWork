package home.pageobject;

import common.WebAPI;
import home.webelement.WebElementHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends WebElementHomePage {

    // #1
    @FindBy(how = How.XPATH, using = SearchBox)
    public static WebElement searchbox;

    public static WebElement getSearchbox() {
        return searchbox;
    }

    public static void setSearchbox() {
        getSearchbox().sendKeys("zahirul");
    }

    // #2
    @FindBy(how = How.XPATH, using = WirelessButton)
    public static WebElement wirelessButton;

    public static WebElement getWirelessButton() {
        return wirelessButton;
    }

    public static void setWirelessButton() {
        getWirelessButton().click();
    }

    // #3
    @FindBy(how = How.XPATH, using = menuContainerXpath)
    public static WebElement menuContainer;

    public static WebElement getMenuContainer() {
        return menuContainer;
    }

    public static void textMenuContainer() {
        getMenuContainer().isSelected();
        System.out.println(menuContainer.getText());
    }

    @FindBy(how = How.XPATH, using = WebElementHomePage.phoneXpath)
    public static WebElement clickPhoneXPath;

    @FindBy(how= How.XPATH, using =WebElementHomePage.shop) public static WebElement iShop;

    public static WebElement clickShop(){
        return iShop;
    }
    public static WebElement getPhoneXPath(){
        return clickPhoneXPath;
    }

    public static void doClickPhoneXPath() throws InterruptedException{
        driver.findElement(By.xpath(phoneXpath)).click();
        driver.findElement(By.xpath(shop)).click();
    }


}

