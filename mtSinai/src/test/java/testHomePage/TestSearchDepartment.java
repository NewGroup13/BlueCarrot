package testHomePage;

import homePage.Search;  //beacause of testlogger
import homePage.SearchDepartment;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;

public class TestSearchDepartment extends SearchDepartment {
    @Test
    public void testSearchDepartmentBySubmitButton()throws IOException{
        SearchDepartment searchDepartment = PageFactory.initElements(driver, SearchDepartment.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchDepartment.searchDepartmentBySubmitButton();
    }
    @Test
    public void testSearchDepartmentByENTERKeyword() throws IOException, InterruptedException {
        SearchDepartment searchDepartment = PageFactory.initElements(driver, SearchDepartment.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchDepartment.searchDepartmentByENTERKeyword();
    }
}