package PageFactory.AFSimoNew;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


import java.awt.*;


public class LeadPage{

    WebDriver driver;

    public LeadPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(how= How.XPATH, using ="//*[@id=\"Lead_Tab\"]/a")
    public static WebElement lead;
    @FindBy(how= How.XPATH, using ="//*[@id=\"hotlist\"]/table/tbody/tr/td[2]/input")
    public static WebElement newlead;
    @FindBy(how= How.XPATH, using ="//*[@id=\"bottomButtonRow\"]/input[1]")
    public static WebElement continuee;
    @FindBy(how= How.XPATH, using ="//*[@id=\"name_firstlea2\"]")
    public static WebElement firstname;
    @FindBy(how= How.XPATH, using ="//*[@id=\"name_lastlea2\"]")
    public static WebElement lastname;
    @FindBy(how= How.XPATH, using ="//*[@id=\"00N9E000000kNHo_unselected\"]/optgroup/option[1]")
    public static WebElement fourG;
    @FindBy(how= How.XPATH, using ="//*[@id=\"00N9E000000kNHo_right_arrow\"]")
    public static WebElement clickright;
    @FindBy(how= How.XPATH, using ="//*[@id=\"lea3\"]")
    public static WebElement company;
    @FindBy(how= How.XPATH, using ="//*[@id=\"topButtonRow\"]/input[1]")
    public static WebElement save;


    public void lead_page()
    {
        lead.click();
        newlead.click();
        continuee.click();
        firstname.sendKeys("TestAuto");
        lastname.sendKeys("Abc");
        fourG.click();
        clickright.click();
        company.sendKeys("NTTData");
        Select leadsource= new Select(driver.findElement(By.id("lea5")));
        leadsource.selectByValue("BRT");
        save.click();

    }

}
