package testhome;

import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomePage extends HomePage {

    static HomePage homepage;
    public String Drug1 = "Adderall";
    public String Drug2 = "Add";
    public String Drug3 = "Adfakldkls";


    //PageFactory
    public void getInItElements(){
        homepage= PageFactory.initElements(driver, HomePage.class);}
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
    @Test
    public void testTypeInSearchBox33() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Yasmin");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox34() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Yaz");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox35() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Yervoy");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox36() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Yescarta");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox37() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Yohimbe");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox38() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Yohimbine");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox39() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Yondelis");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox40() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Yupelri");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox41() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Yuafem");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox42() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Oxycodone");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox43() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Pantoprazole");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox44() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox45() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Prednisone");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox46() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Tramadol");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox47() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Trazodone");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox48() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Viagra");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox49() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Wellbutrin");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox50() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Xanax");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox51() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Zoloft");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox52() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Jadenu");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox53() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Jakafi");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox54() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Jalyn");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox55() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Jantoven");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox56() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Janume");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox57() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Janumet XR");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox58() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Januvia");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox59() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Jardiance");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox60() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Jasmiel");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox61() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Jatenzo");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox62() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Jencycla");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox63() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Jentadueto");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox64() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Jetadueto XR");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox65() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Jeuveau");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox66() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Jevantique");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox67() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Jevtana");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox68() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Jivi");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox69() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Jojoba");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox70() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Jolessa");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox71() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Jolivette");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox72() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Jornay PM");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox73() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Jublia");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox74() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Juluca");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox75() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Junel");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox76() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Junel 1/20");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox77() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Junel 1.5/30");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox78() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Junel Fe 1/20");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox79() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Junel Fe 1.5/30");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox80() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Juvederm");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox81() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Juxtapid");
        getPressSearchButton().click();
        sleepFor(2);
        getTypeInSearchBox().clear();
        sleepFor(2);
    }
    @Test
    public void testTypeInSearchBox82() throws InterruptedException {
        getInItElements();
        getTypeInSearchBox().sendKeys("Jynarque");
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

