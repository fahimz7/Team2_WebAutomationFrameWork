package stepDefinitions;

import home.WebElementHomePage;
import io.cucumber.java.en.*;

public class HomepageHomeTab extends WebElementHomePage {

    @When("hover mouse over Home tab")
    public void hover_mouse_over_Home_tab() throws InterruptedException {
        mouseHoverByXpath(xPathMouseHoverHomeTab);
        sleepFor(2);

    }

    @Then("click on Homeowners Insurance")
    public void click_on_Homeowners_Insurance() throws InterruptedException {
        clickOnElement(xPathSelectHomeOwnerInsurance);
        sleepFor(2);

    }

    @Then("click on Renters Insurance")
    public void click_on_Renters_Insurance() throws InterruptedException {
        clickOnElement(xPathSelectRentersInsurance);
        sleepFor(2);

    }

    @Then("click on condo Insurance")
    public void click_on_condo_Insurance() throws InterruptedException {
        clickOnElement(xPathSelectCondoInsurance);
       sleepFor(2);
    }

    @Then("click on Flood Insurance")
    public void click_on_Flood_Insurance() throws InterruptedException {
        clickOnElement(xPathSelectFloodInsurance);
        sleepFor(2);

    }

    @Then("click on umbrella Insurance")
    public void click_on_umbrella_Insurance() throws InterruptedException {
        clickOnElement(xPathSelectUmbrellaInsurance);
        sleepFor(2);

    }

}
