package home.pageobject;

<<<<<<< HEAD:Chase/src/main/java/home/pageobject/HomePage.java
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

=======
public class AboutPage {
>>>>>>> 9af296754be7a2d331e87728a284512b098e5563:Walmart/src/main/java/home/pageobject/AboutPage.java
}
