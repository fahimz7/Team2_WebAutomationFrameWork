package home.pageObject;

import home.webelement.WebElementHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends WebElementHomePage {
    @FindBy(how = How.XPATH, using = WebElementHomePage.WebElementSearchButton)
    public static WebElement searchButton;


    @FindBy(how = How.XPATH, using = WebElementHomePage.WebElemntSearchBox)
    public static WebElement searchBox;

public static WebElement getSearchButton(){
    return searchButton;
}

public static WebElement getSearchBox(){
    return searchBox;
}

public static void clickSearchButton() throws InterruptedException {
    driver.findElement(By.xpath(WebElementSearchButton)).click();
}
public static void writeSearchBox() {
    driver.findElement(By.xpath(WebElemntSearchBox)).sendKeys("Credit Card");
}
}



