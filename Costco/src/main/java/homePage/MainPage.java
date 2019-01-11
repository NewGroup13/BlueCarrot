package homePage;

import base.BaseUtil;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class MainPage extends CommonAPI {
    @FindBy(id = "warehouse-savings")
    public static WebElement viewWareHouseSavings;
    @FindBy(id="warehouse-locations-dropdown")
    public static WebElement FindaWarehouse;
    @FindBy(id="email-signup-dropdown")
    public static WebElement GetEmailOffers;
    @FindBy(id="customer-service-link")
    public static WebElement CustomerService;
    @FindBy(xpath ="//a[@id='country-select']" )
    public static WebElement us;
    @FindBy(xpath ="//div[@class='table-cell logo hidden-xs hidden-sm hidden-md hidden-lg']//img[@class='bc-logo logo-us']" )
    public static WebElement logo;
    @FindBy(id="search-dropdown-select")
    public static WebElement All;
    @FindBy(xpath ="//input[@id='search-field']" )
    public static WebElement search;
    @FindBy(id="header_sign_in")
    public static WebElement SignInRegister;
    @FindBy(id="cart-d")
    public static WebElement Cart;
    @FindBy(id="navigation-dropdown")
    public static WebElement ShopAllDepartment;
    @FindBy(xpath="//a[@id='Home_Ancillary_0']")
    public static WebElement Grocery;
    @FindBy(xpath="//a[@id='Home_Ancillary_1']")
    public static WebElement BusinessDelivery;
    @FindBy(xpath="//a[@id='Home_Ancillary_2']")
    public static WebElement Optical;
    @FindBy(xpath="//a[@id='Home_Ancillary_3']")
    public static WebElement Pharmacy;
    @FindBy(xpath="//a[@id='Home_Ancillary_4']")
    public static WebElement Services;
    @FindBy(xpath="//a[@id='Home_Ancillary_5']")
    public static WebElement Photo;
    @FindBy(xpath="//a[@id='Home_Ancillary_6']")
    public static WebElement Travel;
    @FindBy(xpath="//a[@id='Home_Ancillary_7']")
    public static WebElement Membership;
    @FindBy(xpath="//a[@id='Home_Ancillary_0']")
    public static WebElement Location; // Have to fix
    @FindBy(xpath="//div[text()='Customer Service']")
    public static WebElement customerService;
    @FindBy(className="get-help")
    public static WebElement getHelp;
    @FindBy(id="footer-find-warehouse-block")
    public static WebElement findaWarehouse;
    @FindBy(id="footer-email-offers-block")
    public static WebElement getGetEmailOffers;
    @FindBy(xpath="//input[@id='footer-search-field']")
    public static WebElement cityStateZip;
    @FindBy(xpath="//input[@id='footer-email-offers']")
    public static WebElement enterYourEmail;
    @FindBy(xpath="//div[text()='Follow Us']")
    public static WebElement followUs;
    @FindBy(xpath="//ul[@class='social']//i[@class='fi-social-facebook']")
    public static WebElement facebookLogo;
    @FindBy(xpath="//ul[@class='social']//i[@class='fi-social-pinterest']")
    public static WebElement pLogo;


    public void checkviewWareHouseSavings(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        viewWareHouseSavings.click();
    }
    public void checkFindaWarehouse(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        FindaWarehouse.click();
    }
    public void checkGetEmailOffers(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        GetEmailOffers.click();
    }
    public void checkCustomerService(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CustomerService.click();
    }
    public void checkus(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        us.click();
    }
    public void checkLogo(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        logo.click();
    }
    public void checkAll(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        All.click();
    }
    public void checkSearch(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        search.click();
    }
    public void checkSignInRegister(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SignInRegister.click();
    }
    public void checkCart(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Cart.click();
    }
    public void checkGrocery(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Grocery.click();
    }
    public void checkShopAllDepartment(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Grocery.click();
    }
    public void checkBusinessDelivery(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        BusinessDelivery.click();
    }
    public void checkOptical(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Optical.click();
    }
    public void checkPharmacy(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Pharmacy.click();
    }
    public void checkServices(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Services.click();
    }
    public void checkPhoto(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Photo.click();
    }
    public void checkTravel(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Travel.click();
    }
    public void checkMembership(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Membership.click();
    }
    public void checkLocation(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Location.click();
    }
    public void customerService(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        customerService.click();
    }
    public void getHelp(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getHelp.click();
    }
    public void findaWarehouse(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        findaWarehouse.click();
    }

    public void getGetEmailOffers(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getGetEmailOffers.click();
    }
    public void cityStateZip(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        cityStateZip.click();
    }
    public void enterYourEmail(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        enterYourEmail.click();
    }
    public void followUs(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        followUs.click();
    }
    public void facebookLogo(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        facebookLogo.click();
    }
    public void pLogo(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        pLogo.click();
    }





}