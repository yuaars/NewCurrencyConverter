package tests;


import by.tut.pages.FinancePage;
import by.tut.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class FinancePageTest {

    private WebDriver driver;

    public FinancePageTest() {}

    /*@AfterMethod
    public void  quit() {

        driver.quit();
    }*/

    @Test
    public void currentCourseTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        HomePage homePage = new HomePage(driver);
        homePage.clickFinance();

        FinancePage financePage = new FinancePage(driver);
        financePage.getCurrentCourse();
        driver.quit();
    }

    @Test
    public void currentDateValidationTest(){
        WebDriver driver = new ChromeDriver();
        HomePage homePage = new HomePage(driver);
        homePage.clickFinance();

        FinancePage financePage = new FinancePage(driver);
        financePage.getCurrentDate();

        driver.quit();

    }
}


