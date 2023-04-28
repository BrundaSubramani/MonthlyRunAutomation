package PageFactory.BBAndLL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class OnSiteContact {
    WebDriver driver;
    public OnSiteContact(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"j_id0:j_id2:o2Template:broadbandAddresses:Contact_First_Name_0\"]")
    WebElement firstName;


    @FindBy(xpath = "//*[@id=\"j_id0:j_id2:o2Template:broadbandAddresses:Contact_Last_Name_0\"]")
    WebElement lastName;

    @FindBy(xpath = "//*[@id=\"j_id0:j_id2:o2Template:broadbandAddresses:Contact_Mobile_Number_0\"]")
    WebElement mpnum;

    @FindBy(xpath = "//*[@id=\"j_id0:j_id2:o2Template:broadbandAddresses:inPostcode\"]")
    WebElement postcode;

    @FindBy(xpath = "//*[text()='Find Address']")
    WebElement FindAddress;

    @FindBy(xpath = "//*[@id=\"screenlayout__2\"]/div[6]/div/span")
    WebElement continueButton;
    public void fillform(String fname, String lname, String mpn) throws InterruptedException {
        firstName.sendKeys(fname);
        lastName.sendKeys(lname);
        mpnum.sendKeys(mpn);
        postcode.sendKeys("SL12AA");
        FindAddress.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        Thread.sleep(9000);
        //Select listBox = new Select(driver.findElement(By.xpath("//*[@id=\"j_id0:j_id2:o2Template:broadbandAddresses:listAddresses\"]")));
        //listBox.selectByIndex(0);
        Select listBox = new Select(driver.findElement(By.xpath("//*[@id=\"j_id0:j_id2:o2Template:broadbandAddresses:listAddresses\"]")));
        listBox.selectByIndex(1);
        Thread.sleep(5000);
        Thread.sleep(2000);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click()",continueButton);
    }

    //landline
    @FindBy(xpath = "//*[@id=\"j_id0:j_id3:o2Template:landlineConfig:Contact_First_Name_0\"]")
    WebElement fName;


    @FindBy(xpath = "//*[@id=\"j_id0:j_id3:o2Template:landlineConfig:Contact_Last_Name_0\"]")
    WebElement lName;

    @FindBy(xpath = "//*[@id=\"j_id0:j_id3:o2Template:landlineConfig:Contact_Mobile_Number_0\"]")
    WebElement pnum;

    @FindBy(xpath = "//*[@id=\"j_id0:j_id3:o2Template:landlineConfig:inPostcode\"]")
    WebElement pcode;

    @FindBy(xpath = "//*[text()='Find Address']")
    WebElement FindAddress1;

    //@FindBy(xpath = "(//*[text()='Continue'])[6]")
    @FindBy(xpath = "//*[@id=\"screenlayout__3\"]/div[5]/div")
    WebElement contbutton;
    public void fillform_ll(String fname, String lname, String mpn,String pocode) throws InterruptedException {
        fName.sendKeys(fname);
        lName.sendKeys(lname);
        pnum.sendKeys(mpn);
        FindAddress.click();
        Thread.sleep(9000);
        Select listBox = new Select(driver.findElement(By.xpath("//*[@id=\"j_id0:j_id3:o2Template:landlineConfig:listAddresses\"]")));
        listBox.selectByIndex(1);
        Thread.sleep(5000);
        ((JavascriptExecutor)driver).executeScript("arguments[0].click()",contbutton);
    }
}
