package PageFactory.BBAndLL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class confirmorder {

    WebDriver driver;
    public confirmorder(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@class= \"checkTermsandConditions\"]")
    WebElement checkbox;

    @FindBy(xpath = "(//*[text()= \"Confirm order\"])[1]")
    WebElement confirmorder;

    public void confirmorder() throws InterruptedException {
        checkbox.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        confirmorder.click();
        Thread.sleep(15000);
        System.out.println("The order ID is: ");
        System.out.println(driver.findElement(By.xpath("//*[@id=\"orderID\"]")).getText());
    }
}
