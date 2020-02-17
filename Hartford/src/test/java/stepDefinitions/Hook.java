package stepDefinitions;

import common.WebAPI;
import io.cucumber.java.en.*;

public class Hook extends WebAPI {

    @Given("Open Hartford website through chrome browser")
    public void open_Hartford_website_through_chrome_browser() {
        getLocalDriver("mac", "chrome");
        driver.get("https://www.thehartford.com");
    }

    @Then("close the browser")
    public void close_the_browser() {
        driver.close();

    }
}
