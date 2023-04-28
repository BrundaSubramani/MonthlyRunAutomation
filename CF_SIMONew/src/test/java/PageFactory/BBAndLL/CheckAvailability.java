package PageFactory.BBAndLL;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckAvailability {
    WebDriver driver;
    public CheckAvailability(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"j_id0:j_id14:o2TemplateDSMB:j_id517:bcTransferPostCode\"]")
    WebElement Postcode;

    @FindBy(xpath = "//*[@id=\"j_id0:j_id14:o2TemplateDSMB:j_id517:bcTransferNumber\"]")
    WebElement fixedlinenumber;

    @FindBy(xpath = "//*[@id='j_id0:j_id14:o2TemplateDSMB:j_id517:bcExistingNumber']")
    WebElement mpn;

    @FindBy(xpath = "//*[text()='Check']")
    WebElement check;



    public void enterdetails(String postcode, String fixedline, String o2mobilenumber) {
        Postcode.sendKeys(postcode);
        fixedlinenumber.sendKeys(fixedline);
        mpn.sendKeys(o2mobilenumber);
    }

    public void clickCheck(){
        check.click();
    }

//Forlandline code

    @FindBy(xpath = "//*[@id=\"transferNumber\"]")
    WebElement landline_phone_number;

    @FindBy(xpath = "//*[@id=\"transferPostcode\"]")
    WebElement pincode_enter;

    @FindBy(xpath = "//*[@id=\"btnContinue_0\"]")
    WebElement ButtonContinue;

    public void sendData(String lpn, String pinCode){
    landline_phone_number.sendKeys(lpn);
    pincode_enter.sendKeys(pinCode);
    ButtonContinue.click();
        }
    }





