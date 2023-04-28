package PageFactory.AFSimoNew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PaymentDetails {

    WebDriver driver;
    public PaymentDetails(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(how = How.XPATH, using = "//*[@id=\"j_id0:o2TemplateDSMB:j_id1337:j_id1446:j_id1447:gdprCheckbox9\"]")
    public static WebElement checkbox;

    @FindBy(how = How.XPATH, using = "//*[@id=\"j_id0:o2TemplateDSMB:j_id1337:hf2\"]")
    public static WebElement next;

    public void monthly_details() throws InterruptedException {
        checkbox.click();
        Thread.sleep(30000);
        next.click();
    }

}
