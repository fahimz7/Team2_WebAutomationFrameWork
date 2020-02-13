package home.pageobject;

import common.WebAPI;
import home.webelement.WebElementHomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

    public class HomePage extends WebElementHomePage {

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

        @FindBy(how = How.XPATH, using = WebElementHomePage.webElementAllDepartmentsButton)
        public static WebElement AllDepartmentsButton;

        @FindBy(how = How.XPATH, using = WebElementHomePage.webElementAutoAndTire)
        public static WebElement AutoAndTire;

        @FindBy(how = How.XPATH, using = WebElementHomePage.webElementBabyButton)
        public static WebElement BabyButton;

        @FindBy(how = How.XPATH, using = WebElementHomePage.webElementBeautyButton)
        public static WebElement BeautyButton;

        @FindBy(how = How.XPATH, using = WebElementHomePage.webElementHomeButton)
        public static WebElement HomeButton;

        @FindBy(how = How.XPATH,using = WebElementHomePage.webElementMusicButton)
        public static WebElement MusicButton;

         @FindBy(how = How.XPATH,using = WebElementHomePage.webElementOfficeButton)
         public static WebElement OfficeButton;

        @FindBy(how = How.XPATH,using = WebElementHomePage.webElementPetsButton)
        public static WebElement PetsButton;

        @FindBy(how = How.XPATH,using = WebElementHomePage.webElementToysButton)
        public static WebElement ToysButton;








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

       public static WebElement getAllDepartmentsButton() {
            return AllDepartmentsButton;
       }
       public static void doSearchAllDepartmentsButton() {
            getAllDepartmentsButton().click();
       }

       public static WebElement getAutoAndTireButton() {
            return AutoAndTire;
       }
       public static void doAutoAndTire() {
            getAutoAndTireButton().click();
       }



        public static WebElement getBabyButton() {
            return BabyButton;
       }
       public static void doSearchBabyButton() {
            getBabyButton().click();
       }

       public static WebElement getBeautyButton() {
            return BeautyButton;
       }
       public static void doSearchBeautyButton() {
            getBeautyButton().click();
       }
       public static WebElement getHomeButton() {
            return HomeButton;
       }
       public static void doSearchHomeButton(){
            getHomeButton().click();
       }
        public static WebElement getMusicButton() {
            return MusicButton;
        }
        public static void doSearchMusicButton(){
            getMusicButton().click();
        }
        public static WebElement getOfficeButton(){
            return OfficeButton;
        }
        public static void doSearchOfficeButton(){
            getOfficeButton().click();
        }
        public static WebElement getPetsButton() {
            return PetsButton;
        }
        public static void doSearchPetsButton(){
            getPetsButton().click();
        }
        public static WebElement getToysButton() {
            return ToysButton;
        }
        public static void doSearchToysButton(){
            getToysButton().click();
        }








    }
