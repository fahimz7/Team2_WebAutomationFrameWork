package stepDefinitions;

import home.HomePage;
import home.WebElementHomePage;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class HomepageBottomTabAndLogo extends WebElementHomePage {

    @Then("Click on Car Insurance")
    public void click_on_Car_Insurance() throws InterruptedException {
        clickOnElement(xPathBottomTabCarInsurance);
        sleepFor(2);
    }

    @Then("Click on Home Insurance")
    public void click_on_Home_Insurance() throws InterruptedException {
        clickOnElement(xPathBottomTabHomeInsurance);
        sleepFor(2);

    }

    @Then("Click on Business Insurance")
    public void click_on_Business_Insurance() throws InterruptedException {
        clickOnElement(xPathBottomTabBusinessInsurance);
        sleepFor(2);
    }

    @Then("Click on Employee Benefits")
    public void click_on_Employee_Benefits() throws InterruptedException {
        clickOnElement(xPathBottomTabEmployeeBenefits);
        sleepFor(2);
    }

    @Then("Click on Car Insurance Logo")
    public void click_on_Car_Insurance_Logo() throws InterruptedException {
        clickOnElement(xPathBottomLogoCarInsurance);
        sleepFor(2);

    }

    @Then("Click on Home Insurance Logo")
    public void click_on_Home_Insurance_Logo() throws InterruptedException {
        clickOnElement(xPathBottomLogoHomeInsurance);
        sleepFor(2);
    }

    @Then("Click on Business Insurance Logo")
    public void click_on_Business_Insurance_Logo() throws InterruptedException {
        clickOnElement(xPathBottomLogoBusinessInsurance);
        sleepFor(2);
    }

    @Then("Click on Employee Benefits Logo")
    public void click_on_Employee_Benefits_Logo() throws InterruptedException {
        clickOnElement(xPathBottomLogoEmployeeBenefits);
        sleepFor(2);
    }

    @Then("Car Insurance rating stars is displayed")
    public void car_Insurance_rating_stars_is_displayed() throws InterruptedException {
        Assert.assertTrue(home.HomePage.carInsuranceRatingStars.isDisplayed());
        sleepFor(2);

    }

    @Then("Car Insurance rating score is displayed")
    public void car_Insurance_rating_score_is_displayed() {
    Assert.assertTrue(HomePage.carInsuranceRatingNumbers.isDisplayed());
    }

    @Then("Car Insurance rating reviews is displayed")
    public void car_Insurance_rating_reviews_is_displayed() {
        Assert.assertTrue(HomePage.carInsuranceRatingReviews.isDisplayed());

    }
}
