package home.pageobject;

import home.webelement.WebElementHomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import javax.swing.*;

public class HomePage extends WebElementHomePage {

    @FindBy(how = How.XPATH, using = WebElementHomePage.WebElementSearchButton)
    public static WebElement searchButton;

    public static WebElement getSearchButton(){
        return searchButton;
    }

    @FindBy(how = How.XPATH, using = WebElementHomePage.WebElemntSearchBox)
    public static WebElement searchBox;

    public static WebElement getSearchBox(){
        return searchBox;
    }
    public static void clickSearchButton() throws InterruptedException {
        getSearchButton().click();
    }
    public static void writeSearchBox() throws InterruptedException {
        getSearchBox().sendKeys("Credit Card");

    }

}
