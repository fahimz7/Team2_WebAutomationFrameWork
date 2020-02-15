package testhome;

import home.HomePage;
import home.WebElementHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;

public class TestHomePage extends HomePage {

    static HomePage homepage;



    //PageFactory
    public void getInItElements(){
        homepage= PageFactory.initElements(driver,HomePage.class);}


    @Test(priority = 3)
    public void testDoSearch() throws InterruptedException {
        getInItElements();
        getSearchBox().sendKeys("Auto insurance");
        sleepFor(2);
        getSearchButton().click();
        sleepFor(2);
    }

   @Test(priority = 2)
    public void testDoSearchForHomeInsurance() throws InterruptedException {
        getInItElements();
        getSearchBox().sendKeys("Home insurance");
        getSearchButton().click();
        sleepFor(2);
    }

    @Test(priority = 4)
    public void testDoSearchForHealthinsurance() throws InterruptedException {
        getInItElements();
        getSearchBox().sendKeys("Health insurance");
        getSearchButton().click();
        sleepFor(2);
    }

    @Test(priority = 5)
    public void testDoSearchForLowCostInsurance() throws InterruptedException {
        getInItElements();
        getSearchBox().sendKeys("Low Cost Insurance");
        getSearchButton().click();
        sleepFor(2);
    }

   @Test(priority = 1)
    public void testmouseHoverAutoTab() throws InterruptedException {
        getInItElements();
        mouseHoverByXpath(xPathMouseHoverAutoTab);
        SelectCarInsurance.click();
        sleepFor(2);
    }
       // driver.findElement(By.xpath("//h1[contains(text(),'AARP Auto Insurance Program From The Hartford')]")).getText();

        //String a=driver.findElement(By.xpath("//h1[contains(text(),'AARP Auto Insurance Program From The Hartford')]")).getText();
        //String actual= getCaptureTextCarInsurance().getText();
       // String expexted="AARP Auto Insurance Program From The Hartford";
       // Assert.assertEquals(actual,expexted);
        //System.out.println("test passed");


    @Test
    public void testQuoteBoxZipCodeSearch1() throws InterruptedException {
        getInItElements();
        outLineQuoteBox.click();
        quoteBoxAutoBox.click();
        quoteBoxZipCodeSearchBox.sendKeys("10462");
        quoteBoxSearchButton.click();
        sleepFor(2);

    }

    @Test
    public void testQuoteBoxZipCodeSearch2() throws InterruptedException {
        getInItElements();
        outLineQuoteBox.click();
        quoteBoxAutoBox.click();
        quoteBoxZipCodeSearchBox.sendKeys("11101");
        quoteBoxSearchButton.click();
        sleepFor(2);

    }

    @Test
    public void testQuoteBoxZipCodeSearch3() throws InterruptedException {
        getInItElements();
        outLineQuoteBox.click();
        quoteBoxAutoBox.click();
        quoteBoxZipCodeSearchBox.sendKeys("11");
        quoteBoxSearchButton.click();
        sleepFor(2);

    }

    @Test
    public void testQuoteBoxZipCodeSearch4() throws InterruptedException {
        getInItElements();
        outLineQuoteBox.click();
        quoteBoxAutoBox.click();
        quoteBoxZipCodeSearchBox.sendKeys("36830");
        quoteBoxSearchButton.click();
        sleepFor(2);
    }

    @Test
    public void testQuoteBoxZipCodeSearch5() throws InterruptedException {
        getInItElements();
        outLineQuoteBox.click();
        quoteBoxHomeAndCondo.click();
        quoteBoxZipCodeSearchBoxHomeAndCondo.sendKeys("10462");
        quoteBoxSearchButtonHomeAndCondo.click();
        sleepFor(2);
    }

    @Test
    public void testQuoteBoxZipCodeSearch6() throws InterruptedException {
        getInItElements();
        outLineQuoteBox.click();
        quoteBoxHomeAndCondo.click();
        quoteBoxZipCodeSearchBoxHomeAndCondo.sendKeys("11101");
        quoteBoxSearchButtonHomeAndCondo.click();
        sleepFor(2);
    }

    @Test
    public void testQuoteBoxZipCodeSearch7() throws InterruptedException {
        getInItElements();
        outLineQuoteBox.click();
        quoteBoxHomeAndCondo.click();
        quoteBoxZipCodeSearchBoxHomeAndCondo.sendKeys("11");
        quoteBoxSearchButtonHomeAndCondo.click();
        sleepFor(2);
    }

    @Test
    public void testQuoteBoxZipCodeSearch8() throws InterruptedException {
        getInItElements();
        outLineQuoteBox.click();
        quoteBoxHomeAndCondo.click();
        quoteBoxZipCodeSearchBoxHomeAndCondo.sendKeys("36830");
        quoteBoxSearchButtonHomeAndCondo.click();
        sleepFor(2);
    }

    @Test
    public void testQuoteBoxZipCodeSearch10() throws InterruptedException {
        getInItElements();
        outLineQuoteBox.click();
        quoteBoxBusiness.click();
        quoteBoxQuoteTodayButton.click();
        sleepFor(2);
    }


    @Test
    public void testMouseHoverAutoTab1() throws InterruptedException {
        getInItElements();
        mouseHoverByXpath(xPathMouseHoverAutoTab);
        SelectClassicCarInsurance.click();
        sleepFor(2);
    }

    @Test
    public void testmouseHoverAutoTab2() throws InterruptedException {
        getInItElements();
        mouseHoverByXpath(xPathMouseHoverAutoTab);
        SelectAllVehical.click();
        sleepFor(2);
    }

    @Test
    public void testAutoTabAllVehiclesCarInsurance() throws InterruptedException {
        getInItElements();
        mouseHoverByXpath(xPathMouseHoverAutoTab);
        SelectAllVehical.click();
        autoTabAllVehiclesCarInsurance.click();
        sleepFor(2);
    }

    @Test
    public void testAutoTabAllVehiclesClassicCarInsurance() throws InterruptedException {
        getInItElements();
        mouseHoverByXpath(xPathMouseHoverAutoTab);
        SelectAllVehical.click();
        autoTabAllVehiclesClassicCarInsurance.click();
        sleepFor(2);
    }

    @Test
    public void testAutoTabAllVehiclesRVInsurance() throws InterruptedException {
        getInItElements();
        mouseHoverByXpath(xPathMouseHoverAutoTab);
        SelectAllVehical.click();
        autoTabAllVehiclesRVInsurance.click();
        sleepFor(2);
    }


    @Test
    public void testAutoTabAllVehiclesATVInsurance() throws InterruptedException {
        getInItElements();
        mouseHoverByXpath(xPathMouseHoverAutoTab);
        SelectAllVehical.click();
        autoTabAllVehiclesATVInsurance.click();
        sleepFor(2);
    }


    @Test
    public void testAutoTabAllVehiclesBoatInsurance() throws InterruptedException {
        getInItElements();
        mouseHoverByXpath(xPathMouseHoverAutoTab);
        SelectAllVehical.click();
        autoTabAllVehiclesBoatInsurance.click();
        sleepFor(2);
    }


    @Test
    public void testAutoTabAllVehiclesGolfCartInsurance(){
        getInItElements();
        mouseHoverByXpath(xPathMouseHoverAutoTab);
        SelectAllVehical.click();
        autoTabAllVehiclesGolfCartInsurance.click();

    }


    @Test
    public void testAutoTabAllVehiclesSnowMobileInsurance() throws InterruptedException {
        getInItElements();
        mouseHoverByXpath(xPathMouseHoverAutoTab);
        SelectAllVehical.click();
        autoTabAllVehiclesSnowMobileInsurance.click();
        sleepFor(2);

    }

    @Test
    public void testAutoTabAllVehiclesCarInsuranceLogo() throws InterruptedException {
        getInItElements();
        mouseHoverByXpath(xPathMouseHoverAutoTab);
        getSelectAllVehical().click();
        autoTabAllVehiclesCarInsuranceLogo.click();
        sleepFor(2);
    }


    @Test
    public void testAutoTabAllVehiclesClassicCarInsuranceLogo() throws InterruptedException {
        getInItElements();
        mouseHoverByXpath(xPathMouseHoverAutoTab);
        getSelectAllVehical().click();
        autoTabAllVehiclesClassicCarInsuranceLogo.click();
        sleepFor(2);
    }

    @Test
    public void testAutoTabAllVehiclesRVInsuranceLogo() throws InterruptedException {
        getInItElements();
        mouseHoverByXpath(xPathMouseHoverAutoTab);
        getSelectAllVehical().click();
        autoTabAllVehiclesRVInsuranceLogo.click();
        sleepFor(2);
    }


    @Test
    public void testAutoTabAllVehiclesATVInsuranceLogo() throws InterruptedException {
        getInItElements();
        mouseHoverByXpath(xPathMouseHoverAutoTab);
        getSelectAllVehical().click();
        autoTabAllVehiclesATVInsuranceLogo.click();
        sleepFor(2);
    }


    @Test
    public void testAutoTabAllVehiclesBoatInsuranceLogo() throws InterruptedException {
        getInItElements();
        mouseHoverByXpath(xPathMouseHoverAutoTab);
        getSelectAllVehical().click();
        autoTabAllVehiclesBoatInsuranceLogo.click();
        sleepFor(2);
    }


    @Test
    public void testAutoTabAllVehiclesGolfCartInsuranceLogo() throws InterruptedException {
        getInItElements();
        mouseHoverByXpath(xPathMouseHoverAutoTab);
        getSelectAllVehical().click();
        autoTabAllVehiclesGolfCartInsuranceLogo.click();
        sleepFor(2);
    }


    @Test
    public void testAutoTabAllVehiclesSnowMobileInsuranceLogo() throws InterruptedException {
        getInItElements();
        mouseHoverByXpath(xPathMouseHoverAutoTab);
        getSelectAllVehical().click();
        autoTabAllVehiclesSnowMobileInsuranceLogo.click();
        sleepFor(2);
    }


    @Test
    public void testMouseHoverHomeTab() throws InterruptedException {
        getInItElements();
        mouseHoverByXpath(xPathMouseHoverHomeTab);
        SelectHomeOwnerInsurance.click();
        sleepFor(2);
    }



    @Test
    public void testMouseHoverHomeTab1() throws InterruptedException {
        getInItElements();
        mouseHoverByXpath(xPathMouseHoverHomeTab);
        selectRentersInsurance.click();
        sleepFor(2);
    }

    @Test
    public void testMouseHoverHomeTab2() throws InterruptedException {
        getInItElements();
        mouseHoverByXpath(xPathMouseHoverHomeTab);
        selectCondoInsurance.click();
        sleepFor(2);
    }

    @Test
    public void testMouseHoverHomeTab3() throws InterruptedException {
        getInItElements();
        mouseHoverByXpath(xPathMouseHoverHomeTab);
        selectFloodInsurance.click();
        sleepFor(2);
    }

    @Test
    public void testMouseHoverHomeTab4() throws InterruptedException {
        getInItElements();
        mouseHoverByXpath(xPathMouseHoverHomeTab);
        selectUmbrellaInsurance.click();
        sleepFor(2);
    }

    @Test
    public void testMouseHoverBusinessTab() throws InterruptedException {
        getInItElements();
        mouseHoverByXpath(xPathMouseHoverBusinessTab);
        selectBusinessInsurance.click();
        sleepFor(2);
    }


    @Test
    public void testMouseHoverBusinessTab1() throws InterruptedException {
        getInItElements();
        mouseHoverByXpath(xPathMouseHoverBusinessTab);
        selectSmallBusinessInsurance.click();
        sleepFor(2);
    }


    @Test
    public void testMouseHoverBusinessTab2() throws InterruptedException {
        getInItElements();
        mouseHoverByXpath(xPathMouseHoverBusinessTab);
        selectGeneralLiabilityInsurance.click();
        sleepFor(2);
    }


    @Test
    public void testMouseHoverBusinessTab3() throws InterruptedException {
        getInItElements();
        mouseHoverByXpath(xPathMouseHoverBusinessTab);
        selectWorkersCompensationInsurance.click();
        sleepFor(2);
    }


    @Test
    public void testMouseHoverBusinessTab4() throws InterruptedException {
        getInItElements();
        mouseHoverByXpath(xPathMouseHoverBusinessTab);
        selectAllBusinessCoverageInsurance.click();
        sleepFor(2);
    }


    @Test
    public void testMouseHoverEmployeeBenefitsTab1() throws InterruptedException {
        getInItElements();
        mouseHoverByXpath(xPathMouseHoverEmployeeBenefitsTab);
        selectEmployeeBenefits.click();
        sleepFor(2);
    }

    @Test
    public void testMouseHoverEmployeeBenefitsTab2() throws InterruptedException {
        getInItElements();
        mouseHoverByXpath(xPathMouseHoverEmployeeBenefitsTab);
        selectVoluntaryBenefits.click();
        sleepFor(2);
    }

    @Test
    public void testMouseHoverEmployeeBenefitsTab3() throws InterruptedException {
        getInItElements();
        mouseHoverByXpath(xPathMouseHoverEmployeeBenefitsTab);
        selectAbsenceManagement.click();
        sleepFor(2);
    }

    @Test
    public void testMouseHoverEmployeeBenefitsTab4() throws InterruptedException {
        getInItElements();
        mouseHoverByXpath(xPathMouseHoverEmployeeBenefitsTab);
        selectForEmployees.click();
        sleepFor(2);
    }

    @Test
    public void testMouseHoverAboutUs1() throws InterruptedException {
        getInItElements();
        mouseHoverByXpath(xPathMouseHoverAboutUsTab);
        selectAboutTheHartford.click();
        sleepFor(2);
    }

    @Test
    public void testMouseHoverAboutUs2() throws InterruptedException {
        getInItElements();
        mouseHoverByXpath(xPathMouseHoverAboutUsTab);
        selectInvestoryRelations.click();
        sleepFor(2);
    }


    @Test
    public void testMouseHoverAboutUs3() throws InterruptedException {
        getInItElements();
        mouseHoverByXpath(xPathMouseHoverAboutUsTab);
        selectNewsRoom.click();
        sleepFor(2);
    }


    @Test
    public void testMouseHoverAboutUs4() throws InterruptedException {
        getInItElements();
        mouseHoverByXpath(xPathMouseHoverAboutUsTab);
        selectCorporateSustainability.click();
        sleepFor(2);
    }


    @Test
    public void testFindAnAgent1() throws InterruptedException {
        getInItElements();
        mouseHoverByXpath(xPathMouseHoverFindAnAgentTab);
        selectAutoAndHome.click();
        sleepFor(2);
    }

    @Test
    public void testFindAnAgent2() throws InterruptedException {
        getInItElements();
        mouseHoverByXpath(xPathMouseHoverFindAnAgentTab);
        selectSmallBusiness.click();
        sleepFor(2);
    }

    @Test
    public void testFindAnAgent3() throws InterruptedException {
        getInItElements();
        mouseHoverByXpath(xPathMouseHoverFindAnAgentTab);
        selectMidSizeBusiness.click();
        sleepFor(2);
    }
















//    @Test
//    public void testmouseHoverAutoTab1()
//        getInItElements();
//        setMouseHoverAutoTab1();

//    @Test()
//    public void testDoSearchForZipCode() throws InterruptedException {
//        getInItElements();
//        getQuoteSearchSelect().click();
//        getQuoteSearchBox().sendKeys("10462");
//        getSearchButton().click();
//        sleepFor(2);
//
//    }

//    public void testDoSearch() throws InterruptedException {
//        getInItElements();
//        getSearchBox().sendKeys("Auto insurance");
//        sleepFor(2);
//        getSearchButton().click();
//        sleepFor(2);
//    }
    @Test
    public void testCheckMainLogo() throws InterruptedException {
        getInItElements();
        Assert.assertTrue(getMainLogo().isDisplayed()); ;
        sleepFor(2);
    }

   @Test
    public void testBottomTabCarInsurance() throws InterruptedException {
        getInItElements();
        getBottomTabCarInsurance().click();
        sleepFor(2);
    }

   @Test
    public void testBottomTabHomeInsurance() throws InterruptedException {
        getInItElements();
        getBottomTabHomeInsurance().click();
        sleepFor(2);
    }

    @Test
    public void testBottomTabBusinessInsurance() throws InterruptedException {
        getInItElements();
        getBottomTabBusinessInsurance().click();
        sleepFor(2);
    }

   @Test
    public void testBottomTabEmployeeBenefits() throws InterruptedException {
        getInItElements();
        getBottomTabEmployeeBenefits().click();
        sleepFor(2);
    }

   @Test
    public void testBottomLogoCarInsurance() throws InterruptedException {
        getInItElements();
        getBottomLogoCarInsurance().click();
        sleepFor(2);
    }

    @Test
    public void testBottomLogoHomeInsurance() throws InterruptedException {
        getInItElements();
        getBottomLogoHomeInsurance().click();
        sleepFor(2);
    }

   @Test
    public void testBottomLogoBusinessInsurance() throws InterruptedException {
        getInItElements();
        getBottomLogoBusinessInsurance().click();
        sleepFor(2);
    }

    @Test
    public void testBottomLogoEmployeeBenefits() throws InterruptedException {
        getInItElements();
        getBottomLogoEmployeeBenefits().click();
        sleepFor(2);
    }

    @Test
    public void testCarInsuranceRatingStars(){
        getInItElements();
        Assert.assertTrue(carInsuranceRatingStars.isDisplayed());
    }

    @Test
    public void testCarInsuranceRatingNumbers(){
        getInItElements();
        Assert.assertTrue(carInsuranceRatingNumbers.isDisplayed());
    }

    @Test
    public void testCarInsuranceRatingReviews(){
        getInItElements();
        getCarInsuranceRatingReviews().click();
    }





    @Test
    public void testTopBarClaimsTab() throws InterruptedException {
        getInItElements();
        getTopBarClaimsTab().click();
        sleepFor(2);
    }

    @Test
    public void testTopBarContactUsTab() throws InterruptedException {
        getInItElements();
        getTopBarContactUsTab().click();
        sleepFor(2);
    }

    @Test
    public void testTopBarAgentsTab() throws InterruptedException {
        getInItElements();
        getTopBarAgentsTab().click();
        sleepFor(2);
    }

    @Test
    public void testFullScreenImageHomePage() throws InterruptedException {
        getInItElements();
        Assert.assertTrue(getFullScreenImageHomepage().isDisplayed());
        sleepFor(2);
    }

    @Test
    public void testInspireImageHomePage() throws InterruptedException {
        getInItElements();
        Assert.assertTrue(getInspireImageHomePage().isDisplayed());
        sleepFor(2);
    }

    @Test
    public void testAbilityImageHomePage() throws InterruptedException {
        getInItElements();
        Assert.assertTrue(getAbilityImageHomePage().isDisplayed());
        sleepFor(2);
    }

    @Test
    public void testCareerImageHomePage() throws InterruptedException {
        getInItElements();
        Assert.assertTrue(getCareerImageHomePage().isDisplayed());
        sleepFor(2);
    }

    @Test
    public void testClaimTabPeronalAuto(){
        getInItElements();
        getTopBarClaimsTab().click();
        getClaimTabPersonalAuto().click();
    }

    @Test
    public void testClaimTabHomeAndRenters(){
        getInItElements();
        getTopBarClaimsTab().click();
        getClaimTabHomeAndRenters().click();
    }

   @Test
    public void testClaimTabEmployeeBenefits() throws InterruptedException {
        getInItElements();
        getTopBarClaimsTab().click();
        getClaimTabEmployeeBenefits().click();
        sleepFor(2);
    }

    @Test
    public void testClaimTabWorkersCompensation() throws InterruptedException {
        getInItElements();
        getTopBarClaimsTab().click();
        getClaimTabWorkersCompensation().click();
        sleepFor(2);
    }

    @Test
    public void testClaimTabCommercialAuto() throws InterruptedException {
        getInItElements();
        getTopBarClaimsTab().click();
        getClaimTabCommericalAuto().click();
        sleepFor(2);
    }

    @Test
    public void testClaimTabCommericalProperty() throws InterruptedException {
        getInItElements();
        getTopBarClaimsTab().click();
        getClaimTabCommercialProperty().click();
        sleepFor(2);
    }

   @Test
    public void testClaimTabGeneralLiability() throws InterruptedException {
        getInItElements();
        getTopBarClaimsTab().click();
        getClaimTabGeneralLiability().click();
        sleepFor(2);
    }

    @Test
    public void testClaimTabLogoPersonalLiability() throws InterruptedException {
        getInItElements();
        getTopBarClaimsTab().click();
        getClaimTabLogoPersonalLiability().click();
        sleepFor(2);
    }

    @Test
    public void testClaimTabLogoHomeAndRenter() throws InterruptedException {
        getInItElements();
        getTopBarClaimsTab().click();
        getClaimTabLogoHomeAndRenters().click();
        sleepFor(2);
    }

    @Test
    public void testClaimTabLogoEmployeeBenefits() throws InterruptedException {
        getInItElements();
        getTopBarClaimsTab().click();
        getClaimTabLogoEmployeeBenefits().click();
        sleepFor(2);
    }

    @Test
    public void testClaimTabLogoWorkersCompensation() throws InterruptedException {
        getInItElements();
        getTopBarClaimsTab().click();
        getClaimTabLogoWorkersCompensation().click();
        sleepFor(2);
    }

    @Test
    public void testClaimTabLogoCommercialAuto() throws InterruptedException {
        getInItElements();
        getTopBarClaimsTab().click();
        getClaimTabLogoCommercialAuto().click();
        sleepFor(2);
    }

    @Test
    public void testClaimTabLogoCommercialProperty() throws InterruptedException {
        getInItElements();
        getTopBarClaimsTab().click();
        getClaimTabLogoCommercialProperty().click();
        sleepFor(2);
    }

    @Test
    public void testClaimTabLogoGeneralLiability() throws InterruptedException {
        getInItElements();
        getTopBarClaimsTab().click();
        getClaimTabLogoGeneralLiability().click();
        sleepFor(2);
    }

   @Test
    public void testContactUsTabAARPMembersAutoInsurance() throws InterruptedException {
        getInItElements();
        getTopBarContactUsTab().click();
        getContactUsTabAARPMembersAutoInsurance().click();
        sleepFor(2);
    }

    @Test
    public void testContactUsTabAARPMembersHomeInsurance() throws InterruptedException {
        getInItElements();
        getTopBarContactUsTab().click();
        getContactUsTabAARPMembersHomeInsurance().click();
        sleepFor(2);
    }

    @Test
    public void testContactUsTabBusinessInsurance() throws InterruptedException {
        getInItElements();
        getTopBarContactUsTab().click();
        getContactUsTabBusinessInsurance().click();
        sleepFor(2);
    }

    @Test
    public void testContactUsTabAutoInsurance() throws InterruptedException {
        getInItElements();
        getTopBarContactUsTab().click();
        getContactUsTabAutoInsurance().click();
        sleepFor(2);
    }

    @Test
    public void testContactUsTabHomeInsurance() throws InterruptedException {
        getInItElements();
        getTopBarContactUsTab().click();
        getContactUsTabHomeInsurance().click();
        sleepFor(2);
    }

    @Test
    public void testContactUsTabFinancialProducts() throws InterruptedException {
        getInItElements();
        getTopBarContactUsTab().click();
        getContactUsTabFinancialProducts().click();
        sleepFor(2);
    }

    @Test
    public void testContactUsTabEmployeeBenefits() throws InterruptedException {
        getInItElements();
        getTopBarContactUsTab().click();
        getContactUsTabEmploymentBenefirts().click();
        sleepFor(2);
    }

    @Test
    public void testContactUsTabAgentsAndProducers() throws InterruptedException {
        getInItElements();
        getTopBarContactUsTab().click();
        getContactUsTabAgentsAndProducers().click();
        sleepFor(2);
    }

    @Test
    public void testContactUsTabContactInformation() throws InterruptedException {
        getInItElements();
        getTopBarContactUsTab().click();
        getContactUsTabMainContactInformation().click();
        sleepFor(2);
    }

    @Test
    public void testFooterAuto(){
        getInItElements();
        footerAuto.click();
    }

    @Test
    public void testFooterHome(){
        getInItElements();
        footerHome.click();
    }

    @Test
    public void testFooterBusiness(){
        getInItElements();
        footerBusiness.click();
    }

    @Test
    public void testFooterEmployeeBenefits(){
        getInItElements();
        footerEmployeeBenefits.click();
    }

    @Test
    public void testFooterMutualFunds(){
        getInItElements();
        footerMutualFunds.click();
    }

    @Test
    public void testFooterAboutUs(){
        getInItElements();
        footerAboutUs.click();
    }

    @Test
    public void testFooterCareers(){
        getInItElements();
        footerCareer.click();
    }

    @Test
    public void testFooterAgentsAndProducers(){
        getInItElements();
        footerAgentsAndProducers.click();
    }

    @Test
    public void testFooterNewsRoom(){
        getInItElements();
        footerNewsRoom.click();
    }

    @Test
    public void testFooterInvestorRelations(){
        getInItElements();
        footerInvestorRelations.click();
    }

    @Test
    public void testFooterContactUs(){
        getInItElements();
        footerContactUs.click();
    }


    @Test
    public void testFooterReportAClaim(){
        getInItElements();
        footerReportAClaim.click();
    }

    @Test
    public void testFooterFindAnAgent(){
        getInItElements();
        footerFindAnAgent.click();
    }

    @Test
    public void testFooterMobileApp(){
        getInItElements();
        footerMobileApp.click();
    }

    @Test
    public void testFooterSmallBizAhead(){
        getInItElements();
        footerSmallBizAhead.click();
    }

    @Test
    public void testFooterSmallBusinessPlaybook(){
        getInItElements();
        footerSmallBusinessPlayBook.click();
    }

    @Test
    public void testFooterExtraMile(){
        getInItElements();
        footerExtraMile.click();
    }

}
