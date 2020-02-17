package stepDefinitions;

import home.WebElementHomePage;
import io.cucumber.java.en.*;

public class HomepageBusinessTab extends WebElementHomePage {

    @When("hover mouse over Business tab")
    public void hover_mouse_over_Business_tab() throws InterruptedException {
        mouseHoverByXpath(xPathMouseHoverBusinessTab);
     sleepFor(2);
    }

    @Then("click on Business insurance and navigate back to homepage")
    public void click_on_Business_insurance_and_navigate_back_to_homepage() throws InterruptedException {
        clickOnElement(xPathSelectBusinessInsurance);
        sleepFor(2);
    }

    @Then("click on Small Business insurance and navigate back to homepage")
    public void click_on_Small_Business_insurance_and_navigate_back_to_homepage() throws InterruptedException {
        clickOnElement(xPathSelectSmallBusinessInsurance);
        sleepFor(2);
    }

    @Then("click on General Liability insurance and navigate back to homepage")
    public void click_on_General_Liability_insurance_and_navigate_back_to_homepage() throws InterruptedException {
        clickOnElement(xPathSelectGeneralLiabilityInsurance);
        sleepFor(2);

    }

    @Then("click on Workers Compensation insurance and navigate back to homepage")
    public void click_on_Workers_Compensation_insurance_and_navigate_back_to_homepage() throws InterruptedException {
        clickOnElement(xPathSelectWorkersCompensationInsurance);
        sleepFor(2);
    }

    @Then("click on All Business Coverage and navigate back to homepage")
    public void click_on_All_Business_Coverage_and_navigate_back_to_homepage() throws InterruptedException {
       clickOnElement(xPathSelectAllBusinessCoveragesInsurance);
        sleepFor(2);
    }

    @Then("click on All Industries and navigate back to homepage")
    public void click_on_All_Industries_and_navigate_back_to_homepage() {
       clickOnElement(xPathSelectAllIndustries);
    }

}
