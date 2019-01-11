package testHomePage;

import homePage.Search;  //beacause of testlogger
import homePage.SearchDepartment;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;

public class TestSearchDepartment extends SearchDepartment {
    SearchDepartment searchDepartment;
    @Test
    public void testSearchDepartmentBySubmitButton()throws IOException{
        searchDepartment = PageFactory.initElements(driver, SearchDepartment.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchDepartment.searchDepartmentBySubmitButton();
    }
    @Test
    public void testSearchDepartmentByENTERKeyword() throws IOException, InterruptedException {
        searchDepartment = PageFactory.initElements(driver, SearchDepartment.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchDepartment.searchDepartmentByENTERKeyword();
    }
}