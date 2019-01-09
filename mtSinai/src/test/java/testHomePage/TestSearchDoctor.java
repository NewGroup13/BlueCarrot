package testHomePage;//package testHomePage;

import homePage.SearchDoctor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;
import java.io.IOException;
import static base.BaseUtil.convertToString;

public class TestSearchDoctor extends SearchDoctor {
    @Test
    public void testSearchDoctorsBySubmitButton()throws IOException{
        SearchDoctor searchDoctor = PageFactory.initElements(driver, SearchDoctor.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchDoctor.searchDoctorsBySubmitButton();
    }
    @Test
    public void testSearchDoctorsByENTERKeyword() throws IOException, InterruptedException {
        SearchDoctor searchDoctor = PageFactory.initElements(driver, SearchDoctor.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchDoctor.searchDoctorsByENTERKeyword();
    }
}