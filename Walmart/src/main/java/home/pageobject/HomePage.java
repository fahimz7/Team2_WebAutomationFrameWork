package home.pageobject;

import common.WebAPI;
import home.webelement.WebElementHomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

    public class HomePage extends WebAPI {

        // All the Home Page Action Methods comes on this class

        @FindBy(how = How.XPATH, using = WebElementHomePage.webElementSearchBox)
        public static WebElement searchBox;


        @FindBy(how = How.XPATH, using = WebElementHomePage.webElementSearchButton)
        public static WebElement searchButton;


        @FindBy(how = How.XPATH, using = WebElementHomePage.webElementGroceryButton)
        public static WebElement GroceryButton;

        @FindBy(how = How.XPATH, using = WebElementHomePage.webElementAccountButton)
        public static WebElement AccountButton;

        @FindBy(how = How.XPATH, using = WebElementHomePage.webElementStoresLocationButton)
        public static WebElement StoresLocationButton;


        public static WebElement getSearchBox(){
            return searchBox;
        }

        public static WebElement getSearchButton(){
            return searchButton;
        }

        public static void doSearch(String value){
            getSearchBox().sendKeys(value);
        }

        public static void doSearchButton() {
           getSearchButton().click();
       }


        public static WebElement getGroceryButton() {
            return GroceryButton;
        }

        public static void doSearchGrocery() {
            getGroceryButton().click();
        }

        public static WebElement getAccountButton() {
            return AccountButton;
        }

        public static void doSearchAccount() {
            getAccountButton().click();
        }

        public static WebElement getStoresLocationButton() {
            return StoresLocationButton;
        }

        public static void doSearchStoresLocation() {
            getStoresLocationButton().click();
        }


    }
