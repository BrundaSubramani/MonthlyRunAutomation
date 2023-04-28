package PageFactory.AppJourney;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class monthlypaymentdetails {

    WebDriver driver;
    public monthlypaymentdetails(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void monthly_payment() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//*[text()= \"Continue to Credit Check\"]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebElement cont= driver.findElement(By.xpath("//*[@class=\"buttonInitial buttonRegular blueRegular right\"]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click()",cont);
        Thread.sleep(15000);
    }
}
