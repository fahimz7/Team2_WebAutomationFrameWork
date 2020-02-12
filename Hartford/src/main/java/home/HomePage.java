package home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends WebAPI {

    // All the Home Page Action Methods comes on this class

    @FindBy(how = How.ID_OR_NAME, using = WebElementHomePage.webElementSearchBox)
    public static WebElement searchBox;


    @FindBy(how = How.ID_OR_NAME, using = WebElementHomePage.webElementSearchButton)
    public static WebElement searchButton;


    public static WebElement getSearchBox(){
        return searchBox;
    }

    public static WebElement getSearchButton(){
        return searchButton;
    }

    public static void doSearch(String value){
        getSearchBox().sendKeys(value);
    }




}

