package homePage;

import base.BaseUtil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import reporting.TestLogger;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class SearchDoctor extends BaseUtil {
    @FindBy(how = How.XPATH, using ="//a[@class='hidden-xs dropdown']//i[@class='fa fa-search']")
    public static WebElement searchKey;
    @FindBy(how = How.XPATH, using ="//div[@id='search-input-mega']//input[@name='q']")
    public static WebElement searchField;
    @FindBy(how = How.XPATH, using ="//div[@class='dropdown-menu mega-dropdown-menu search']//button[@class='btn btn-large']")
    public static WebElement submitButton;

    public List<String> getDoctorsList(){
        List<String> doctorsList = new ArrayList<String>();
        doctorsList.add("Valentin Fuster, MD, PhD");
        doctorsList.add("Usman Baber, MD");
        doctorsList.add("Jeffrey Bander, MD");
        doctorsList.add("Nitin Barman, MD");
        doctorsList.add("Johanna Contreras, MD");
        doctorsList.add("Lori B Croft, MD");
        doctorsList.add("George Dangas, MD, PhD");
        doctorsList.add("Asaad A Khan, MBBS");

        return doctorsList;
    }
    public void clickSearchKey(){
        searchKey.click();
    }
    public void putValueInSearchField(String value){
        searchField.sendKeys(value);
    }
    public void submitSearchButton(){
        submitButton.click();
    }
    public void clearInput(){ searchField.clear(); }

    public static void waitToBeVisible(){
        TestLogger.log(Search.class.getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchKey.click();
        wait.until(ExpectedConditions.visibilityOf(searchField));
    }
    public void searchDoctorsBySubmitButton()throws IOException {
        List<String> doctorsList = getDoctorsList();
        for(int i=0; i<doctorsList.size(); i++) {
            waitToBeVisible();  //need to be here
            //clickSearchKey();  //no need, if given test failed
            putValueInSearchField(doctorsList.get(i));
            submitSearchButton();
            clearInput();
        }
    }
    public void searchDoctorsByENTERKeyword()throws InterruptedException, IOException {
        List<String> doctorsList = getDoctorsList();
        for(String st: doctorsList) {
            waitToBeVisible();  //need to be here
            clickSearchKey();  //no need
            //putValueInSearchField().sendKeys(st, Keys.ENTER);  //ki hobe?
            clearInput();
        }
    }
}
