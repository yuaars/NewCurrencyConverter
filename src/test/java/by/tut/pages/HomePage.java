package by.tut.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver driver;
    private final String BASE_URL = "http://www.tut.by/";

    @FindBy(linkText = "Финансы")
    private WebElement buttonFinance;

    public HomePage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver,this);
    }

    public FinancePage clickFinance(){
        driver.get(BASE_URL);
        buttonFinance.click();
        return new FinancePage(this.driver);
    }
}
