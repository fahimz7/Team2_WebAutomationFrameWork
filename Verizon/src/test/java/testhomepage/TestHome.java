package testhomepage;

import home.pageobject.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class TestHome extends HomePage {


    public static void InitElement() {
        PageFactory.initElements(driver, HomePage.class);
    }
     @Test(priority = 1)
      public static void testSearchBox () throws InterruptedException {
        InitElement();
        setSearchbox();
        Thread.sleep(2000);
    }
    @Test(priority = 2)
    public static void testWirelessButton () throws InterruptedException {
        InitElement();
        setWirelessButton();
        Thread.sleep(4000);
    }
    @Test(priority = 3)
    public static void testManuContainer() throws InterruptedException {
        InitElement();
        textMenuContainer();
        Thread.sleep(4000);
      }

    @Test(priority = 4)
   public void testPhoneXPath() throws InterruptedException{
        InitElement();
        doClickPhoneXPath();
        Thread.sleep(3000);
       //driver.navigate().back();
    }

}





