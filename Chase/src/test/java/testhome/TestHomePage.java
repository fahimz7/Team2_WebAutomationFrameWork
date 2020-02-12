package testhome;


import home.pageObject.HomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class TestHomePage extends HomePage {
    public void getInItElements() {
        PageFactory.initElements(driver, HomePage.class);
    }



    @Test(priority =1 )
    public void testClickButton()throws InterruptedException{
        getInItElements();
        driver.manage().window().maximize();
        clickSearchButton();
        Thread.sleep(3000);
        writeSearchBox();
        Thread.sleep(2000);
    }





}











