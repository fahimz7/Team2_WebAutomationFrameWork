package home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends WebElementHomePage {

@FindBy(how= How.XPATH, using = xPathATMandBranch)
    public static WebElement ATMandBranch;
    public static WebElement getATMandBranch() {
        return ATMandBranch;
    }

    @FindBy (how= How.XPATH, using = xPathMainPageHamburgerMenu)
    public static  WebElement mainPageHamburgerMenu;
    public static WebElement getMainPageHamburgerMenu() {
        return mainPageHamburgerMenu;
    }

    @FindBy (how= How.XPATH, using = xPathInvesting)
    public static  WebElement Investing;
    public static WebElement getInvesting() {
        return Investing;
    }

    @FindBy (how= How.XPATH, using = xPathSliderCheckingAccounts)
    public static  WebElement SliderCheckingAccounts;
    public static WebElement getSliderCheckingAccounts() {
        return SliderCheckingAccounts;
    }

    @FindBy (how= How.XPATH, using = xPathSliderCFreeCreditScore)
    public static  WebElement SliderCFreeCreditScore;
    public static WebElement getSliderCFreeCreditScore() {
        return SliderCFreeCreditScore;
    }

    @FindBy (how= How.XPATH, using = xPathSliderFindACredditCard)
    public static  WebElement SliderFindACredditCard;
    public static WebElement getSliderFindACredditCard() {
        return SliderFindACredditCard;
    }

    @FindBy (how= How.XPATH, using = xPathSliderHomeLending)
    public static  WebElement SliderHomeLending;
    public static WebElement getSliderHomeLending() {
        return SliderHomeLending;
    }

    @FindBy (how= How.XPATH, using = xPathSliderCarBuyingAndLoad)
    public static  WebElement SliderCarBuyingAndLoad;
    public static WebElement getSliderCarBuyingAndLoad() {
        return SliderCarBuyingAndLoad;
    }


    @FindBy (how =How.XPATH, using = xPathMainPageHomeMenu)
    public static WebElement MainPageHomeMenu;
    public static WebElement getMainPageHomeMenu(){
        return MainPageHomeMenu;
    }

    @FindBy (how =How.XPATH, using = xPathMainPageSignIn)
    public static WebElement MainPageSignIn;
    public static WebElement getMainPageSignIn(){
        return MainPageSignIn;
    }

    @FindBy (how =How.XPATH, using = xPathFreeCreditScore)
    public static WebElement FreeCreditScore;
    public static WebElement getFreeCreditScore(){
        return FreeCreditScore;
    }

    @FindBy (how =How.XPATH, using = xPathNewsAndStories)
    public static WebElement NewsAndStories;
    public static WebElement getNewsAndStories(){
        return NewsAndStories;
    }

    @FindBy (how =How.XPATH, using = xPathCreditCards)
    public static WebElement CreditCards;
    public static WebElement getCreditCards(){
        return CreditCards;
    }

    @FindBy (how =How.XPATH, using = xPathCheckingAccounts)
    public static WebElement CheckingAccounts;
    public static WebElement getCheckingAccounts(){
        return CheckingAccounts;
    }

    @FindBy (how =How.XPATH, using = xPathSavingsAccounts)
    public static WebElement SavingsAccounts;
    public static WebElement getSavingsAccounts(){
        return SavingsAccounts;
    }

    @FindBy (how =How.XPATH, using = xPathCDs)
    public static WebElement CDs;
    public static WebElement getCDs(){
        return CDs;
    }

    @FindBy (how =How.XPATH, using = xPathCarBuyingAndLoans)
    public static WebElement CarBuyingAndLoans;
    public static WebElement getCarBuyingAndLoans(){
        return CarBuyingAndLoans;
    }

    @FindBy (how =How.XPATH, using = xPathMortgage)
    public static WebElement Mortgage;
    public static WebElement getMortgage(){
        return Mortgage;
    }

    @FindBy (how =How.XPATH, using = xPathHomeEquity)
    public static WebElement HomeEquity;
    public static WebElement getHomeEquity(){
        return HomeEquity;
    }


}
