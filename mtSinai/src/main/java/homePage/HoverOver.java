package homePage;

import base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

import java.util.List;

public class HoverOver extends BaseUtil {

    @FindBy (xpath = "//a[contains(text(),'About Us') and contains(@class,'hidden-xs dropdown')]")
    public static WebElement about;
   /* @FindBy (xpath = "//div[@class='menu-content']//a[text()='Our Mission']")
    public static WebElement ourMission;
    //@FindBy (xpath = "//li[@class='active open']//div[@class='menu-content']")
    @FindBy (xpath = "//li[@class='active open']//div[@class='menu-content']//ul//li//a")
    public static WebElement listOfAboutUs;*/

    public void checkAboutUs() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        //Actions builder = new Actions(driver);
        builder.moveToElement(about).perform();  //click hobe? Ans: hobe na, perform is enough
        sleepFor(5);
        System.out.println(about.getText());

    }
   /* *//*public List<String> getTextOfAboutUs() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        //Actions actions = new Actions(driver);
        builder.moveToElement(about).perform();
        sleepFor(5);
        List<String> items = getTextFromWebElemenths(about);
        return items;
    }*//*
    public List<WebElement> getList()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        Select dropDown = new Select((WebElement) driver.findElements(By.xpath("//li[@class='active open']//div[@class='menu-content']//ul//li//a")));
        List<WebElement> dropDownList = dropDown.getOptions(); //what is this line for?
        //List<String> dropDownListText = new ArrayList<>();
        //for(WebElement it:dropDownList){
            //dropDownListText.add(it.getText());
        for(int i = 0; i<dropDownList.size();i++){
            System.out.println(dropDownList.get(i));
        }
        return dropDownList;
    }
        public void getList2(){
        List<WebElement> dropDown = driver.findElements(By.xpath("//li[@class='active open']//div[@class='menu-content']//ul//li//a"));
        System.out.println(dropDown.size());
    }
    public void checkOurMission() throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        builder.moveToElement(about).perform();
        Thread.sleep(2000);
        builder.click(ourMission).perform();
        Thread.sleep(2000);
        System.out.println(ourMission);

    }*/
    public void checkListOfHoverOver() throws InterruptedException {
        Actions builder = new Actions(driver);
        WebElement aboutUs = driver.findElement(By.xpath("//a[@class='hidden-xs dropdown' and contains(text(),'About Us')]"));
        Thread.sleep(2000);
        builder.moveToElement(aboutUs).build().perform();
        Thread.sleep(2000);
        List<WebElement> list = driver.findElements(By.xpath("//span[contains(text(),'About Us')]//following-sibling::div[@class='menu-content']//a"));
        int totalCount = list.size();
        System.out.println(totalCount);
        for (int i =0; i < totalCount;i++){
            System.out.println(list.get(i).getText());
        }
    }
}
