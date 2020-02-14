package TestHome;

import home.HomePage;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.NoInjection;
import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;

public class TestHomePage extends HomePage {

    static HomePage homepage;
    public String Drug1 = "Adderall";
    public String Drug2 = "Add";
    public String Drug3 = "Adfakldkls";


    //PageFactory
    public void getInItElements(){
        homepage= PageFactory.initElements(driver,HomePage.class);}
    @Test
    public void testMainPageHomeTab() throws InterruptedException {
        getInItElements();
        getMainPageHomeTab().click();
        sleepFor(2);
}

    @Test
    public void testTypeInSearchBox() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Adderall");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }

    @Test
    public void testTypeInSearchBox2() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Acetaminophen");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }

    @Test
    public void testTypeInSearchBox3() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Alprazolam");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox4() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Amitriptyline");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox5() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Amlodipine");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox6() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Amoxicillin");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox7() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Ativan");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox8() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Atorvastatin");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox9() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Azithromycin");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox10() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Ciprofloxacin");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox11() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Citalopram");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox12() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Clindamycin");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox13() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Clonazepam");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox14() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Codeine");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox15() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Cyclobenzaprine");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox16() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Cymbalta");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox17() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Doxycycline");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox18() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Gabapentin");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox19() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Hydrochlorothiazide");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox20() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Ibuprofen");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox21() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Lexapro");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox22() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Lisinopril");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox23() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Loratadine");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox24() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Lorazepam");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox25() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Losartan");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox26() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Lyrica");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox27() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox28() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Meloxicam");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox29() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Metformin");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox30() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Metoprolol");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox31() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Naproxen");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox32() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Omeprazole");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }




    //PageFactory

    @Test
    public void testMainpageIndividualAndFamilies() throws InterruptedException {
        getInItElements();
        getMainPageIndividualsAndFamilies().click();
        sleepFor(2);
    }
    @Test
    public void testMainpageEmployers() throws InterruptedException {
        getInItElements();
        getMainPageEmployers().click();
        sleepFor(2);
    }


        @Test
        public void testMainpageMedicare() throws InterruptedException {
        getInItElements();
        getMainPageMedicare().click();
        sleepFor(2);

    }
    @Test
    public void testMainPageLearnMore() throws InterruptedException {
        getInItElements();
        getMainPageMedicare().click();
        getMainPageLearnMore().click();
        sleepFor(2);

    }

    @Test ()
    public void hello() throws InterruptedException {

        getInItElements();
        getSigninpage().click();
        sleepFor(10);
    }
    @Test
    public void FindDoctorClickable() throws InterruptedException {
        getInItElements();
        Assert.assertTrue(FindDoctor.isDisplayed() );
        Assert.assertTrue(FindDoctor.isEnabled() );
        FindDoctor.click();
    }

    @Test
    public void Grid1Display() throws InterruptedException {
        getInItElements();
        Assert.assertTrue(grid1.isDisplayed() );
    }
    @Test
    public void Grid2Display() throws InterruptedException {
        getInItElements();
        Assert.assertTrue(grid2.isDisplayed() );
    }
    @Test
    public void Grid3Display() throws InterruptedException {
        getInItElements();
        Assert.assertTrue(grid3.isDisplayed() );
    }

    @Test
    public void Grid1Picture() throws InterruptedException {
        getInItElements();
        Assert.assertTrue(grid1Picture.isDisplayed() );
    }

    @Test
    public void Grid2Picture() throws InterruptedException {
        getInItElements();
        Assert.assertTrue(grid2Picture.isDisplayed() );
    }

    @Test
    public void Grid3Picture() throws InterruptedException {
        getInItElements();
        Assert.assertTrue(grid3Picture.isDisplayed() );
    }

    @Test
    public void Grid1Text() throws InterruptedException {
        getInItElements();
        Assert.assertTrue(grid1Text.isDisplayed());
        //Assert.assertFalse(grid1Text.isDisplayed());
        // Assert.assertEquals(grid1Text,"Find out what screenings and exams are commonly recommended during a preventive care visit..","Text is not Equal");
    }

    @Test
    public void Grid2Text() throws InterruptedException {
        getInItElements();
        Assert.assertTrue(grid2text.isDisplayed());
        //Assert.assertEquals(grid2text,"Check your medication coverage, find a pharmacy near you, learn about home delivery and more..","Text is not Equal");
    }

    @Test
    public void Grid3Text() throws InterruptedException {
        getInItElements();
        Assert.assertTrue(grid3text.isDisplayed());
      //  Assert.assertFalse(grid3text.isDisplayed());
    }

    @Test
    public void ForBrokerLink() throws InterruptedException {
        getInItElements();
        Broker.isDisplayed();
        Broker.click();
          }

    @Test
    public void ForProvider() throws InterruptedException {
        getInItElements();
        Provider.isDisplayed();
        Provider.click();
    }

//    @Test
//    public void MedicareLink() throws InterruptedException {
//        getInItElements();
//        SignInPage.click();
//        Neducares.isDisplayed();
//        Neducares.click();
//           }


//    @Test
//    public void Foranothersecure() throws InterruptedException {
//        getInItElements();
//        SignInPage.click();
//        Anothers.isDisplayed();
//
//    }

    @Test
    public void Logo() throws InterruptedException {
        getInItElements();
        Logo.isDisplayed();
   }
}

