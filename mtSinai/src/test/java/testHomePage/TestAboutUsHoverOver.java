package testHomePage;

import homePage.AboutUsHoverOver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.List;

public class TestAboutUsHoverOver extends AboutUsHoverOver {
    AboutUsHoverOver aboutUsHoverOver;

    @BeforeMethod
    public void initElements() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        aboutUsHoverOver = PageFactory.initElements(driver, AboutUsHoverOver.class);
    }
    @Test
    public void testAboutUs () throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        aboutUsHoverOver.checkAboutUs();

        /*List<String> expected = new ArrayList<>();
        expected.add("ACCOUNT");
        expected.add("LOG IN");
        expected.add("or Create An Account");
        expected.add("My Account");
        expected.add("My Rewards");
        expected.add("Order Tracking & History");
        expected.add("Subscriptions Manager");
        expected.add("Payment Options");
        expected.add("Submit Return");
        expected.add("Reorder");
        expected.add("My Files");
*/
        //Assert.assertEquals(actual, expected);
    }

}

