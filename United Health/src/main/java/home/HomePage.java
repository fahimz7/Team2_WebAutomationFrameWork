package home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends WebElementHomePage {

@FindBy(how= How.XPATH, using = xPathMainPageHomeTab)
    public static WebElement mainPageHomeTab;
    public static WebElement getMainPageHomeTab() {
        return mainPageHomeTab;
    }

    @FindBy(how= How.XPATH, using = xPathTypeInSearchBox)
    public static WebElement TypeInSearchBox;
    public static WebElement getTypeInSearchBox() {
        return TypeInSearchBox;
    }

    @FindBy(how= How.XPATH, using = xPathPressSearchButton)
        public static WebElement PressSearchButton;
        public static WebElement getPressSearchButton() {
            return PressSearchButton;
    }




    @FindBy (how= How.XPATH, using = xPathMainPageIndividualsAndFamilies)
    public static  WebElement mainPageIndividualsAndFamilies;
    public static WebElement getMainPageIndividualsAndFamilies() {
        return mainPageIndividualsAndFamilies;
    }

    @FindBy (how =How.XPATH, using = XPathMainPageEmployers)
    public static WebElement MainPageEmployers;
    public static WebElement getMainPageEmployers(){
        return MainPageEmployers;
    }

    @FindBy (how =How.XPATH, using = XPathMainPageMedicare)
    public static WebElement mainPageMedicare;
    public static WebElement getMainPageMedicare (){
        return mainPageMedicare;
    }

    @FindBy (how =How.XPATH, using = XPathMainPageLearnMore)
    public static WebElement mainPageLearnMore;
    public static WebElement getMainPageLearnMore () {
        return mainPageLearnMore;
    }



    @FindBy (how = How.XPATH, using=XPathMainPageLearnMore1)
    public static WebElement SignInPage;

    public static WebElement getSigninpage()
    {
        return SignInPage;
    }

    @FindBy (how=How.XPATH,using = UserNameinSignin)
    public static  WebElement UserName;

    @FindBy (how=How.XPATH,using = UserPasswordinSignin)
    public static  WebElement Password;

    @FindBy (how=How.XPATH,using = SigninButton)
    public static  WebElement Button;

    @FindBy (how = How.XPATH,using = error)
    public static  WebElement errors;

    @FindBy (how =How.XPATH, using = doctor)
    public static WebElement FindDoctor;


    @FindBy (how =How.XPATH, using = Grid1)
    public static WebElement grid1;


    @FindBy (how =How.XPATH, using = Grid2)
    public static WebElement grid2;


    @FindBy (how =How.XPATH, using = Grid3)
    public static WebElement grid3;

    @FindBy (how =How.XPATH, using = Grid1Picture)
    public static WebElement grid1Picture;

    @FindBy (how =How.XPATH, using = Grid2Picture)
    public static WebElement grid2Picture;

    @FindBy (how =How.XPATH, using = Grid3Picture)
    public static WebElement grid3Picture ;

    @FindBy (how =How.XPATH, using = Grid1Text)
    public static WebElement grid1Text ;

    @FindBy (how =How.XPATH, using = Grid2Text)
    public static WebElement grid2text ;

    @FindBy (how =How.XPATH, using = Grid3Text)
    public static WebElement grid3text ;

    @FindBy (how =How.XPATH, using = myuhc)
    public static WebElement MYUHC ;

    @FindBy (how =How.XPATH, using = Neducare)
    public static WebElement Neducares;

    @FindBy (how =How.XPATH, using = ForBrokers)
    public static WebElement Broker ;


    @FindBy (how =How.XPATH, using = ForProvider)
    public static WebElement Provider ;

    @FindBy (how =How.XPATH, using = UnitedHealthLogo)
    public static WebElement Logo ;

    @FindBy (how =How.XPATH, using = FirstPicture)
    public static WebElement firstPicture ;

    @FindBy(how = How.XPATH, using = AnotherSecure)
    public static WebElement Anothers;

}
