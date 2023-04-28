package PageFactory.CFSimoNew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class TariffPage {

    WebDriver driver;
    public TariffPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"OthersmartphonesSIMQA2AWI_tbl-btn\"]")
    WebElement select50GB;

    @FindBy(xpath = "//*[@class= \"blueButtonGlobal tariffPageBtn selectedButtonSim continueClicked\"]")
    WebElement Continue;


    public void select_tariff()
    {
        select50GB.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Continue.click();
    }
}
