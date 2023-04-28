package PageFactory.AFSimoNew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BusinessDetails {

    WebDriver driver;
    public BusinessDetails(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"j_id0:o2TemplateDSMB:j_id31:srMoveMobile:1\"]")
    WebElement movempntoO2;

    @FindBy(xpath = "//*[@id=\"j_id0:o2TemplateDSMB:j_id31:accountNameInputtxt\"]")
    WebElement accountname;

    @FindBy(xpath = "//*[@class= \"sortCodeTb1\"]")
    WebElement sortcode1;


    @FindBy(xpath = "//*[@class= \"sortCodeTb2\"]")
    WebElement sortcode2;

    @FindBy(xpath = "//*[@class= \"sortCodeTb3\"]")
    WebElement sortcode3;

    @FindBy(xpath = "//*[@id=\"j_id0:o2TemplateDSMB:j_id31:accountNumberInputtxt\"]")
    WebElement accnumber;

    @FindBy(xpath = "//*[@id=\"j_id0:o2TemplateDSMB:j_id31:txtcbAgreeDirectDebit\"]")
    WebElement checkbox;

    @FindBy(xpath = "//*[@class=\"accnext2 buttonInitial buttonRegular blueRegular left\"]")
    WebElement checkyourdetails;

    @FindBy(how= How.XPATH, using = "//*[@id=\"j_id0:o2TemplateDSMB:j_id31:proceedToPersonalDetail\"]")
    public static WebElement next;

    public void business_details() throws InterruptedException {
        movempntoO2.click();
        Select companytype= new Select(driver.findElement(By.id("j_id0:o2TemplateDSMB:j_id31:businessType")));
        companytype.selectByValue("Business Professional");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        accountname.sendKeys("Lisa Taylor");
        Thread.sleep(2000);
        sortcode1.sendKeys("20");
        Thread.sleep(2000);
        sortcode2.sendKeys("93");
        Thread.sleep(2000);
        sortcode3.sendKeys("15");
        Thread.sleep(5000);
        accnumber.sendKeys("93940101");
        Thread.sleep(2000);
        checkbox.click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        checkyourdetails.click();
        Thread.sleep(20000);
        next.click();
    }
}
