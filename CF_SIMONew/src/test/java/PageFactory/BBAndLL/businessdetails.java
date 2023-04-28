package PageFactory.BBAndLL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class businessdetails {
    WebDriver driver;
    public businessdetails(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@class= \"accnextbusiness buttonInitial buttonRegular blueRegular right\"]")
    WebElement next;



    public void business_details() throws InterruptedException {
        Select businesstype= new Select(driver.findElement(By.xpath("//*[@class= \"selectCss\"]")));
        businesstype.selectByVisibleText("Business Professional");
        Thread.sleep(8000);
        next.click();
    }

    @FindBy(xpath = "//*[@class= \"textBoxCss checkCompanyName\"]")
    WebElement companyname;

    @FindBy(xpath = "//*[@class= \"textBoxCss checkCompanyRegNo\"]")
    WebElement companyregno;

    @FindBy(xpath = "//*[@class= \"inputSmaller\"]")
    WebElement businesspostcode;

    @FindBy(xpath = "//*[@id=\"j_id0:o2TemplateDSMB:j_id258:j_id290\"]")
    WebElement findaddress;


    public void select_limitedcompany() throws InterruptedException {
        Select businesstype= new Select(driver.findElement(By.xpath("//*[@class= \"selectCss\"]")));
        businesstype.selectByVisibleText("Limited company");
        Thread.sleep(8000);
        companyname.sendKeys("Magical Fireworks Ltd");
        companyregno.sendKeys("9726219");
        businesspostcode.sendKeys("M45 8NB");
        findaddress.click();
        Thread.sleep(10000);
        Select dropdown= new Select(driver.findElement(By.xpath("//*[@id=\"j_id0:o2TemplateDSMB:j_id258:addressList\"]")));
        dropdown.selectByVisibleText("2,Cambeck Walk");
        Thread.sleep(10000);
        next.click();
    }

    @FindBy(xpath = "//*[@class= \"textBoxCss checkCharityName\"]")
    WebElement charityname;

    @FindBy(xpath = "//*[@class= \"textBoxCss checkCharityRegNo\"]")
    WebElement charityregno;



    public void select_charity() throws InterruptedException {
        Select businesstype= new Select(driver.findElement(By.xpath("//*[@class= \"selectCss\"]")));
        businesstype.selectByVisibleText("Charity");
        Thread.sleep(8000);
        charityname.sendKeys("COOP HOMES");
        charityregno.sendKeys("0025197R");
        businesspostcode.sendKeys("TW118GT");
        findaddress.click();
        Thread.sleep(10000);
        Select dropdown= new Select(driver.findElement(By.xpath("//*[@id=\"j_id0:o2TemplateDSMB:j_id258:addressList\"]")));
        dropdown.selectByVisibleText("8,Waldegrave Road");
        Thread.sleep(10000);
        next.click();
    }
}
