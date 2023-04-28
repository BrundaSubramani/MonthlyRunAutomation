package PageFactory.AFSimoNew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DeliveryDetails {

    WebDriver driver;
    public DeliveryDetails(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how= How.XPATH, using = "//*[@id=\"j_id0:o2TemplateDSMB:j_id1248:j_id1333\"]")
    public static WebElement deliverynextbutton;

    public void setDeliverynextbutton() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(deliverynextbutton));
        Thread.sleep(3000);
        deliverynextbutton.click();
        Thread.sleep(10000);
    }

}
