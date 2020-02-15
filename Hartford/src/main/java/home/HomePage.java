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

    @FindBy(how = How.XPATH, using = xPathOutlineQuoteBox)
    public static WebElement outLineQuoteBox;

    public static WebElement getOutLineQuoteBox(){
        return outLineQuoteBox;
    }

    @FindBy(how = How.XPATH, using = xPathQuoteBoxAutoBox)
    public static WebElement quoteBoxAutoBox;

    public static WebElement getQuoteBoxAutoBox(){
        return quoteBoxAutoBox;
    }

    @FindBy (how = How.XPATH, using = xPathQuoteBoxZipCodeSearchBox)
    public static WebElement quoteBoxZipCodeSearchBox;

    public static WebElement getQuoteBoxZipCodeSearchBox(){
        return quoteBoxZipCodeSearchBox;
    }

    @FindBy(how = How.XPATH, using = xPathQuoteBoxSearchButton)
    public static WebElement quoteBoxSearchButton;

    public static WebElement getQuoteBoxSearchButton(){
        return quoteBoxSearchButton;
    }

    @FindBy(how = How.XPATH, using = xPathQuoteBoxHomeAndCondo)
    public static WebElement quoteBoxHomeAndCondo;

    public static WebElement getQuoteBoxHomeAndCondo(){
        return quoteBoxHomeAndCondo;
    }

    @FindBy(how = How.XPATH, using = xPathQuoteBoxZipCodeSearchBoxHomeAndCondo)
    public static WebElement quoteBoxZipCodeSearchBoxHomeAndCondo;

    public static WebElement getQuoteBoxZipCodeSearchBoxHomeAndCondo(){
        return quoteBoxZipCodeSearchBoxHomeAndCondo;
    }

    @FindBy(how = How.XPATH, using = xPathQuoteBoxSearchButtonHomeAndCondo)
    public static WebElement quoteBoxSearchButtonHomeAndCondo;

    public static WebElement getQuoteBoxSearchButtonHomeAndCondo(){
        return quoteBoxSearchButtonHomeAndCondo;
    }

    @FindBy(how = How.XPATH, using = xPathQuoteBoxBusiness)
    public static WebElement quoteBoxBusiness;

    public static WebElement getQuoteBoxBusiness(){
        return quoteBoxBusiness;
    }

    @FindBy(how = How.XPATH, using = xPathQuoteBoxQuoteTodayButton)
    public static WebElement quoteBoxQuoteTodayButton;

    public static WebElement getQuoteBoxQuoteTodayButton(){
        return quoteBoxQuoteTodayButton;
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

    @FindBy(how= How.XPATH,using = xPathMouseHoverAutoTab)
    public static WebElement mouseHoverAutoTab;

    public static WebElement getMouseHoverAutoTab(){
       return mouseHoverAutoTab; };


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



    @FindBy(how = How.XPATH, using = xPathAutoTabAllVehiclesCarInsurance)
    public static WebElement autoTabAllVehiclesCarInsurance;

    public static WebElement getAutoTabAllVehiclesCarInsurance(){
        return autoTabAllVehiclesCarInsurance;
    }


    @FindBy(how = How.XPATH, using = xPathAutoTabAllVehiclesClassicCarInsurance)
    public static WebElement autoTabAllVehiclesClassicCarInsurance;

    public static WebElement getAutoTabAllVehiclesClassicCarInsurance(){
        return autoTabAllVehiclesClassicCarInsurance;
    }


    @FindBy(how = How.XPATH, using = xPathAutoTabAllVehiclesRVInsurance)
    public static WebElement autoTabAllVehiclesRVInsurance;

    public static WebElement getAutoTabAllVehiclesRVInsurance(){
        return autoTabAllVehiclesRVInsurance;
    }

    @FindBy(how = How.XPATH, using = xPathAutoTabAllVehiclesATVInsurance)
    public static WebElement autoTabAllVehiclesATVInsurance;

    public static WebElement getAutoTabAllVehiclesATVInsurance(){
        return autoTabAllVehiclesATVInsurance;
    }


    @FindBy(how = How.XPATH, using = xPathAutoTabAllVehiclesBoatInsurance)
    public static WebElement autoTabAllVehiclesBoatInsurance;

    public static WebElement getAutoTabAllVehiclesBoatInsurance(){
        return autoTabAllVehiclesBoatInsurance;
    }


    @FindBy(how = How.XPATH, using = xPathAutoTabAllVehiclesGolfCartInsurance)
    public static WebElement autoTabAllVehiclesGolfCartInsurance;

    public static WebElement getAutoTabAllVehiclesGolfCartInsurance(){
        return autoTabAllVehiclesGolfCartInsurance;
    }


    @FindBy(how = How.XPATH, using = xPathAutoTabAllVehiclesSnowMobileInsurance)
    public static WebElement autoTabAllVehiclesSnowMobileInsurance;

    public static WebElement getAutoTabAllVehiclesSnowMobileInsurance(){
        return autoTabAllVehiclesSnowMobileInsurance;
    }






    @FindBy(how = How.XPATH, using = xPathAutoTabAllVehiclesCarInsuranceLogo)
    public static WebElement autoTabAllVehiclesCarInsuranceLogo;

    public static WebElement getAutoTabAllVehiclesCarInsuranceLogo(){
        return autoTabAllVehiclesCarInsuranceLogo;
    }




    @FindBy(how = How.XPATH, using = xPathAutoTabAllVehiclesClassicCarInsuranceLogo)
    public static WebElement autoTabAllVehiclesClassicCarInsuranceLogo;

    public static WebElement getAutoTabAllVehiclesClassicCarInsuranceLogo(){
        return autoTabAllVehiclesClassicCarInsuranceLogo;
    }



    @FindBy(how = How.XPATH, using = xPathAutoTabAllVehiclesRVInsuranceLogo)
    public static WebElement autoTabAllVehiclesRVInsuranceLogo;

    public static WebElement getAutoTabAllVehiclesRVInsuranceLogo(){
        return autoTabAllVehiclesRVInsuranceLogo;
    }



    @FindBy(how = How.XPATH, using = xPathAutoTabAllVehiclesATVInsuranceLogo)
    public static WebElement autoTabAllVehiclesATVInsuranceLogo;

    public static WebElement getAutoTabAllVehiclesATVInsuranceLogo(){
        return autoTabAllVehiclesATVInsuranceLogo;
    }


    @FindBy(how = How.XPATH, using = xPathAutoTabAllVehiclesBoatInsuranceLogo)
    public static WebElement autoTabAllVehiclesBoatInsuranceLogo;

    public static WebElement getAutoTabAllVehiclesBoatInsuranceLogo(){
        return autoTabAllVehiclesBoatInsuranceLogo;
    }


    @FindBy(how = How.XPATH, using = xPathAutoTabAllVehiclesGolfCartInsuranceLogo)
    public static WebElement autoTabAllVehiclesGolfCartInsuranceLogo;

    public static WebElement getAutoTabAllVehiclesGolfCartInsuranceLogo(){
        return autoTabAllVehiclesGolfCartInsuranceLogo;
    }


    @FindBy(how = How.XPATH, using = xPathAutoTabAllVehiclesSnowMobileInsuranceLogo)
    public static WebElement autoTabAllVehiclesSnowMobileInsuranceLogo;

    public static WebElement getAutoTabAllVehiclesSnowMobileInsuranceLogo(){
        return autoTabAllVehiclesSnowMobileInsuranceLogo;
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

    @FindBy(how = How.XPATH,using = xPathMouseHoverHomeTab)
    public static WebElement mouseHoverHomeTab;

    public static WebElement getMouseHoverHomeTab(){
        return mouseHoverHomeTab;};

//    public static void setMouseHoverHomeTab(){
//        Actions actions = new Actions(driver);
//        WebElement target = driver.findElement(By.xpath(xPathMouseHoverHomeTab));
//        actions.moveToElement(target).perform();
//    }




    @FindBy(how= How.XPATH, using = xPathSelectHomeOwnerInsurance)
    public static WebElement SelectHomeOwnerInsurance;

    public static WebElement getSelectHomeOwnerInsurance(){
        return SelectHomeOwnerInsurance;
    }

    @FindBy(how= How.XPATH, using = xPathSelectRentersInsurance)
    public static WebElement selectRentersInsurance;

    public static WebElement getSelectRentersInsurance(){
        return selectRentersInsurance;
    }

    @FindBy(how = How.XPATH, using = xPathSelectCondoInsurance)
    public static WebElement selectCondoInsurance;

    public static WebElement getSelectCondoInsurance(){
        return selectCondoInsurance;
    }


    @FindBy(how= How.XPATH, using = xPathSelectFloodInsurance)
    public static WebElement selectFloodInsurance;

    public static WebElement getSelectFloodInsurance(){
        return selectFloodInsurance;
    }

    @FindBy(how = How.XPATH, using = xPathSelectUmbrellaInsurance)
    public static WebElement selectUmbrellaInsurance;

    public static WebElement getSelectUmbrellaInsurance(){
        return selectUmbrellaInsurance;
    }

    @FindBy(how = How.XPATH, using = xPathMouseHoverBusinessTab)
    public static WebElement mouseHoverBusinessTab;

    public static WebElement getMouseHoverBusinessTab(){
        return mouseHoverBusinessTab;
    }

    @FindBy (how = How.XPATH, using = xPathSelectBusinessInsurance)
    public static WebElement selectBusinessInsurance;

    public static WebElement getSelectBusinessInsurance(){
        return selectBusinessInsurance;
    }

    @FindBy (how = How.XPATH, using = xPathSelectSmallBusinessInsurance)
    public static WebElement selectSmallBusinessInsurance;

    public static WebElement getSelectSmallBusinessInsurance(){
        return selectSmallBusinessInsurance;
    }

    @FindBy (how = How.XPATH, using = xPathSelectGeneralLiabilityInsurance)
    public static WebElement selectGeneralLiabilityInsurance;

    public static WebElement getSelectGeneralLiabilityInsurance(){
        return selectGeneralLiabilityInsurance;
    }

    @FindBy(how = How.XPATH, using = xPathSelectWorkersCompensationInsurance)
    public static WebElement selectWorkersCompensationInsurance;

    public static WebElement getSelectWorkersCompensationInsurance(){
        return selectWorkersCompensationInsurance;
    }

    @FindBy(how = How.XPATH, using = xPathSelectAllBusinessCoveragesInsurance)
    public static WebElement selectAllBusinessCoverageInsurance;

    public static WebElement getSelectAllBusinessCoverageInsurance(){
        return selectAllBusinessCoverageInsurance;
    }

    @FindBy(how = How.XPATH, using = xPathMouseHoverEmployeeBenefitsTab)
    public static WebElement mouseHoverEmployeeBenefitsTab;

    public static WebElement getMouseHoverEmployeeBenefitsTab(){
        return mouseHoverEmployeeBenefitsTab;
    }

    @FindBy(how = How.XPATH, using = xPathSelectEmployeeBenefits)
    public static WebElement selectEmployeeBenefits;

    public static WebElement getSelectEmployeeBenefits(){
        return selectEmployeeBenefits;
    }

    @FindBy (how = How.XPATH, using = xPathSelectVoluntaryBenefits)
    public static WebElement selectVoluntaryBenefits;

    public static WebElement getSelectVoluntaryBenefits(){
        return selectVoluntaryBenefits;
    }

    @FindBy (how = How.XPATH, using = xPathSelectAbsenceManagement)
    public static WebElement selectAbsenceManagement;

    public static WebElement getSelectAbsenceManagement(){
        return selectAbsenceManagement;
    }

    @FindBy(how = How.XPATH, using = xPathSelectForEmployees)
    public static WebElement selectForEmployees;

    public static WebElement getSelectForEmployees(){
        return selectForEmployees;
    }

    @FindBy(how = How.XPATH, using = xPathMouseHoverAboutUsTab)
    public static WebElement mouseHoverAboutUsTab;

    public static WebElement getMouseHoverAboutUsTab(){
        return mouseHoverAboutUsTab;
    }

    @FindBy (how = How.XPATH, using = xPathSelectAboutTheHartford)
    public static WebElement selectAboutTheHartford;

    public static WebElement getSelectAboutTheHartford(){
        return selectAboutTheHartford;
    }

    @FindBy(how = How.XPATH, using = xPathSelectInvestorRelations)
    public static WebElement selectInvestoryRelations;

    public static WebElement getSelectInvestoryRelations(){
        return selectInvestoryRelations;
    }

    @FindBy(how = How.XPATH, using = xPathSelectNewsRoom)
    public static WebElement selectNewsRoom;
    public static WebElement getSelectNewsRoom(){
        return selectNewsRoom;
    }

    @FindBy(how = How.XPATH, using = xPathSelectCorporateSustainability)
    public static WebElement selectCorporateSustainability;

    public static WebElement getSelectCorporateSustainability(){
        return selectCorporateSustainability;
    }

    @FindBy (how = How.XPATH, using = xPathMouseHoverFindAnAgentTab)
    public static WebElement SelectFindAnAgent;

    public static WebElement getSelectFindAnAgent(){
        return SelectFindAnAgent;
    }

    @FindBy (how = How.XPATH, using = xPathSelectAutoAndHome)
    public static WebElement selectAutoAndHome;

    public static WebElement getSelectAutoAndHome(){
        return selectAutoAndHome;
    }

    @FindBy(how = How.XPATH, using  = xPathSelectSmallBusiness)
    public static WebElement selectSmallBusiness;

    public static WebElement getSelectSmallBusiness(){
        return selectSmallBusiness;
    }

    @FindBy (how = How.XPATH, using = xPathSelectMidSizeBusiness)
    public static WebElement selectMidSizeBusiness;

    public static WebElement getSelectMidSizeBusiness(){
        return selectMidSizeBusiness;
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

    @FindBy(how = How.XPATH, using = xPathCarInsuranceRatingStars)
    public static WebElement carInsuranceRatingStars;

    public static WebElement getCarInsuranceRatingStars(){
        return carInsuranceRatingStars;
    }

    @FindBy(how = How.XPATH, using = xPathCarInsuranceRatingNumbers)
    public static WebElement carInsuranceRatingNumbers;

    public static WebElement getCarInsuranceRatingNumbers(){
        return carInsuranceRatingNumbers;
    }

    @FindBy(how = How.XPATH, using = xPathCarInsuranceRatingReviews)
    public static WebElement carInsuranceRatingReviews;

    public static WebElement getCarInsuranceRatingReviews(){
        return carInsuranceRatingReviews;
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

    @FindBy(how = How.XPATH, using = xPathClaimTabLogoHomeAndRenters)
    public static WebElement claimTabLogoHomeAndRenters;

    public static WebElement getClaimTabLogoHomeAndRenters(){
        return claimTabLogoHomeAndRenters;
    }

    @FindBy(how = How.XPATH, using = xPathClaimTabLogoEmployeeBenefits)
    public static WebElement claimTabLogoEmployeeBenefits;

    public static WebElement getClaimTabLogoEmployeeBenefits(){
        return claimTabLogoEmployeeBenefits;
    }

    @FindBy(how = How.XPATH, using = xPathClaimTabLogoWorkersCompensation)
    public static WebElement claimTabLogoWorkersCompensation;

    public static WebElement getClaimTabLogoWorkersCompensation(){
        return claimTabLogoWorkersCompensation;
    }

    @FindBy(how = How.XPATH, using = xPathClaimTabLogoCommercialAuto)
    public static WebElement claimTabLogoCommercialAuto;

    public static WebElement getClaimTabLogoCommercialAuto(){
        return claimTabLogoCommercialAuto;
    }

    @FindBy(how = How.XPATH, using = xPathClaimTabLogoCommercialProperty)
    public static WebElement claimTabLogoCommercialProperty;

    public static WebElement getClaimTabLogoCommercialProperty(){
        return claimTabLogoCommercialProperty;
    }

    @FindBy(how = How.XPATH, using= xPathClaimTabLogoGeneralLiability)
    public static WebElement claimTabLogoGeneralLiability;

    public static WebElement getClaimTabLogoGeneralLiability(){
        return claimTabLogoGeneralLiability;
    }

    @FindBy(how = How.XPATH, using= xPathContactUsTabAARPMembersAutoInsurance)
    public static WebElement contactUsTabAARPMembersAutoInsurance;

    public static WebElement getContactUsTabAARPMembersAutoInsurance(){
        return contactUsTabAARPMembersAutoInsurance;
    }

    @FindBy(how = How.XPATH, using = xPathContactUsTabAARPMembersHomeInsurance)
    public static WebElement contactUsTabAARPMembersHomeInsurance;

    public static WebElement getContactUsTabAARPMembersHomeInsurance(){
        return contactUsTabAARPMembersHomeInsurance;
    }

    @FindBy(how = How.XPATH, using = xPathContactUsTabBusinessInsurance)
    public static WebElement contactUsTabBusinessInsurance;

    public static WebElement getContactUsTabBusinessInsurance(){
        return contactUsTabBusinessInsurance;
    }

    @FindBy(how = How.XPATH, using = xPathContactUsTabAutoInsurance)
    public static WebElement contactUsTabAutoInsurance;

    public static WebElement getContactUsTabAutoInsurance(){
        return contactUsTabAutoInsurance;
    }

    @FindBy(how = How.XPATH, using = xPathContactUsTabHomeInsurance)
    public static WebElement contactUsTabHomeInsurance;

    public static WebElement getContactUsTabHomeInsurance(){
        return contactUsTabHomeInsurance;
    }

    @FindBy(how = How.XPATH, using = xPathContactUsTabFinancialProducts)
    public static WebElement contactUsTabFinancialProducts;

    public static WebElement getContactUsTabFinancialProducts(){
        return contactUsTabFinancialProducts;
    }

    @FindBy(how = How.XPATH, using= xPathContactUsTabEmployeeBenefits)
    public static WebElement contactUsTabEmploymentBenefirts;

    public static WebElement getContactUsTabEmploymentBenefirts(){
        return contactUsTabEmploymentBenefirts;
    }

    @FindBy(how = How.XPATH, using = xPathContactUsTabAgentsAndProducers)
    public static WebElement contactUsTabAgentsAndProducers;

    public static WebElement getContactUsTabAgentsAndProducers(){
        return contactUsTabAgentsAndProducers;
    }

    @FindBy (how = How.XPATH, using = xPathContactUsTabMainContactInformation)
    public static WebElement contactUsTabMainContactInformation;

    public static WebElement getContactUsTabMainContactInformation(){
        return contactUsTabMainContactInformation;
    }




    @FindBy(how = How.XPATH, using = xPathFooterAuto)
    public static WebElement footerAuto;

    public static WebElement getFooterAuto(){
        return footerAuto;
    }

    @FindBy(how = How.XPATH, using = xPathFooterHome)
    public static WebElement footerHome;

    public static WebElement getFooterHome(){
        return footerHome;
    }

    @FindBy(how = How.XPATH, using = xPathFooterBusiness)
    public static WebElement footerBusiness;

    public static WebElement getFooterBusiness(){
        return footerBusiness;
    }

    @FindBy(how = How.XPATH, using = xPathFooterEmployeeBenefits)
    public static WebElement footerEmployeeBenefits;

    public static WebElement getFooterEmployeeBenefits(){
        return footerEmployeeBenefits;
    }

    @FindBy(how = How.XPATH, using = xPathFooterMutualFunds)
    public static WebElement footerMutualFunds;

    public static WebElement getFooterMutualFunds(){
        return footerMutualFunds;
    }

    @FindBy(how = How.XPATH, using = xPathFooterAboutUs)
    public static WebElement footerAboutUs;

    public static WebElement getFooterAboutUs(){
        return footerAboutUs;
    }

    @FindBy(how = How.XPATH, using = xPathFooterCareer)
    public static WebElement footerCareer;

    public static WebElement getFooterCareer(){
        return footerCareer;
    }

    @FindBy(how = How.XPATH, using = xPathFooterAgentsAndProducers)
    public static WebElement footerAgentsAndProducers;

    public static WebElement getFooterAgentsAndProducers(){
        return footerAgentsAndProducers;
    }

    @FindBy(how = How.XPATH, using = xPathFooterNewsRoom)
    public static WebElement footerNewsRoom;

    public static WebElement getFooterNewsRoom(){
        return footerNewsRoom;
    }

    @FindBy(how = How.XPATH, using = xPathFooterInvestorRelations)
    public static WebElement footerInvestorRelations;

    public static WebElement getFooterInvestorRelations(){
        return footerInvestorRelations;
    }

    @FindBy(how = How.XPATH, using = xPathFooterContactUs)
    public static WebElement footerContactUs;

    public static WebElement getFooterContactUs(){
        return footerContactUs;
    }

    @FindBy(how = How.XPATH, using = xPathFooterReportAClaim)
    public static WebElement footerReportAClaim;

    public static WebElement getFooterReportAClaim(){
        return footerReportAClaim;
    }

    @FindBy(how = How.XPATH, using = xPathFooterFindAnAgent)
    public static WebElement footerFindAnAgent;

    public static WebElement getFooterFindAnAgent(){
        return footerFindAnAgent;
    }

    @FindBy(how = How.XPATH, using = xPathFooterMobileApp)
    public static WebElement footerMobileApp;

    public static WebElement getFooterMobileApp(){
        return footerMobileApp;
    }

    @FindBy(how = How.XPATH, using = xPathFooterSmallBizAhead)
    public static WebElement footerSmallBizAhead;

    public static WebElement getFooterSmallBizAhead(){
        return footerSmallBizAhead;
    }

    @FindBy(how = How.XPATH, using = xPathFooterSmallBusinessPlayBook)
    public static WebElement footerSmallBusinessPlayBook;

    public static WebElement getFooterSmallBusinessPlayBook(){
        return footerSmallBusinessPlayBook;
    }

    @FindBy(how = How.XPATH, using = xPathFooterExtraMile)
    public static WebElement footerExtraMile;

    public static WebElement getFooterExtraMile(){
        return footerExtraMile;
    }
}

