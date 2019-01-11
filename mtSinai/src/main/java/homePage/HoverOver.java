package homePage;

import base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

import java.util.List;

public class HoverOver extends BaseUtil {

    public void checkAboutUs() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        Actions builder = new Actions(driver); //USED IN BASEUTIL
        WebElement aboutUs = driver.findElement(By.xpath("//a[@class='hidden-xs dropdown' and contains(text(),'About Us')]"));
        Thread.sleep(2000);
        builder.moveToElement(aboutUs).build().perform();
        Thread.sleep(2000);
        System.out.println(aboutUs.getText());
    }
    public void checkListOfHoverOver() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        Actions builder = new Actions(driver);
        WebElement aboutUs = driver.findElement(By.xpath("//a[@class='hidden-xs dropdown' and contains(text(),'About Us')]"));
        Thread.sleep(2000);
        builder.moveToElement(aboutUs).build().perform();
        Thread.sleep(2000);
        System.out.println(aboutUs.getText());
        List<WebElement> list = driver.findElements(By.xpath("//span[contains(text(),'About Us')]//following-sibling::div[@class='menu-content']//a"));
        int totalCount = list.size();
        System.out.println(totalCount);
        for (int i =0; i < totalCount;i++){
            System.out.println(list.get(i).getText());
        }
    }
}
