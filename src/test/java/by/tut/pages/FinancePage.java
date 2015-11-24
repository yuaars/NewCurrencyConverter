package by.tut.pages;


import helpers.DateValidator;
import helpers.Waiter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class FinancePage {

    private WebDriver driver;

    @FindBy(xpath = ".//*[@id='BYR_item']//input")
    private WebElement selectFieldBYR;

    @FindBy(xpath = ".//*[@id='USD_item']//input")
    private WebElement selectFieldUSD;

    @FindBy(xpath = ".//*[@id='k-nbrb']/div/table/tbody/tr[1]/td[2]/span")
    private WebElement currentNBRBCourse;

    @FindBy(xpath = ".//*[@id='convert_calendar']//a/span[1]")
    private WebElement currentDateString;

    public FinancePage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver,this);
    }

    public void getCurrentCourse() throws InterruptedException {
        selectFieldUSD.sendKeys("1");
        Waiter waiter = new Waiter(driver);
        //waiter.waitForElementPresence((By) selectFieldBYR,30);
        Thread.sleep(1);
        Assert.assertEquals(selectFieldBYR.getText(),currentNBRBCourse.getText());
    }

    public void getCurrentDate(){
        String currentDate = currentDateString.getText();

        DateValidator date = new DateValidator();
        date.dateChecker(currentDate);
    }
}
