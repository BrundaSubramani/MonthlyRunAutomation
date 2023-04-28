package PageFactory.BBAndLL;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContinuePage {
    WebDriver driver;
    public ContinuePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    //*[text()='Continue']
    @FindBy(xpath = "//*[@id=\"btnContinue_1\"]/span")
    WebElement continueButton1;

    @FindBy(xpath = "//*[@id=\"btnContinue_2\"]")
    WebElement continueButton2;

    public void clickContinue_1() {
        ((JavascriptExecutor)driver).executeScript("arguments[0].click()",continueButton1);
    }
    public void clickContinue_2(){
        ((JavascriptExecutor)driver).executeScript("arguments[0].click()",continueButton2);
    }

    //Landline


}
