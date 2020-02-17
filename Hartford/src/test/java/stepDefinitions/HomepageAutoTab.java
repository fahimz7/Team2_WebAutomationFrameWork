package stepDefinitions;

import home.WebElementHomePage;
import io.cucumber.java.en.*;

public class HomepageAutoTab extends WebElementHomePage {

    @When("Hover mouse on Auto tab")
    public void hover_mouse_on_Auto_tab() throws InterruptedException {
        mouseHoverByXpath(xPathMouseHoverAutoTab);
        sleepFor(2);
    }

    @Then("click on Car Insurance under Auto tab")
    public void click_on_Car_Insurance_under_Auto_tab() throws InterruptedException {
        sleepFor(2);
        clickOnElement(xPathselectCarInsurance);
        sleepFor(2);
    }

    @Given("click on Classic Car Insurance")
    public void click_on_Classic_Car_Insurance() throws InterruptedException {
        clickOnElement(xPathSelectClassicCarInsurance);
        sleepFor(2);

    }

    @Given("Click on All Vehicles")
    public void click_on_All_Vehicles() throws InterruptedException {
        clickOnElement(xPathSelectAllVehicles);
        sleepFor(2);

    }

    @Then("click on Car Insurance under All Vehicles")
    public void clickOnCarInsuranceUnderAllVehicles() throws InterruptedException {
        clickOnElement(xPathAutoTabAllVehiclesCarInsurance);
        sleepFor(2);
    }

    @Then("click on Classic Car Insurance Under All Vehicles")
    public void clickOnClassicCarInsuranceUnderAllVehicles() throws InterruptedException {
        clickOnElement(xPathAutoTabAllVehiclesClassicCarInsurance);
        sleepFor(2);

    }

    @Then("click on RV Insurance Under All Vehicles")
    public void clickOnRVInsuranceUnderAllVehicles() throws InterruptedException {
        clickOnElement(xPathAutoTabAllVehiclesRVInsurance);
        sleepFor(2);

    }

    @Then("click on ATV Insurance Under All Vehicles")
    public void clickOnATVInsuranceUnderAllVehicles() throws InterruptedException {
        clickOnElement(xPathAutoTabAllVehiclesATVInsurance);
        sleepFor(2);

    }

    @Then("click on Boat Insurance Under All Vehicles")
    public void clickOnBoatInsuranceUnderAllVehicles() throws InterruptedException {
        clickOnElement(xPathAutoTabAllVehiclesBoatInsurance);
        sleepFor(2);

    }

    @Then("click on Golf Cart Insurance Under All Vehicles")
    public void clickOnGolfCartInsuranceUnderAllVehicles() throws InterruptedException {
        clickOnElement(xPathAutoTabAllVehiclesGolfCartInsurance);
        sleepFor(2);

    }

    @Then("click on SnowMobile Insurance Under All Vehicles")
    public void clickOnSnowMobileInsuranceUnderAllVehicles() throws InterruptedException {
        clickOnElement(xPathAutoTabAllVehiclesSnowMobileInsurance);
        sleepFor(2);
    }

    @Then("click on Car Insurance Logo under All Vehicles")
    public void clickOnCarInsuranceLogoUnderAllVehicles() throws InterruptedException {
        clickOnElement(xPathAutoTabAllVehiclesCarInsuranceLogo);
        sleepFor(2);

    }

    @Then("click on Classic Car Insurance Logo Under All Vehicles")
    public void clickOnClassicCarInsuranceLogoUnderAllVehicles() throws InterruptedException {
        clickOnElement(xPathAutoTabAllVehiclesClassicCarInsuranceLogo);
        sleepFor(2);

    }

    @Then("click on RV Insurance Logo Under All Vehicles")
    public void clickOnRVInsuranceLogoUnderAllVehicles() throws InterruptedException {
        clickOnElement(xPathAutoTabAllVehiclesRVInsuranceLogo);
        sleepFor(2);

    }

    @Then("click on ATV Insurance Logo Under All Vehicles")
    public void clickOnATVInsuranceLogoUnderAllVehicles() throws InterruptedException {
        clickOnElement(xPathAutoTabAllVehiclesATVInsuranceLogo);
        sleepFor(2);

    }

    @Then("click on Boat Insurance Logo Under All Vehicles")
    public void clickOnBoatInsuranceLogoUnderAllVehicles() throws InterruptedException {
        clickOnElement(xPathAutoTabAllVehiclesBoatInsuranceLogo);
        sleepFor(2);

    }

    @Then("click on Golf Cart Insurance Logo Under All Vehicles")
    public void clickOnGolfCartInsuranceLogoUnderAllVehicles() throws InterruptedException {
        clickOnElement(xPathAutoTabAllVehiclesGolfCartInsuranceLogo);
        sleepFor(2);
    }

    @Then("click on SnowMobile Insurance Logo Under All Vehicles")
    public void clickOnSnowMobileInsuranceLogoUnderAllVehicles() throws InterruptedException {
        clickOnElement(xPathAutoTabAllVehiclesSnowMobileInsuranceLogo);
        sleepFor(2);
    }
}
