package testHomePage;//package testHomePage;

import homePage.SearchDoctor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;
import java.io.IOException;

public class TestSearchDoctor extends SearchDoctor {
    SearchDoctor searchDoctor;
    @Test
    public void testSearchDoctorsBySubmitButton()throws IOException{
        searchDoctor = PageFactory.initElements(driver, SearchDoctor.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchDoctor.searchDoctorsBySubmitButton();
    }
    @Test
    public void testSearchDoctorsByENTERKeyword() throws IOException, InterruptedException {
        searchDoctor = PageFactory.initElements(driver, SearchDoctor.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchDoctor.searchDoctorsByENTERKeyword();
    }
}