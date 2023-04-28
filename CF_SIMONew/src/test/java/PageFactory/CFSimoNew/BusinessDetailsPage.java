package PageFactory.CFSimoNew;

import gherkin.lexer.Th;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class BusinessDetailsPage {
    WebDriver driver;
    public BusinessDetailsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"rd1\"]")
    WebElement limitedcompany;

    @FindBy(xpath = "//*[@class=\"businessTypeinputFieldStyle checkRegNum\"]")
    WebElement registrtionnumber;

    @FindBy(xpath = "(//*[@class= \"findBtnTextStyle\"])[1]")
    WebElement find;

    @FindBy(xpath = "//*[text()= \"Select Address\"]")
    WebElement selectaddress;

    @FindBy(xpath = "//*[@class=\"businessTypeinputFieldStyle checkBusinesssLandline\"]")
    WebElement mpn;

    @FindBy(xpath = "//*[@class=\"businessTypeinputFieldStyle checkBusinesssLandline\"]")
    WebElement noofemployees;

    @FindBy(xpath = "//*[@id=\"billingAddRadioBtn1NonSelectedImg\"]")
    WebElement billingaddress;

    public void limited_company() throws InterruptedException {
        limitedcompany.click();
        Thread.sleep(10000);
        registrtionnumber.sendKeys("10079719");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        find.click();
        Thread.sleep(10000);
        Select address= new Select(driver.findElement(By.id("j_id0:o2TemplateDSMB:checkoutFormFirst:fBAddressList")));
        address.selectByVisibleText("Select Address");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        mpn.sendKeys("07710163471");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        noofemployees.sendKeys("100");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        billingaddress.click();
    }

    //debit card details

    @FindBy(xpath = "//*[@class= \"checkAccountName directDebitInputStyle accountNameInputtxtMoz\"]")
    WebElement accountname;

    @FindBy(xpath = "//*[@class=\"checkAccountNumber directDebitInputStyle\"]")
    WebElement accountnumber;

    @FindBy(xpath = "//*[@class= \"checkSortCodeVal businessTypeinputFieldStyle\"]")
    WebElement sortcode;

    @FindBy(xpath = "//*[@id=\"disabledCheckBox\"]")
    WebElement enablecheckbox;

    @FindBy(xpath = "//*[@class=\"accnext2 buttonInitial buttonRegular blueRegular left buttonHover showContent\"]/span")
    WebElement gotoaboutyou;

    public void debit_details()
    {
        accountname.sendKeys("Lisa Taylor");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        accountnumber.sendKeys("70372609");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        sortcode.sendKeys("209778");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        enablecheckbox.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        gotoaboutyou.click();
    }


    //Business Professional
    @FindBy(xpath = "//*[@id=\"rd3\"]")
    WebElement businessprofessional;

    public void Business_professional() throws InterruptedException {
        Thread.sleep(15000);
        businessprofessional.click();
    }

    //Sole Trader
    @FindBy(xpath = "//*[@id=\"rd2\"]")
    WebElement  soletrader;

    @FindBy(xpath = "//*[@class=\"businessTypeinputFieldStyle checkSTTradeName\"]")
    WebElement  tradingname;

    @FindBy(xpath = "//*[@class=\"businessTypeinputFieldStyle checkBusinessPC\"]")
    WebElement businesspostcode;

    @FindBy(xpath = "//*[@id=\"j_id0:o2TemplateDSMB:checkoutFormFirst:lnkSearchForBusinessNLA\"]")
    WebElement  Findbusinesscode;

    @FindBy(xpath = "//*[@class=\"checkSTLandline step1errorstate\"]")
    WebElement bpn;

    @FindBy(xpath = "//*[@class=\"checkSTEmpNum step1errorstate\"]")
    WebElement noofemp;


    public void sole_trader() throws InterruptedException {
        soletrader.click();
        Thread.sleep(10000);
        tradingname.sendKeys("SGB CAD Design Limited");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        businesspostcode.sendKeys("HP3 0JD");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Findbusinesscode.click();
        Select address= new Select(driver.findElement(By.id("j_id0:o2TemplateDSMB:checkoutFormFirst:fBAddressListNL")));
        address.selectByVisibleText("Select Address");
        Thread.sleep(8000);
        bpn.sendKeys("07710163471");
        noofemp.sendKeys("100");
        billingaddress.click();
    }

    //
    @FindBy(xpath = "//*[@id=\"rd4\"]")
    WebElement charity;

    @FindBy(xpath = "//*[@class=\"businessTypeinputFieldStyle checkCharityName\"]")
    WebElement charityname;

    @FindBy(xpath = "//*[@class=\"checkCharityRegNum step1errorstate\"]")
    WebElement registeredcharitynumber;

    @FindBy(xpath = "//*[@class=\"checkCharityBP businessTypeinputFieldStyle\"]")
    WebElement businespostcode;

    @FindBy(xpath = "//*[@class=\"regNumFindBtn button-blue-thin align-right showContent\"]")
    WebElement findelement;

    @FindBy(xpath = "//*[@class=\"checkCharityLandline step1errorstate\"]")
    WebElement mobilenumber;

    @FindBy(xpath = "//*[@class=\"checkCharityEmpNum step1errorstate\"]")
    WebElement noemployee;



    public void charity_type() throws InterruptedException {
        charity.click();
        Thread.sleep(10000);
        charityname.sendKeys("COOP HOMES");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        registeredcharitynumber.sendKeys("0025197R");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        businespostcode.sendKeys("TW118GT");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        findelement.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Select address= new Select(driver.findElement(By.id("j_id0:o2TemplateDSMB:checkoutFormFirst:pAFAddressListCharity")));
        address.selectByVisibleText("1,Yew Tree Road");
        Thread.sleep(8000);
        mobilenumber.sendKeys("07710163471");
        noemployee.sendKeys("100");
        billingaddress.click();
    }

    //School,local authority or government

    @FindBy(xpath = "//*[@id=\"rd5\"]")
    WebElement government;

    @FindBy(xpath = "//*[@class=\"businessTypeinputFieldStyle checkOrgName\"]")
    WebElement orgname;

    @FindBy(xpath = "//*[@class=\"businessTypeinputFieldStyle checkGovCompPC\"]")
    WebElement postcode;

    @FindBy(xpath = "//*[@class=\"regNumFindBtn button-blue-thin align-right showContent\"]")
    WebElement findpostcode;

    @FindBy(xpath = "//*[@class=\"checkGovLandline step1errorstate\"]")
    WebElement phonenumber;

    @FindBy(xpath = "//*[@class=\"checkGovEmpNum step1errorstate\"]")
    WebElement empnumber;

    public void school_government() throws InterruptedException {
        government.click();
        Thread.sleep(10000);
        orgname.sendKeys("Ryan Pierson TA Ryan Pierson");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        postcode.sendKeys("PO12 4PN");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        findpostcode.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Select address= new Select(driver.findElement(By.id("j_id0:o2TemplateDSMB:checkoutFormFirst:pAFAddressListGov")));
        address.selectByVisibleText("1,Yew Tree Road");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        phonenumber.sendKeys("07710163471");
        empnumber.sendKeys("100");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        billingaddress.click();

    }
}
