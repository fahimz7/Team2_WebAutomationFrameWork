package home;

import common.WebAPI;

public class WebElementHomePage extends WebAPI {

    public static final String idwebElementSearchBox="search-desktop";
    public static final String xpwebElementSearchButton="//*[@id=\"primary-nav\"]/div/div[1]/div/form/button/i";

    public static final String cssQuoteWebElementSelect="li.active";
    public static final String xPathQuoteWebElementSearchBox="//div[@class='form-group has-error']//input[@placeholder='Zip Code']";
    public static final String  cssQuoteWebElementSearchButton="body.page-wide:nth-child(2) div.home-page:nth-child(4) section.jumbotron:nth-child(2) div.marquee-hero-wrapper.animate-marquee div.container div.marquee-hero-content div.marquee-widget article.article-cqb div.widget-combined-quotebox div.cqb-getquote div.cqb-body div.cqb-content div.cqb-tab.active:nth-child(1) article:nth-child(1) form.getaquote.hig-form-wrapper:nth-child(3) > button.btn.btn-primary.btn-block:nth-child(8)";

    public static final String xPathMouseHoverAutoTab = "//a[@class='dropdown-toggle']//span[contains(text(),'Auto')]";
    public static final String xPathCaptureTextCarInsurance = "/h1[contains(text(),'AARP Auto Insurance Program From The Hartford')]";
    public static final String xPathselectCarInsurance = "//ul[@class='nav navbar-nav']//li[1]//ul[1]//li[1]//a[1]";
    public static final String xPathSelectClassicCarInsurance = "/html[1]/body[1]/header[1]/nav[1]/div[2]/div[1]/div[2]/div[1]/ul[1]/li[1]/ul[1]/li[2]/a[1]";
    public static final String linkTextSelectAllVehical= "All Vehicles";
    public static final String xPathSelectAllVehicles = "//a[contains(text(),'All Vehicles')]";


    public static final String xPathMouseHoverHomeTab = "/html[1]/body[1]/header[1]/nav[1]/div[2]/div[1]/div[2]/div[1]/ul[1]/li[2]";
    public static final String xPathSelectHomeOwnerInsurance = "//a[contains(text(),'Homeowners Insurance')]";
    public static final String xPathSelectRentersInsurance = "//a[contains(text(),'Renters Insurance')]";
    public static final String xPathSelectCondoInsurance="//a[contains(text(),'Condo Insurance')]";
    public static final String xPathSelectFloodInsurance = "//a[contains(text(),'Flood Insurance')]";
    public static final String xPathSelectUmbrellaInsurance= "//a[contains(text(),'Umbrella Insurance')]";

    public static final String xPathMouseHoverBusinessTab = "/html[1]/body[1]/header[1]/nav[1]/div[2]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]";
    public static final String xPathSelectBusinessInsurance= "/html[1]/body[1]/header[1]/nav[1]/div[2]/div[1]/div[2]/div[1]/ul[1]/li[3]/ul[1]/li[1]/a[1]";
    public static final String xPathSelectSmallBusinessInsurance= "//a[contains(text(),'Small Business Insurance')]";
    public static final String xPathSelectGeneralLiabilityInsurance= "//a[contains(text(),'General Liability Insurance')]";
    public static final String xPathSelectWorkersCompensationInsurance= "//a[contains(text(),\"Workers' Compensation Insurance\")]";
    public static final String xPathSelectAllBusinessCoveragesInsurance= "//a[contains(text(),'All Business Coverages')]";
    public static final String xPathSelectAllIndustries = "//a[contains(text(),'All Industries')]";

    public static final String xPathMouseHoverEmployeeBenefitsTab = "/html[1]/body[1]/header[1]/nav[1]/div[2]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]";
    public static final String xPathSelectEmployeeBenefits= "//ul[@class='dropdown-menu']//a[contains(text(),'Employee Benefits')]";
    public static final String xPathSelectVoluntaryBenefits = "//a[contains(text(),'Voluntary Benefits')]";
    public static final String xPathSelectAbsenceManagement = "//a[contains(text(),'Absence Management')]";
    public static final String xPathSelectForEmployees = "//a[contains(text(),'For Employees')]";

    public static final String xPathMouseHoverAboutUsTab = "//span[contains(text(),'About Us')]";
    public static final String xPathSelectAboutTheHartford = "//a[contains(text(),'About The Hartford')]";
    public static final String xPathSelectInvestorRelations = "//ul[@class='dropdown-menu']//a[contains(text(),'Investor Relations')]";
    public static final String xPathSelectNewsRoom = "//ul[@class='dropdown-menu']//a[contains(text(),'Newsroom')]";
    public static final String xPathSelectCorporateSustainability = "//a[contains(text(),'Corporate Sustainability')]";

    public static final String xPathMouseHoverFindAnAgentTab = "/html[1]/body[1]/header[1]/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]";
    public static final String xPathSelectAutoAndHome = "/html[1]/body[1]/header[1]/nav[1]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]";
    public static final String xPathSelectSmallBusiness = "/html[1]/body[1]/header[1]/nav[1]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[2]/a[1]";
    public static final String xPathSelectMidSizeBusiness = "/html[1]/body[1]/header[1]/nav[1]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[3]/a[1]";




    public static final String xPathMainLogo = "//a[@class='navbar-brand']//img";

    public static final String xPathBottomTabCarInsurance = "//span[@class='icon-arrow-right']//a[contains(text(),'Car Insurance')]";

    public static final String xPathBottomTabHomeInsurance = "//a[contains(text(),'Home Insurance')]";

    public static final String xPathBottomTabBusinessInsurance = "//span[@class='icon-arrow-right']//a[contains(text(),'Business Insurance')]";

    public static final String xPathBottomTabEmployeeBenefits = "//span[@class='icon-arrow-right']//a[contains(text(),'Employee Benefits')]";

    public static final String xPathBottomLogoCarInsurance = "//div[@class='flex-row']//div[1]//article[1]//div[1]//div[1]//div[1]//a[1]//div[1]";

    public static final String xPathBottomLogoHomeInsurance = "//div[2]//article[1]//div[1]//div[1]//div[1]//a[1]//div[1]";

    public static final String xPathBottomLogoBusinessInsurance = "//div[@class='expanded-row-primary']//div[3]//article[1]//div[1]//div[1]//div[1]//a[1]//div[1]";

    public static final String xPathBottomLogoEmployeeBenefits = "//div[4]//article[1]//div[1]//div[1]//div[1]//a[1]//div[1]";

    public static final String xPathTopBarClaimsTab = "//div[@class='navbar-header']//a[contains(text(),'Claims')]";

    public static final String xPathTopBarContactUsTab = "//div[@class='navbar-header']//a[contains(text(),'Contact Us')]";

    public static final String xPathTopBarAgentsTab = "//div[@class='navbar-header']//a[contains(text(),'Agents & Producers')]";

    public static final String xPathFullScreenImageHomePage= "//img[@class='marquee-hero-image']";

    public static final String xPathInspireImageHomePage = "/html[1]/body[1]/div[3]/main[1]/div[1]/section[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[1]/img[1]";

    public static final String xPathAbilityImageHomePage = "//article[@class='cw-story-left story-animation']//img[@class='img-lazy media-object']";

    public static final String xPathCareerImageHomePage = "//article[@class='cw-story-right story-animation']//img[@class='img-lazy media-object']";

    public static final String xPathClaimTabPersonalAuto = "/html[1]/body[1]/main[1]/div[2]/div[1]/section[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/a[1]";

    public static final String xPathClaimTabHomeAndRenters = "//a[contains(text(),'Home & Renters')]";

    public static final String xPathClaimEmployeeBenefits = "//span[@class='icon-arrow-right']//a[contains(text(),'Employee Benefits')]";

    public static final String xPathClaimWorkersCompensation = "//span[@class='icon-arrow-right']//a[contains(text(),\"Workers' Compensation\")]";

    public static final String xPathClaimCommercialAuto= "//a[contains(text(),'Commercial Auto')]";

    public static final String xPathClaimCommericalPropertry = "//a[contains(text(),'Commercial Property')]";

    public static final String xPathClaimGeneralLiability = "//span[@class='icon-arrow-right']//a[contains(text(),'General Liability')]";

    public static final String xPathClaimTabLogoPersonalLiability = "//div[@class='expanded-row-primary']//div[@class='flex-row']//div[1]//article[1]//div[1]//div[1]//div[1]//a[1]//div[1]";

    public static final String xPathClaimTabLogoHomeAndRenters = "//div[@class='expanded-row-primary']//div[2]//article[1]//div[1]//div[1]//div[1]//a[1]//div[1]";

    public static final String xPathClaimTabLogoEmployeeBenefits = "//div[@class='expanded-row-primary']//div[3]//article[1]//div[1]//div[1]//div[1]//a[1]//div[1]";

    public static final String xPathClaimTabLogoWorkersCompensation = "//div[4]//article[1]//div[1]//div[1]//div[1]//a[1]//div[1]";

    public static final String xPathClaimTabLogoCommercialAuto = "//body[@class='page-wide']/main/div[@class='container']/section[@class='full-width-row']/div[@class='flex-row']/div[1]/article[1]/div[1]/div[1]/div[1]/a[1]/div[1]";;

    public static final String xPathClaimTabLogoCommercialProperty = "//body[@class='page-wide']/main/div[@class='container']/section[@class='full-width-row']/div[@class='flex-row']/div[2]/article[1]/div[1]/div[1]/div[1]/a[1]/div[1]";

    public static final String xPathClaimTabLogoGeneralLiability = "//body[@class='page-wide']/main/div[@class='container']/section[@class='full-width-row']/div[@class='flex-row']/div[3]/article[1]/div[1]/div[1]/div[1]/a[1]/div[1]";

    public static final String xPathContactUsTabAARPMembersAutoInsurance = "/html[1]/body[1]/main[1]/div[2]/section[1]/div[1]/div[1]/div[1]/div[1]/a[1]/h4[1]";

    public static final String xPathContactUsTabAARPMembersHomeInsurance = "/html[1]/body[1]/main[1]/div[2]/section[1]/div[1]/div[1]/div[1]/div[2]/a[1]/h4[1]";

    public static final String xPathContactUsTabBusinessInsurance = "/html[1]/body[1]/main[1]/div[2]/section[1]/div[1]/div[1]/div[1]/div[3]/a[1]/h4[1]";

    public static final String xPathContactUsTabAutoInsurance = "/html[1]/body[1]/main[1]/div[2]/section[1]/div[1]/div[1]/div[1]/div[4]/a[1]/h4[1]";

    public static final String xPathContactUsTabHomeInsurance = "/html[1]/body[1]/main[1]/div[2]/section[1]/div[1]/div[1]/div[1]/div[5]/a[1]/h4[1]";

    public static final String xPathContactUsTabFinancialProducts = "/html[1]/body[1]/main[1]/div[2]/section[1]/div[1]/div[1]/div[1]/div[6]/a[1]/h4[1]";

    public static final String xPathContactUsTabEmployeeBenefits = "/html[1]/body[1]/main[1]/div[2]/section[1]/div[1]/div[1]/div[1]/div[7]/a[1]/h4[1]";

    public static final String xPathContactUsTabAgentsAndProducers = "/html[1]/body[1]/main[1]/div[2]/section[1]/div[1]/div[1]/div[1]/div[8]/a[1]/h4[1]";

    public static final String xPathContactUsTabMainContactInformation = "/html[1]/body[1]/main[1]/div[2]/section[1]/div[1]/div[1]/div[1]/div[9]/a[1]/h4[1]";


    public static final String xPathOutlineQuoteBox = "//div[@class='widget-combined-quotebox']";
    public static final String xPathQuoteBoxAutoBox = "//li[@class='active']";
    public static final String xPathQuoteBoxZipCodeSearchBox = "//div[@id='cqb-1444641621794']//input[@placeholder='Zip Code']";
    public static final String xPathQuoteBoxSearchButton = "//div[@id='cqb-1444641621794']//button[@class='btn btn-primary btn-block'][contains(text(),'Start Quote')]";
    public static final String xPathQuoteBoxHomeAndCondo = "//div[@class='wrapper-icon']//i[@class='icon icon-house']";
    public static final String xPathQuoteBoxZipCodeSearchBoxHomeAndCondo = "/html[1]/body[1]/div[3]/section[1]/div[1]/div[2]/div[1]/div[2]/article[1]/div[1]/div[1]/div[1]/div[2]/div[2]/article[1]/form[1]/div[2]/input[1]";
    public static final String xPathQuoteBoxSearchButtonHomeAndCondo = "/html[1]/body[1]/div[3]/section[1]/div[1]/div[2]/div[1]/div[2]/article[1]/div[1]/div[1]/div[1]/div[2]/div[2]/article[1]/form[1]/button[1]";
    public static final String xPathQuoteBoxBusiness = "/html[1]/body[1]/div[3]/section[1]/div[1]/div[2]/div[1]/div[2]/article[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]";
    public static final String xPathQuoteBoxQuoteTodayButton = "//span[contains(text(),'Quote Today')]";

    public static final String xPathCarInsuranceRatingStars = "//div[@id='pr-1444643148108']//div[@class='hig-aggregate-stars']";
    public static final String xPathCarInsuranceRatingNumbers = "/html[1]/body[1]/div[3]/main[1]/div[3]/div[1]/section[1]/div[1]/div[1]/article[1]/div[2]/div[1]/div[1]/div[2]/div[1]";
    public static final String xPathCarInsuranceRatingReviews = "/html[1]/body[1]/div[3]/main[1]/div[3]/div[1]/section[1]/div[1]/div[1]/article[1]/div[2]/div[1]/div[1]/div[2]/div[2]/a[1]";


    public static final String xPathAutoTabAllVehiclesCarInsurance= "/html[1]/body[1]/main[1]/div[2]/section[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/a[1]";
    public static final String xPathAutoTabAllVehiclesClassicCarInsurance= "//span[@class='icon-arrow-right']//a[contains(text(),'Classic Car Insurance')]";
    public static final String xPathAutoTabAllVehiclesRVInsurance= "//a[contains(text(),'RV Insurance')]";
    public static final String xPathAutoTabAllVehiclesATVInsurance= "//div[4]//article[1]//div[1]//div[1]//div[2]//div[1]//div[1]//span[1]";
    public static final String xPathAutoTabAllVehiclesBoatInsurance= "//a[contains(text(),'Boat Insurance')]";
    public static final String xPathAutoTabAllVehiclesGolfCartInsurance= "//a[contains(text(),'Golf Cart Insurance')]";
    public static final String xPathAutoTabAllVehiclesSnowMobileInsurance= "//a[contains(text(),'Snowmobile Insurance')]";

    public static final String xPathAutoTabAllVehiclesCarInsuranceLogo= "//div[2]//section[1]//div[1]//div[1]//article[1]//div[1]//div[1]//div[1]//a[1]//img[1]";
    public static final String xPathAutoTabAllVehiclesClassicCarInsuranceLogo= "//div[2]//section[1]//div[1]//div[2]//article[1]//div[1]//div[1]//div[1]//a[1]//img[1]";
    public static final String xPathAutoTabAllVehiclesRVInsuranceLogo= "//div[2]//section[1]//div[1]//div[3]//article[1]//div[1]//div[1]//div[1]//a[1]//img[1]";
    public static final String xPathAutoTabAllVehiclesATVInsuranceLogo= "//div[4]//article[1]//div[1]//div[1]//div[1]//a[1]//img[1]";
    public static final String xPathAutoTabAllVehiclesBoatInsuranceLogo= "//div[3]//section[1]//div[1]//div[1]//article[1]//div[1]//div[1]//div[1]//a[1]//img[1]";
    public static final String xPathAutoTabAllVehiclesGolfCartInsuranceLogo= "//div[3]//section[1]//div[1]//div[2]//article[1]//div[1]//div[1]//div[1]//a[1]//img[1]";
    public static final String xPathAutoTabAllVehiclesSnowMobileInsuranceLogo= "//div[3]//section[1]//div[1]//div[2]//article[1]//div[1]//div[1]//div[1]//a[1]//img[1]";



    public static final String xPathFooterAuto = "/html[1]/body[1]/footer[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]";

    public static final String xPathFooterHome = "/html[1]/body[1]/footer[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]";

    public static final String xPathFooterBusiness = "/html[1]/body[1]/footer[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]";

    public static final String xPathFooterEmployeeBenefits = "/html[1]/body[1]/footer[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]";

    public static final String xPathFooterMutualFunds = "/html[1]/body[1]/footer[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[5]/a[1]";

    public static final String xPathFooterAboutUs = "/html[1]/body[1]/footer[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/a[1]";

    public static final String xPathFooterCareer = "/html[1]/body[1]/footer[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]";

    public static final String xPathFooterAgentsAndProducers = "/html[1]/body[1]/footer[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[3]/a[1]";

    public static final String xPathFooterNewsRoom = "/html[1]/body[1]/footer[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[4]/a[1]";

    public static final String xPathFooterInvestorRelations = "/html[1]/body[1]/footer[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[5]/a[1]";

    public static final String xPathFooterContactUs = "/html[1]/body[1]/footer[1]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[1]/a[1]";

    public static final String xPathFooterReportAClaim = "/html[1]/body[1]/footer[1]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[2]/a[1]";

    public static final String xPathFooterFindAnAgent = "/html[1]/body[1]/footer[1]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[3]/a[1]";

    public static final String xPathFooterMobileApp = "/html[1]/body[1]/footer[1]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[4]/a[1]";

    public static final String xPathFooterSmallBizAhead = "/html[1]/body[1]/footer[1]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[4]/a[1]";

    public static final String xPathFooterSmallBusinessPlayBook = "/html[1]/body[1]/footer[1]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[6]/a[1]";

    public static final String xPathFooterExtraMile = "/html[1]/body[1]/footer[1]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[7]/a[1]";


}
