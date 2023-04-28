package PageFactory.BBAndLL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PersonalDetails {

    WebDriver driver;
    public PersonalDetails(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@class= \"textBoxCss checkFirstName\"]")
    WebElement firstname;

    @FindBy(xpath = "//*[@class= \"textBoxCss checkLastName\"]")
    WebElement lastname;

    @FindBy(xpath = "//*[@class= \"textBoxCss checkMobileNumber\"]")
    WebElement contactnumber;

    @FindBy(xpath = "//*[@class= \"textBoxCss checkEmailAddress\"]")
    WebElement emailaddress;

    @FindBy(xpath = "//*[@class= \"inputSmaller checkHomePostcode\"]")
    WebElement postcode;

    @FindBy(xpath = "(//*[@class= \"button-blue-thin align-right\"])[1]")
    WebElement findaddress;

    @FindBy(xpath = "//*[@class= \"accnext1 buttonInitial buttonRegular blueRegular right\"]")
    WebElement next;

    public void Personal_Details() throws InterruptedException {
        Select title= new Select(driver.findElement(By.id("j_id0:o2TemplateDSMB:j_id40:title")));
        title.selectByVisibleText("Ms");
        Thread.sleep(2000);
        firstname.sendKeys("TTABAAAAAAAAAAA");
        Thread.sleep(2000);
        lastname.sendKeys("TTAAAAAAAAAAAAAAAAAA");
        Thread.sleep(2000);
        contactnumber.sendKeys("07710163471");
        Thread.sleep(2000);
        emailaddress.sendKeys("bbtest@yopmail.com");
        Thread.sleep(2000);
        postcode.sendKeys("sl12aa");
        Thread.sleep(2000);
        findaddress.click();
        Thread.sleep(5000);
        /*WebElement selectaddress= driver.findElement(By.xpath("//*[@id=\"j_id0:o2TemplateDSMB:j_id40:addressList2\"]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click()",selectaddress);
        WebElement addressname= driver.findElement(By.xpath("//*[@id=\"j_id0:o2TemplateDSMB:j_id40:addressList2\"]/option[4]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click()",addressname); */
        Select address= new Select(driver.findElement(By.id("j_id0:o2TemplateDSMB:j_id40:addressList2")));
        address.selectByVisibleText("1,Yew Tree Road");
        Thread.sleep(7000);
        Select years= new Select(driver.findElement(By.id("j_id0:o2TemplateDSMB:j_id40:previousAddrYear")));
        years.selectByVisibleText("8");
        Thread.sleep(7000);
        Select months= new Select(driver.findElement(By.id("j_id0:o2TemplateDSMB:j_id40:previousAddrMonth")));
        months.selectByVisibleText("4");
        Thread.sleep(7000);
        next.click();
    }
}
