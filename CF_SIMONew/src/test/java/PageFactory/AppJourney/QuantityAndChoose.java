package PageFactory.AppJourney;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class QuantityAndChoose {
    WebDriver driver;
    public QuantityAndChoose(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//*[text()='Choose']")
    WebElement choose;


    public void clickOnChoose(String qty) throws InterruptedException {
        Thread.sleep(5000);
        Select quanity= new Select(driver.findElement(By.xpath("//label[.=\"Number of licenses\"]/../..//select")));
       quanity.selectByValue(qty);
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
       choose.click();
    }
}
