package homePage;

import base.BaseUtil;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class MainPage extends CommonAPI {
    @FindBy(xpath = "//img[@alt='Mount Sinai']")
    public static WebElement logo;
    @FindBy(linkText = "Find a Doctor")
    public static WebElement findADoctor;
    @FindBy(id = "hploc__sel-text-hosp")
    public static WebElement selectHospitals1;
    @FindBy(xpath = "//h3[contains(text(),'300+ Community Locations')]")
    public static WebElement communityLocations300Plus;
    @FindBy(xpath = "//span[contains(text(),'You can access Mount Sinai health care across New York City and beyond')]")
    public static WebElement captionOfSymbolOfMap;
    @FindBy(xpath = "//div[@class='nav navbar col-xs-12']//a[text()='Inside Mount Sinai Blog']")
    public static WebElement insideMountSinaiBlog;
    @FindBy(xpath = "//i[@class='fa fa-linkedin']")
    public static WebElement blogInLinkedIn;
    @FindBy(xpath = "//div[@class='nav col-xs-12 col-sm-4']//a[contains(text(),'International Services')]")
    public static WebElement internationalServices;
    @FindBy(xpath = "//div[@class='nav col-xs-12 col-sm-4']//a[text()='Find a Doctor']")
    public static WebElement findADoctor3;



    public void checkLogo() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        logo.click();
    }
    public void checkFindADoctor() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        findADoctor.click();
    }
    public void checkSelectHospitals1() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        selectHospitals1.click();
    }
    public void checkCommunityLocations300Plus() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        communityLocations300Plus.click();
    }
    public void checkCaptionOfSymbolOfMap() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        captionOfSymbolOfMap.click();
    }
    public void checkInsideMountSinaiBlog() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        insideMountSinaiBlog.click();
    }
    public void checkBlogInLinkedIn() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        blogInLinkedIn.click();
    }
    public void checkInternationalServices() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        internationalServices.click();
    }
    public void checkFindADoctor3() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        findADoctor3.click();
    }

}