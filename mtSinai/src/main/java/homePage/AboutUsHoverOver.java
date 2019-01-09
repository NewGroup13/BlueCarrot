package homePage;

import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

import java.util.List;

public class AboutUsHoverOver extends BaseUtil {

    @FindBy (xpath = "//a[contains(text(),'About Us')]")
    public static WebElement about;

    public void checkAboutUs() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        //Actions actions = new Actions(driver);
        builder.moveToElement(about).perform();  //click hobe?
        sleepFor(5);
        System.out.println(about.getText());

    }
    /*public List<String> getTextOfAboutUs() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        actions.moveToElement(aboutUs).perform();
        sleepFor(5);
        List<String> items = getTextFromWebElements(aboutUs);
        return items;
    }*/
}
