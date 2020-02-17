package stepDefinitions;

import home.WebElementHomePage;
import io.cucumber.java.en.*;

public class HomepageClaimTab extends WebElementHomePage {

    @When("click on Claim tab")
    public void click_on_Claim_tab() throws InterruptedException {
        clickOnElement(xPathTopBarClaimsTab);
        sleepFor(2);

    }

    @Then("click on Personal Auto")
    public void click_on_Personal_Auto() throws InterruptedException {
        clickOnElement(xPathClaimTabPersonalAuto);
        sleepFor(2);
    }

    @Then("click on Home And Renters")
    public void click_on_Home_And_Renters() throws InterruptedException {
        clickOnElement(xPathClaimTabHomeAndRenters);
        sleepFor(2);

    }

    @Then("click on Employee Benefits of Claim Tab")
    public void click_on_Employee_Benefits_of_Claim_Tab() {
        clickOnElement(xPathClaimEmployeeBenefits);
    }

    @Then("click on Workers Compensation")
    public void click_on_Workers_Compensation() throws InterruptedException {
        clickOnElement(xPathClaimWorkersCompensation);
        sleepFor(2);
    }

    @Then("click on Commercial Auto")
    public void click_on_Commercial_Auto() throws InterruptedException {
        clickOnElement(xPathClaimCommercialAuto);
        sleepFor(2);

    }

    @Then("click on Commercial Property")
    public void click_on_Commercial_Property() throws InterruptedException {
        clickOnElement(xPathClaimCommericalPropertry);
        sleepFor(2);
    }

    @Then("click on General Liability")
    public void click_on_General_Liability() throws InterruptedException {
        clickOnElement(xPathClaimGeneralLiability);
        sleepFor(2);

    }

    @Then("click on Personal Auto Logo")
    public void click_on_Personal_Auto_Logo() throws InterruptedException {
        clickOnElement(xPathClaimTabLogoPersonalLiability);
        sleepFor(2);

    }

    @Then("click on Home And Renters Logo")
    public void click_on_Home_And_Renters_Logo() throws InterruptedException {
        clickOnElement(xPathClaimTabLogoHomeAndRenters);
        sleepFor(2);

    }

    @Then("click on Employee Benefits Logo of Claim Tab")
    public void click_on_Employee_Benefits_Logo_of_Claim_Tab() throws InterruptedException {
        clickOnElement(xPathClaimEmployeeBenefits);
        sleepFor(2);
    }

    @Then("click on Workers Compensation Logo")
    public void click_on_Workers_Compensation_Logo() throws InterruptedException {
        clickOnElement(xPathClaimWorkersCompensation);
        sleepFor(2);
    }

    @Then("click on Commercial Auto Logo")
    public void click_on_Commercial_Auto_Logo() throws InterruptedException {
       clickOnElement(xPathClaimTabLogoCommercialAuto);
        sleepFor(2);
    }

    @Then("click on Commercial Property Logo")
    public void click_on_Commercial_Property_Logo() throws InterruptedException {
        clickOnElement(xPathClaimTabLogoCommercialProperty);
        sleepFor(2);

    }

    @Then("click on General Liability Logo")
    public void click_on_General_Liability_Logo() throws InterruptedException {
        clickOnElement(xPathClaimTabLogoGeneralLiability);
        sleepFor(2);

    }
}
