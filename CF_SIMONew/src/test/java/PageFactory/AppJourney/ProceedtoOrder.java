package PageFactory.AppJourney;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProceedtoOrder {
    WebDriver driver;
    public ProceedtoOrder(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//*[text()='Proceed to order'])[2]")
    WebElement PTOClick;

    public void clickProceedToOrder(){
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollBy(0,600)", "");
       // PTOClick.click();
        ((JavascriptExecutor)driver).executeScript("arguments[0].click()",PTOClick);

    }
}
