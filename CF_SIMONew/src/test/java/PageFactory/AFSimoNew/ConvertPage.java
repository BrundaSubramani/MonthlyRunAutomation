package PageFactory.AFSimoNew;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


import java.awt.*;


public class ConvertPage {

    WebDriver driver;

    public ConvertPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(how= How.XPATH, using = "//*[@id=\"tsk5_fu\"]")
    public static WebElement subject;
    @FindBy(how= How.XPATH, using = "//*[@id=\"bottomButtonRow\"]/input[1]")
    public static WebElement convert;


    public void convert_page()
    {
        Select accountname= new Select(driver.findElement(By.id("accid")));
        accountname.selectByValue("000000000000000");
        subject.sendKeys("AutoSpringBAss");
        convert.click();
    }

}
