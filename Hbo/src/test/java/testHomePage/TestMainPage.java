package testHomePage;

import homePage.MainPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestMainPage extends MainPage {

    MainPage mainPage;
    @BeforeMethod
    public void initialize() {
        TestLogger.log(convertToString(new Object(){}.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())); //implemented by Nasir
        mainPage = PageFactory.initElements(driver, MainPage.class);
    }
    @Test
    public void testLogo(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mainPage.checkLogo();
    }
    @Test
    public void testFindADoctor(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mainPage.checkFindADoctor();
    }
    @Test
    public void testCommunityLocations300Plus(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mainPage.checkCommunityLocations300Plus();
    }
    @Test
    public void testCaptionOfSymbolOfMap() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkCaptionOfSymbolOfMap();
    }
    @Test
    public void testInsideMountSinaiBlog() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkInsideMountSinaiBlog();
    }
    @Test
    public void testBlogInLinkedIn() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkBlogInLinkedIn();
    }
    @Test
    public void testInternationalServices() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkInternationalServices();
    }
    @Test
    public void testFindADoctor3() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkFindADoctor3();
    }
}
