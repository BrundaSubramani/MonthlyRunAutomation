package PageFactory.BBAndLL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class paymentdetails {

    WebDriver driver;
    public paymentdetails(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@class= \"textBoxCss checkAccountName\"]")
    WebElement accountname;

    @FindBy(xpath = "//*[@class= \"sortCodeTb1 textBoxCss checkSortCode1\"]")
    WebElement sortcode1;

    @FindBy(xpath = "//*[@class= \"sortCodeTb2 textBoxCss checkSortCode2\"]")
    WebElement sortcode2;

    @FindBy(xpath = "//*[@class= \"sortCodeTb3 textBoxCss checkSortCode3\"]")
    WebElement sortcode3;

    @FindBy(xpath = "//*[@class= \"textBoxCss checkAccountNumber\"]")
    WebElement accountnumber;

    @FindBy(xpath = "//*[@class= \"checkagreeDirectDebit\"]")
    WebElement checkbox;

    @FindBy(xpath = "(//*[@class= \"continue-button buttonInitial buttonRegular blueRegular left\"])[1]")
    WebElement next;

    public void payment_details() throws InterruptedException {
        accountname.sendKeys("Lisa Taylor");
        Thread.sleep(2000);
        sortcode1.sendKeys("20");
        Thread.sleep(2000);
        sortcode2.sendKeys("97");
        Thread.sleep(2000);
        sortcode3.sendKeys("78");
        Thread.sleep(2000);
        accountnumber.sendKeys("70372609");
        Thread.sleep(2000);
        checkbox.click();
        Thread.sleep(5000);
        next.click();

    }
}
