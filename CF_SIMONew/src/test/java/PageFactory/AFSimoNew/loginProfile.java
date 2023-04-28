package PageFactory.AFSimoNew;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


import java.awt.*;
import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class loginProfile {

    WebDriver driver;

    public loginProfile(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(how= How.XPATH, using ="(//a[contains(text(),'Sundaram Subramanian DMU')])[5]")
    public static WebElement SundaramDMU;
    @FindBy(how= How.XPATH, using ="//a[@id='moderatorMutton']")
    public static WebElement dropdown;
    @FindBy(how= How.XPATH, using ="//*[text()='User Detail']")
    public static WebElement userdetail;
    @FindBy(how= How.XPATH, using ="//*[@id=\"topButtonRow\"]/input[4]")
    public static WebElement login;
    @FindBy(how= How.XPATH, using ="//input[@id='phSearchInput']")
    public static WebElement search;
    @FindBy(how= How.XPATH, using ="//input[@id='phSearchButton']")
    public static WebElement searchclick;


    public void login_profile() {
        search.sendKeys("Sundaram Subramanian DMU");
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        searchclick.click();
        SundaramDMU.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        dropdown.click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", userdetail);
        //userdetail.click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        login.click();
    }
}