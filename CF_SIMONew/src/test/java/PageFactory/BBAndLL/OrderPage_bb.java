package PageFactory.BBAndLL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage_bb {
    WebDriver driver;
    public OrderPage_bb(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath ="//*[@id=\"j_id0:o2TemplateDSMB:theForm:tabIndex5001\"]")
    WebElement firstName;

    @FindBy(xpath ="//*[@id=\"j_id0:o2TemplateDSMB:theForm:tabIndex5002\"]")
    WebElement lastName;

    @FindBy(xpath ="//*[@id=\"j_id0:o2TemplateDSMB:theForm:tabIndex5003\"]")
    WebElement businessName;

    @FindBy(xpath ="//*[@id=\"j_id0:o2TemplateDSMB:theForm:tabIndex5004\"]")
    WebElement emailTxt;
    @FindBy(xpath ="//*[@id=\"j_id0:o2TemplateDSMB:theForm:tabIndex5005\"]")
    WebElement mobileNumber;



    @FindBy(xpath ="//*[@id='j_id0:o2TemplateDSMB:theForm:SelRadio1:0']")
    WebElement upgradeAd;

    @FindBy(xpath = "//*[@id='j_id0:o2TemplateDSMB:theForm:SelRadio2:1']")
    WebElement no;

    @FindBy(linkText = "Order")
    WebElement orderOrder;


    public void enterDetails(String firstname, String lastname, String Businessname, String O2ContactNumber, String noOfEmployees, String Email) {
        firstName.sendKeys(firstname);
        lastName.sendKeys(lastname);
        this.businessName.sendKeys(Businessname);
        //this.noOfEmployees.sendKeys(noOfEmployees);
        mobileNumber.sendKeys(O2ContactNumber);
        emailTxt.sendKeys(Email);
    }

    public void clickCheckBox () {
        upgradeAd.click();
        //checkBoxCondition.click();
        no.click();
    }

    public void clickOrderButton() {
        orderOrder.click();
    }

}
