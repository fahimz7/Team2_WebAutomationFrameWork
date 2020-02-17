package stepDefinitions;

import home.HomePage;
import home.WebElementHomePage;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.PageFactory;
import testhome.TestHomePage;

public class HomepageContactUsTab extends TestHomePage {
    static HomePage homepage;



//    //PageFactory
//    public void getInItElements(){
//        homepage= PageFactory.initElements(driver,HomePage.class);}


    @Then("click on Contact Us tab")
    public void click_on_Contact_Us_tab() throws InterruptedException {
//        getInItElements();
//        getTopBarContactUsTab().click();

        clickOnElement(xPathTopBarContactUsTab);
        sleepFor(2);
    }

    @Then("click on AARP Members Auto Insurance")
    public void click_on_AARP_Members_Auto_Insurance() throws InterruptedException {
        clickOnElement(xPathContactUsTabAARPMembersAutoInsurance);
//        getInItElements();
//        getContactUsTabAARPMembersAutoInsurance().click();
        sleepFor(2);
    }

    @Then("click on AARP Members Home Insurance and navigate back")
    public void click_on_AARP_Members_Home_Insurance_and_navigate_back() throws InterruptedException {
       clickOnElement(xPathContactUsTabAARPMembersHomeInsurance);
//        getInItElements();
//        getContactUsTabAARPMembersHomeInsurance().click();
            sleepFor(2);
    }


    @Then("click on Business Insurance and navigate back")
    public void click_on_Business_Insurance_and_navigate_back() throws InterruptedException {
        clickOnElement(xPathContactUsTabBusinessInsurance);
//        getInItElements();
//        getContactUsTabBusinessInsurance().click();
        sleepFor(2);
    }



    @Then("click on Auto Insurance and navigate back")
    public void click_on_Auto_Insurance_and_navigate_back() throws InterruptedException {
        clickOnElement(xPathContactUsTabAutoInsurance);
//        getInItElements();
//        getContactUsTabAutoInsurance().click();
        sleepFor(2);
    }



    @Then("click on Home Insurance and navigate back")
    public void click_on_Home_Insurance_and_navigate_back() throws InterruptedException {
       clickOnElement(xPathContactUsTabHomeInsurance);
//        getInItElements();
//        getContactUsTabHomeInsurance().click();
        sleepFor(2);
    }


    @Then("click on Financial Products and navigate back")
    public void click_on_Financial_Products_and_navigate_back() throws InterruptedException {
        clickOnElement(xPathContactUsTabFinancialProducts);
//        getInItElements();
//        getContactUsTabFinancialProducts().click();
        sleepFor(2);

    }

    @Then("click on Employee Benefits of Contact Us Tab and navigate back")
    public void click_on_Employee_Benefits_of_Contact_Us_Tab_and_navigate_back() throws InterruptedException {
//        getInItElements();
//        getContactUsTabEmploymentBenefirts().click();
         clickOnElement(xPathContactUsTabEmployeeBenefits);
        sleepFor(2);
    }



    @Then("Click on Agents and Producers and navigate back")
    public void click_on_Agents_and_Producers_and_navigate_back() throws InterruptedException {
//        getInItElements();
       clickOnElement(xPathContactUsTabAgentsAndProducers);
//        getContactUsTabAgentsAndProducers().click();
        sleepFor(2);
    }



    @Then("Click on Main Contact Information")
    public void click_on_Main_Contact_Information() throws InterruptedException {
      clickOnElement(xPathContactUsTabMainContactInformation);
//        getInItElements();
//        getContactUsTabMainContactInformation().click();
        sleepFor(2);
    }

}
