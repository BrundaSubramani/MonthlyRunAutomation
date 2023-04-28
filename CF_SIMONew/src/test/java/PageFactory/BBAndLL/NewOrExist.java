package PageFactory.BBAndLL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewOrExist {
    WebDriver driver;
    public NewOrExist(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"j_id0:o2TemplateDSMB:j_id31:tabIndex5007\"]")
    WebElement existButton;

    public  void existClick(){
        existButton.click();
    }
}
