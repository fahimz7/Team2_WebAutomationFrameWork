package stepDefinitions;

import home.WebElementHomePage;
import io.cucumber.java.en.*;

public class HomepageAboutUsTab extends WebElementHomePage {

    @When("hover mouse on About Us Tab")
    public void hover_mouse_on_About_Us_Tab() throws InterruptedException {
        mouseHoverByXpath(xPathMouseHoverAboutUsTab);
        sleepFor(2);
    }

    @Then("click on Click on About The Hartford")
    public void click_on_Click_on_About_The_Hartford() throws InterruptedException {
        clickOnElement(xPathSelectAboutTheHartford);
        sleepFor(2);
    }

    @Then("click on Investor Relations")
    public void click_on_Investor_Relations() throws InterruptedException {
        clickOnElement(xPathSelectInvestorRelations);
        sleepFor(2);

    }

    @Given("click on Newsroom")
    public void click_on_Newsroom() throws InterruptedException {
        clickOnElement(xPathSelectNewsRoom);
        sleepFor(2);

    }

    @Given("click on Corporate Sustainability")
    public void click_on_Corporate_Sustainability() throws InterruptedException {
        clickOnElement(xPathSelectCorporateSustainability);
        sleepFor(2);
    }



}
