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
        setMouseHoverAutoTab();
        SelectCarInsurance.click();
       // driver.findElement(By.xpath("//h1[contains(text(),'AARP Auto Insurance Program From The Hartford')]")).getText();

        //String a=driver.findElement(By.xpath("//h1[contains(text(),'AARP Auto Insurance Program From The Hartford')]")).getText();
        //String actual= getCaptureTextCarInsurance().getText();
       // String expexted="AARP Auto Insurance Program From The Hartford";
       // Assert.assertEquals(actual,expexted);
        //System.out.println("test passed");
       sleepFor(2);
    }

    @Test
    public void testMouseHoverHomeTab(){
        getInItElements();
        setMouseHoverHomeTab();
        SelectHomeOwnerInsurance.click();
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



}

