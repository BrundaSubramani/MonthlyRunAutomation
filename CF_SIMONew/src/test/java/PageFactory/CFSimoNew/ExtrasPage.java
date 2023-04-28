package PageFactory.CFSimoNew;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class ExtrasPage {

    WebDriver driver;
    public ExtrasPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[text()= \"Yes, add a Spend Cap\"]")
    WebElement addspendcap;

    @FindBy(xpath = "//*[text()= \"£50\"]")
    WebElement spendcapvalue;

    @FindBy(xpath = "//*[@id= \"capBtnSecond\"]")
    WebElement cont;

    @FindBy(xpath = "//a[@class='buttonInitial buttonLarge blueLight btnEnable']")
    WebElement nxtbutton;

    public void Extas_page() throws InterruptedException {
        addspendcap.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        spendcapvalue.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        cont.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        Thread.sleep(2000);
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("scroll(0,300)");
        Thread.sleep(2000);
        ((JavascriptExecutor)driver).executeScript("arguments[0].click()", nxtbutton);

    }

}
