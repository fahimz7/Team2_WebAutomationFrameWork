package home;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends WebElementHomePage {

    // All the Home Page Action Methods comes on this class

    @FindBy(how = How.ID_OR_NAME, using = idwebElementSearchBox)
    public static WebElement searchBox;

    public static WebElement getSearchBox(){

        return searchBox;
    }



    @FindBy(how = How.XPATH, using = xpwebElementSearchButton)
    public static WebElement searchButton;

    public static WebElement getSearchButton(){

        return searchButton;
    }

//    @FindBy(how = How.CSS, using = WebElementHomePage.cssQuoteWebElementSelect)
//    public static WebElement quoteSearchSelect;
//
//    public static WebElement getQuoteSearchSelect(){
//        return quoteSearchSelect;
//    }
//
//    @FindBy(how = How.CSS, using =WebElementHomePage.xPathQuoteWebElementSearchBox)
//    public static WebElement quoteSearchBox;
//
//    public static WebElement getQuoteSearchBox(){
//        return quoteSearchBox;
//    }

//    @FindBy(how = How.CSS, using= WebElementHomePage.cssQuoteWebElementSearchButton)
//    public static WebElement quoteSearchButton;
//
//    public static WebElement getQuoteSearchButton(){
//        return quoteSearchButton;
//    }

    @FindBy(how= How.XPATH,using = xPathMouseHoverAutoTab) public static WebElement mouseHoverAutoTab;

    public static WebElement getMouseHoverAutoTab(){
        return mouseHoverAutoTab; };

    public static void setMouseHoverAutoTab(){
        Actions actions=new Actions(driver);
        WebElement target=driver.findElement(By.xpath(xPathMouseHoverAutoTab));
        actions.moveToElement(target).perform();
    }
    @FindBy(how = How.XPATH, using = xPathselectCarInsurance)
    public static WebElement SelectCarInsurance;


    public static WebElement getSelectCarInsurance(){
        return SelectCarInsurance;
    }
    //@FindBy(how = How.XPATH, using = xPathCaptureTextCarInsurance)
    //public static WebElement CaptureTextCarInsurance;

    //public static WebElement getCaptureTextCarInsurance(){
       // return CaptureTextCarInsurance;

    //}

    @FindBy(how = How.XPATH, using = xPathSelectClassicCarInsurance)
    public static WebElement SelectClassicCarInsurance;

    public static WebElement getSelectClassicCarInsurance(){
        return SelectClassicCarInsurance;
    }

    @FindBy(how = How.LINK_TEXT, using = linkTextSelectAllVehical)
    public static WebElement SelectAllVehical;

    public static WebElement getSelectAllVehical(){
        return SelectAllVehical;
    }
//    @FindBy(how= How.XPATH,using = xPathMouseHoverAutoTab) public static WebElement mouseHoverAutoTab;
//
//    public static WebElement getMouseHoverAutoTab(){
//        return mouseHoverAutoTab; };
//
//    public static void setMouseHoverAutoTab(){
//        Actions actions=new Actions(driver);
//        WebElement target=driver.findElement(By.xpath(xPathMouseHoverAutoTab));
//        actions.moveToElement(target).perform();
//    }
//    @FindBy(how = How.XPATH, using = xPathselectCarInsurance)
//    public static WebElement SelectCarInsurance;
//
//
//    public static WebElement getSelectCarInsurance(){
//        return SelectCarInsurance;

    @FindBy(how = How.XPATH,using = xPathMouseHoverHomeTab) public static WebElement mouseHoverHomeTab;

    public static WebElement getMouseHoverHomeTab(){
        return mouseHoverHomeTab;};

    public static void setMouseHoverHomeTab(){
        Actions actions = new Actions(driver);
        WebElement target = driver.findElement(By.xpath(xPathMouseHoverHomeTab));
        actions.moveToElement(target).perform();
    }

    @FindBy(how= How.XPATH, using = xPathSelectHomeOwnerInsurance)
    public static WebElement SelectHomeOwnerInsurance;

    public static WebElement getSelectHomeOwnerInsurance(){
        return SelectHomeOwnerInsurance;
    }

    @FindBy(how = How.XPATH, using = xPathMainLogo)
    public static WebElement mainLogo;

    public static WebElement getMainLogo(){
        return mainLogo;
    }

    @FindBy(how = How.XPATH, using = xPathBottomTabCarInsurance)
    public static WebElement bottomTabCarInsurance;

    public static WebElement getBottomTabCarInsurance(){
        return bottomTabCarInsurance;
    }

    @FindBy(how = How.XPATH, using = xPathBottomTabHomeInsurance)
    public static WebElement bottomTabHomeInsurance;

    public static WebElement getBottomTabHomeInsurance(){
        return bottomTabHomeInsurance;
    }

    @FindBy(how= How.XPATH, using = xPathBottomTabBusinessInsurance)
    public static WebElement bottomTabBusinessInsurance;

    public static WebElement getBottomTabBusinessInsurance(){
        return bottomTabBusinessInsurance;
    }
    @FindBy(how = How.XPATH, using = xPathBottomTabEmployeeBenefits)
    public static WebElement bottomTabEmployeeBenefits;

    public static WebElement getBottomTabEmployeeBenefits(){
        return bottomTabEmployeeBenefits;
    }

    @FindBy(how = How.XPATH, using = xPathBottomLogoCarInsurance)
    public static WebElement bottomLogoCarInsurance;

    public static WebElement getBottomLogoCarInsurance(){
        return bottomLogoCarInsurance;
    }

    @FindBy(how= How.XPATH, using= xPathBottomLogoHomeInsurance)
    public static WebElement bottomLogoHomeInsurance;

    public static WebElement getBottomLogoHomeInsurance(){
        return bottomLogoHomeInsurance;
    }

    @FindBy(how= How.XPATH, using = xPathBottomLogoBusinessInsurance)
    public static WebElement bottomLogoBusinessInsurance;

    public static WebElement getBottomLogoBusinessInsurance(){
        return bottomLogoBusinessInsurance;
    }

    @FindBy(how = How.XPATH, using = xPathBottomLogoEmployeeBenefits)
    public static WebElement bottomLogoEmployeeBenefits;

    public static WebElement getBottomLogoEmployeeBenefits(){
        return bottomLogoEmployeeBenefits;
    }

    @FindBy(how = How.XPATH, using = xPathTopBarClaimsTab)
    public static WebElement topBarClaimsTab;

    public static WebElement getTopBarClaimsTab(){
        return topBarClaimsTab;
    }

    @FindBy(how= How.XPATH, using = xPathTopBarContactUsTab)
    public static WebElement topBarContactUsTab;

    public static WebElement getTopBarContactUsTab(){
        return topBarContactUsTab;
    }

    @FindBy(how = How.XPATH, using = xPathTopBarAgentsTab)
    public static WebElement topBarAgentsTab;

    public static WebElement getTopBarAgentsTab(){
        return topBarAgentsTab;
    }

    @FindBy(how = How.XPATH, using = xPathFullScreenImageHomePage)
    public static WebElement fullScreenImageHomepage;

    public static WebElement getFullScreenImageHomepage(){
        return fullScreenImageHomepage;
    }

    @FindBy(how = How.XPATH, using = xPathInspireImageHomePage)
    public static WebElement inspireImageHomePage;

    public static WebElement getInspireImageHomePage(){
        return inspireImageHomePage;
    }

    @FindBy(how = How.XPATH, using= xPathAbilityImageHomePage)
    public static WebElement abilityImageHomePage;

    public static WebElement getAbilityImageHomePage(){
        return abilityImageHomePage;
    }

    @FindBy(how = How.XPATH, using = xPathCareerImageHomePage)
    public static WebElement careerImageHomePage;

    public static WebElement getCareerImageHomePage(){
        return careerImageHomePage;
    }

    @FindBy(how = How.XPATH, using = xPathClaimTabPersonalAuto)
    public static WebElement claimTabPersonalAuto;

    public static WebElement getClaimTabPersonalAuto(){
        return claimTabPersonalAuto;
    }

    @FindBy(how= How.XPATH, using = xPathClaimTabHomeAndRenters)
    public static WebElement claimTabHomeAndRenters;

    public static WebElement getClaimTabHomeAndRenters(){
        return claimTabHomeAndRenters;
    }

    @FindBy(how = How.XPATH, using = xPathClaimEmployeeBenefits)
    public static WebElement claimTabEmployeeBenefits;

    public static WebElement getClaimTabEmployeeBenefits(){
        return claimTabEmployeeBenefits;
    }

    @FindBy(how= How.XPATH, using = xPathClaimWorkersCompensation)
    public static WebElement claimTabWorkersCompensation;

    public static WebElement getClaimTabWorkersCompensation(){
        return claimTabWorkersCompensation;
    }

    @FindBy(how = How.XPATH, using = xPathClaimCommercialAuto)
    public static WebElement claimTabCommericalAuto;

    public static WebElement getClaimTabCommericalAuto(){
        return claimTabCommericalAuto;
    }

    @FindBy(how = How.XPATH, using = xPathClaimCommericalPropertry)
    public static WebElement claimTabCommercialProperty;

    public static WebElement getClaimTabCommercialProperty(){
        return claimTabCommercialProperty;
    }

    @FindBy(how = How.XPATH, using = xPathClaimGeneralLiability)
    public static WebElement claimTabGeneralLiability;

    public static WebElement getClaimTabGeneralLiability(){

        return claimTabGeneralLiability;
    }

    @FindBy(how = How.XPATH, using = xPathClaimTabLogoPersonalLiability)
    public static WebElement claimTabLogoPersonalLiability;

    public static WebElement getClaimTabLogoPersonalLiability(){
        return claimTabLogoPersonalLiability;
    }


}

