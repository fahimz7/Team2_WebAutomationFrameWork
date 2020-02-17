package stepDefinitions;

import home.WebElementHomePage;
import io.cucumber.java.en.*;

public class HomepageFindAnAgentTab extends WebElementHomePage {

    @When("hover mouse over Find An Agent Tab")
    public void hover_mouse_over_Find_An_Agent_Tab() throws InterruptedException {
        mouseHoverByXpath(xPathMouseHoverFindAnAgentTab);
        sleepFor(2);
    }

    @Then("click on Auto and Home")
    public void click_on_Auto_and_Home() throws InterruptedException {
        clickOnElement(xPathSelectAutoAndHome);
        sleepFor(2);
    }

    @Then("click on Small Business")
    public void click_on_Small_Business() throws InterruptedException {
        clickOnElement(xPathSelectSmallBusiness);
        sleepFor(2);
    }

    @Then("click on MidSize Business")
    public void click_on_MidSize_Business() throws InterruptedException {
        clickOnElement(xPathSelectMidSizeBusiness);
        sleepFor(2);
    }

}
