package PageFactory.AppJourney;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewOrExist_app {
    WebDriver driver;
    public NewOrExist_app(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"j_id0:o2TemplateDSMB:j_id31:tabIndex5007\"]")
    WebElement existButton;

    public  void existClick(){
        existButton.click();
    }
}
