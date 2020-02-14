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
    public void testQuoteBoxZipCodeSearch1(){
        getInItElements();
        outLineQuoteBox.click();
        quoteBoxZipCodeSearchBox.sendKeys("10462");
        quoteBoxSearchButton.click();

    }

    @Test
    public void testQuoteBoxZipCodeSearch2(){
        getInItElements();
        outLineQuoteBox.click();
        quoteBoxZipCodeSearchBox.sendKeys("11101");
        quoteBoxSearchButton.click();

    }

    @Test
    public void testQuoteBoxZipCodeSearch3(){
        getInItElements();
        outLineQuoteBox.click();
        quoteBoxZipCodeSearchBox.sendKeys("11");
        quoteBoxSearchButton.click();

    }

    @Test
    public void testQuoteBoxZipCodeSearch4(){
        getInItElements();
        outLineQuoteBox.click();
        quoteBoxZipCodeSearchBox.sendKeys("36830");
        quoteBoxSearchButton.click();

    }

    @Test
    public void testmouseHoverAutoTab1() throws InterruptedException {
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
    public void testMouseHoverHomeTab(){
        getInItElements();
        mouseHoverByXpath(xPathMouseHoverHomeTab);
        SelectHomeOwnerInsurance.click();
    }



    @Test
    public void testMouseHoverHomeTab1(){
        getInItElements();
        mouseHoverByXpath(xPathMouseHoverHomeTab);
        selectRentersInsurance.click();
    }

    @Test
    public void testMouseHoverHomeTab2(){
        getInItElements();
        mouseHoverByXpath(xPathMouseHoverHomeTab);
        selectCondoInsurance.click();
    }

    @Test
    public void testMouseHoverHomeTab3(){
        getInItElements();
        mouseHoverByXpath(xPathMouseHoverHomeTab);
        selectFloodInsurance.click();
    }

    @Test
    public void testMouseHoverHomeTab4(){
        getInItElements();
        mouseHoverByXpath(xPathMouseHoverHomeTab);
        selectUmbrellaInsurance.click();
    }

    @Test
    public void testMouseHoverBusinessTab(){
        getInItElements();
        mouseHoverByXpath(xPathMouseHoverBusinessTab);
        selectBusinessInsurance.click();
    }


    @Test
    public void testMouseHoverBusinessTab1(){
        getInItElements();
        mouseHoverByXpath(xPathMouseHoverBusinessTab);
        selectSmallBusinessInsurance.click();
    }


    @Test
    public void testMouseHoverBusinessTab2(){
        getInItElements();
        mouseHoverByXpath(xPathMouseHoverBusinessTab);
        selectGeneralLiabilityInsurance.click();
    }


    @Test
    public void testMouseHoverBusinessTab3(){
        getInItElements();
        mouseHoverByXpath(xPathMouseHoverBusinessTab);
        selectWorkersCompensationInsurance.click();
    }


    @Test
    public void testMouseHoverBusinessTab4(){
        getInItElements();
        mouseHoverByXpath(xPathMouseHoverBusinessTab);
        selectAllBusinessCoverageInsurance.click();
    }


    @Test
    public void testMouseHoverEmployeeBenefitsTab1(){
        getInItElements();
        mouseHoverByXpath(xPathMouseHoverEmployeeBenefitsTab);
        selectEmployeeBenefits.click();
    }

    @Test
    public void testMouseHoverEmployeeBenefitsTab2(){
        getInItElements();
        mouseHoverByXpath(xPathMouseHoverEmployeeBenefitsTab);
        selectVoluntaryBenefits.click();
    }

    @Test
    public void testMouseHoverEmployeeBenefitsTab3(){
        getInItElements();
        mouseHoverByXpath(xPathMouseHoverEmployeeBenefitsTab);
        selectAbsenceManagement.click();
    }


    @Test
    public void testMouseHoverEmployeeBenefitsTab4(){
        getInItElements();
        mouseHoverByXpath(xPathMouseHoverEmployeeBenefitsTab);
        selectForEmployees.click();
    }

    @Test
    public void testMouseHoverAboutUs1(){
        getInItElements();
        mouseHoverByXpath(xPathMouseHoverAboutUsTab);
        selectAboutTheHartford.click();
    }

    @Test
    public void testMouseHoverAboutUs2(){
        getInItElements();
        mouseHoverByXpath(xPathMouseHoverAboutUsTab);
        selectInvestoryRelations.click();
    }


    @Test
    public void testMouseHoverAboutUs3(){
        getInItElements();
        mouseHoverByXpath(xPathMouseHoverAboutUsTab);
        selectNewsRoom.click();
    }


    @Test
    public void testMouseHoverAboutUs4(){
        getInItElements();
        mouseHoverByXpath(xPathMouseHoverAboutUsTab);
        selectCorporateSustainability.click();
    }


    @Test
    public void testFindAnAgent1(){
        getInItElements();
        mouseHoverByXpath(xPathMouseHoverFindAnAgentTab);
        selectAutoAndHome.click();
    }

    @Test
    public void testFindAnAgent2(){
        getInItElements();
        mouseHoverByXpath(xPathMouseHoverFindAnAgentTab);
        selectSmallBusiness.click();
    }

    @Test
    public void testFindAnAgent3(){
        getInItElements();
        mouseHoverByXpath(xPathMouseHoverFindAnAgentTab);
        selectMidSizeBusiness.click();
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

    //@Test
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
}
