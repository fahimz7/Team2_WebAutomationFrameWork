package stepDefinitions;

import home.WebElementHomePage;
import io.cucumber.java.en.*;

public class HomepageFooterTab extends WebElementHomePage {


    @Then("Click on Auto")
    public void click_on_Auto() throws InterruptedException {
        clickOnElement(xPathFooterAuto);
        sleepFor(2);

    }

    @Then("Click on Home")
    public void click_on_Home() throws InterruptedException {
        clickOnElement(xPathFooterHome);
        sleepFor(2);
    }

    @Then("Click on Business")
    public void click_on_Business() throws InterruptedException {
        clickOnElement(xPathFooterBusiness);
        sleepFor(2);
    }

    @Then("Click on Employee Benefits of footer")
    public void click_on_Employee_Benefits_of_footer() throws InterruptedException {
        clickOnElement(xPathFooterEmployeeBenefits);
        sleepFor(2);
    }

    @Then("Click on Mutual Funds")
    public void click_on_Mutual_Funds() throws InterruptedException {
        clickOnElement(xPathFooterMutualFunds);
        sleepFor(2);
    }

    @Then("Click on About Us")
    public void click_on_About_Us() throws InterruptedException {
       clickOnElement(xPathFooterAboutUs);
       sleepFor(2);
    }

    @Then("Click on Careers")
    public void click_on_Careers() throws InterruptedException {
       clickOnElement(xPathFooterCareer);
       sleepFor(2);
    }

    @Then("Click on Agents And Producers")
    public void click_on_Agents_And_Producers() throws InterruptedException {
        clickOnElement(xPathFooterAgentsAndProducers);
        sleepFor(2);
    }

    @Then("Click on Newsroom")
    public void click_on_Newsroom() throws InterruptedException {
        clickOnElement(xPathFooterNewsRoom);
        sleepFor(2);
    }

    @Then("Click on Investor Relations")
    public void click_on_Investor_Relations() throws InterruptedException {
        clickOnElement(xPathFooterInvestorRelations);
        sleepFor(2);
    }

    @Then("Click on Contact US")
    public void click_on_Contact_US() throws InterruptedException {
        clickOnElement(xPathFooterContactUs);
        sleepFor(2);
    }

    @Then("Click on ReportAClaim")
    public void click_on_ReportAClaim() throws InterruptedException {
        clickOnElement(xPathFooterReportAClaim);
        sleepFor(2);
    }

    @Then("Click on FindAnAgent")
    public void click_on_FindAnAgent() throws InterruptedException {
        clickOnElement(xPathFooterFindAnAgent);
       sleepFor(2);
    }

    @Then("Click on Mobile App")
    public void click_on_Mobile_App() throws InterruptedException {
        clickOnElement(xPathFooterMobileApp);
        sleepFor(2);

    }

    @Then("Click on Small Biz Ahead")
    public void click_on_Small_Biz_Ahead() throws InterruptedException {
       clickOnElement(xPathFooterSmallBizAhead);
        sleepFor(2);
    }

    @Then("Click on Small Business Plan")
    public void click_on_Small_Business_Plan() throws InterruptedException {
        clickOnElement(xPathFooterSmallBusinessPlayBook);
        sleepFor(2);
    }

    @Then("Click on Extra Mile")
    public void click_on_Extra_Mile() throws InterruptedException {
        clickOnElement(xPathFooterExtraMile);
        sleepFor(2);

    }

}
