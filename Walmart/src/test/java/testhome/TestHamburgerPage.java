package testhome;
import home.pageobject.HamburgerPage;
import home.pageobject.HamburgerPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestHamburgerPage extends HamburgerPage {
    static HamburgerPage hamburgerPage;
    public void getInItElements() {
        hamburgerPage = PageFactory.initElements(driver, HamburgerPage.class);
    }
    @Test(priority = 11)
    public void testDoHamburgerButton() throws InterruptedException {
        getInItElements();
        hamburgerPage.doSearchHamburgerButton();

        sleepFor(2);
    }
    @Test(priority = 12)
    public void testDoSavingsSpotLight() throws InterruptedException {
        getInItElements();
        sleepFor(2);
        hamburgerPage.doSearchHamburgerButton();
        sleepFor(2);
        doHoverSavingsSpotLight();

    }

}
