package PageFactory.CFSimoNew;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;
import java.time.Duration;

public class PersonalDetailsPage {

    WebDriver driver;
    public PersonalDetailsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//*[@class=\"tbsEmailStyle\"])[1]")
    WebElement email;

    @FindBy(xpath = "//*[@class= \"tbsFirstNameStyle\"]")
    WebElement firstname;

    @FindBy(xpath = "//*[@class= \"tbsLastNameStyle\"]")
    WebElement lastname;

    @FindBy(xpath = "//*[@class= \"checkAccountName tbsMobileNumStyle\"]")
    WebElement mpn;

    @FindBy(xpath = "//*[@id=\"j_id0:o2TemplateDSMB:section2Form:addrPostalCodeTemp\"]")
    WebElement postcode;

    @FindBy(xpath = "(//*[@class= \"regNumFindBtn button-blue-thin align-right busSearchLink\"])/span")
    WebElement find;

    @FindBy(xpath = "//*[@class= \"tbsDOBStyle\"]")
    WebElement dob;

    @FindBy(xpath = "//*[@id=\"j_id0:o2TemplateDSMB:section2Form:CCA-HLA:checkboxDiv6\"]")
    WebElement checkbox;

    @FindBy(xpath = "//*[@id=\"j_id0:o2TemplateDSMB:section2Form:CCA-HLA:checkboxDiv1\"]")
    WebElement affordability;

    @FindBy(xpath = "//*[@id=\"j_id0:o2TemplateDSMB:section2Form:CCA-HLA:checkboxDiv2\"]")
    WebElement creditcheck1;

    @FindBy(xpath = "//*[@id=\"j_id0:o2TemplateDSMB:section2Form:CCA-HLA:checkboxDiv4\"]")
    WebElement creditcheck2;

    @FindBy(xpath = "//*[@class= \"accnext2 buttonInitial buttonRegular blueRegular buttonHover left\"]")
    WebElement entercarddetails;

    @FindBy(xpath = "//*[@id=\"addrYrField\"]/div[1]")
    WebElement clickyears;

    @FindBy(xpath = "//*[@id=\"addrYrField\"]/div[2]/div[10]")
    WebElement selectyears;

    @FindBy(xpath = "//*[@id=\"addrMonthField\"]/div[1]")
    WebElement clickmonths;

    @FindBy(xpath = "//*[@id=\"addrMonthField\"]/div[2]/div[5]")
    WebElement selectmonth;


    public void personal_detailspage() throws InterruptedException {
        email.sendKeys("test17874@yopmail.com");
        //Select title= new Select(driver.findElement(By.id("j_id0:o2TemplateDSMB:section2Form:title")));
        //title.selectByVisibleText("Ms");
        firstname.sendKeys("TTABAAAAAAAAAAA");
        lastname.sendKeys("TTAAAAAAAAAAAAAAAAAA");
        mpn.sendKeys("07710163471");
        postcode.sendKeys("sl12aa");
        find.click();
        //Select address= new Select(driver.findElement(By.id("j_id0:o2TemplateDSMB:section2Form:addressListTemp")));
        //address.selectByVisibleText("1,Yew Tree Road");
        WebElement selectaddress= driver.findElement(By.xpath("//*[@id=\"addressListSelectBoxTemp\"]/div[1]/div[1]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click()",selectaddress);
        //driver.findElement(By.xpath("//*[@id=\"addressListSelectBoxTemp\"]/div[1]/div[1]")).click();
        WebElement addressname= driver.findElement(By.xpath("//*[@id=\"addressListSelectBoxTemp\"]/div[1]/div[2]/div[2]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click()",addressname);
        //driver.findElement(By.xpath("//*[@id=\"addressListSelectBoxTemp\"]/div[1]/div[2]/div[2]")).click();
        Thread.sleep(10000);
        clickyears.click();
        Thread.sleep(4000);
        selectyears.click();
        Thread.sleep(4000);
        clickmonths.click();
        Thread.sleep(4000);
        selectmonth.click();
        dob.sendKeys("12/12/1990");
        checkbox.click();
        Thread.sleep(4000);
        affordability.click();
        Thread.sleep(4000);
        creditcheck1.click();
        Thread.sleep(8000);
        creditcheck2.click();
        Thread.sleep(10000);
        entercarddetails.click();
    }

    //card details
    @FindBy(xpath = "//*[@id=\"CardHolderName\"]")
    WebElement nameonthecard;

    @FindBy(xpath = "//*[@id=\"CardNumber\"]")
    WebElement cardnumber;

    @FindBy(xpath = "//*[@id=\"Month\"]")
    WebElement expirymonth;

    @FindBy(xpath = "//*[@id=\"Year\"]")
    WebElement expiryyear;

    @FindBy(xpath = "//*[@id=\"CardCvv\"]")
    WebElement cvv;

    @FindBy(xpath = "//*[@id=\"btnPayNow\"]")
    WebElement conttonextstep;

    public void card_details() throws InterruptedException {
        Thread.sleep(15000);
        WebElement cname=driver.findElement(By.xpath("//*[@id=\"theIframe\"]"));
        driver.switchTo().frame(cname);
        //Thread.sleep(5000);
        nameonthecard.sendKeys("DEREK ACCEPT");
        cardnumber.sendKeys("4000000000001091");
        Thread.sleep(5000);
        expirymonth.sendKeys("01");
        Thread.sleep(1000);
        expiryyear.sendKeys("23");
        Thread.sleep(1000);
        cvv.sendKeys("123");
        Thread.sleep(1000);
        conttonextstep.click();
        //Thread.sleep(2000);
        driver.switchTo().defaultContent();
        Thread.sleep(8000);
        WebElement frm2=driver.findElement(By.xpath("//*[@id=\"theIframe\"]"));
        driver.switchTo().frame(frm2);
        Thread.sleep(5000);
        WebElement frm4=driver.findElement(By.xpath("//*[@id=\"Cardinal-CCA-IFrame\"]"));
        driver.switchTo().frame(frm4);
        //Thread.sleep(8000);
        WebElement otp=driver.findElement(By.xpath("//*[@class=\"input-field\"]"));
        otp.sendKeys("1234");
        Thread.sleep(5000);
        WebElement sub=driver.findElement(By.xpath("//*[@class=\"button primary\"]"));
        sub.click();
        Thread.sleep(8000);
        driver.switchTo().defaultContent();
        Thread.sleep(10000);
        //Thread.sleep(12000);
        gotodeliverydetails.click();
    }

    @FindBy(xpath = "//*[@id=\"password\"]")
    WebElement entercode;

    @FindBy(xpath = "//*[@name=\"UsernamePasswordEntry\"]")
    WebElement submit;

    @FindBy(xpath = "//*[@class= \" accnext1 buttonInitial buttonRegular blueRegular right buttonHover\"]")
    WebElement gotodeliverydetails;

    public void purchase_authentication() throws InterruptedException {
        WebElement iframe2=driver.findElement(By.xpath("//*[@id=\"Cardinal-CCA-IFrame\"]"));
        driver.switchTo().frame(iframe2);
        entercode.sendKeys("1234");
        Thread.sleep(5000);
        submit.click();
        driver.switchTo().defaultContent();
        Thread.sleep(12000);
        gotodeliverydetails.click();
    }
}
