package testhome;

import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestHomePage extends WebAPI {

    static HomePage homepage;



    //PageFactory
    public void getInItElements(){
        homepage= PageFactory.initElements(driver,HomePage.class);



    }


    @Test(priority = 1)
    public void testDoSearch(){
        getInItElements();
        homepage.doSearch("car insurance");
    }

    @Test(priority = 2)
    public void testDoSearchForHomeInsurance(){
        getInItElements();
        homepage.doSearch("Home insurance");
    }

    @Test(enabled = false)
    public void testDoSearchForJewelery(){
        getInItElements();
        homepage.doSearch("insurance bundle");
    }

    @Test(dataProvider = "low cost insurance")
    public void testDoSearchForLowCostInsurance(){
        getInItElements();
        homepage.doSearch("Low Cost Insurance");
    }


}
