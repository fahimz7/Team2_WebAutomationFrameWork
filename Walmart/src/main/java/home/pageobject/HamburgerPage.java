package home.pageobject;
import common.WebAPI;
import home.webelement.WebElementHamburgerPage;
import home.webelement.WebElementHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HamburgerPage extends WebElementHamburgerPage  {
    @FindBy(how = How.XPATH, using = WebElementHamburgerPage.webElementHamburgerButton)
    public static WebElement HamburgerButton;

    @FindBy(how = How.XPATH, using = WebElementHamburgerPage.webElementSavingsSpotLight)
    public static WebElement savingsSpotLight;

    @FindBy(how = How.XPATH, using = WebElementHamburgerPage.webElementHomeImprovement)
    public static WebElement homeImprovement;

    public static WebElement getHamburgerButton() {
        return HamburgerButton;
    }
    public static void doSearchHamburgerButton() {
        getHamburgerButton().click();
    }

    public static WebElement getSavingsSpotLight() {
        return savingsSpotLight;
    }
    public static void doHoverSavingsSpotLight() {
        Actions actions=new Actions(driver);
        actions.moveToElement(getSavingsSpotLight()).perform();
        driver.findElement(By.xpath(webElementHomeImprovement)).click();

    }



}

