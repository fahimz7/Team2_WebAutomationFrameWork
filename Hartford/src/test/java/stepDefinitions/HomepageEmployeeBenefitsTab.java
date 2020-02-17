package stepDefinitions;

import home.WebElementHomePage;
import io.cucumber.java.en.*;

public class HomepageEmployeeBenefitsTab extends WebElementHomePage {

    @When("Hover mouse on Employee Benefits")
    public void hover_mouse_on_Employee_Benefits() throws InterruptedException {
        mouseHoverByXpath(xPathMouseHoverEmployeeBenefitsTab);
        sleepFor(2);

    }

    @Then("click on Employee Benefits")
    public void click_on_Employee_Benefits() throws InterruptedException {
        sleepFor(2);
        clickOnElement(xPathSelectEmployeeBenefits);
        sleepFor(2);
    }

    @Then("click on Voluntary Benefits")
    public void click_on_Voluntary_Benefits() throws InterruptedException {
        clickOnElement(xPathSelectVoluntaryBenefits);
        sleepFor(2);

    }

    @Then("click on Absence Management")
    public void click_on_Absence_Management() throws InterruptedException {
        clickOnElement(xPathSelectAbsenceManagement);
        sleepFor(2);

    }

    @Then("click on For Employees")
    public void click_on_For_Employees() throws InterruptedException {
        clickOnElement(xPathSelectForEmployees);
        sleepFor(2);

    }

}
