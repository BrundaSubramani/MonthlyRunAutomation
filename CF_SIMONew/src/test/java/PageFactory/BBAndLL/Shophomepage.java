package PageFactory.BBAndLL;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shophomepage {
    WebDriver driver;
    public Shophomepage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(linkText = "Shop")
    WebElement shop_link;

    @FindBy(xpath = "//*[text()='Business broadband']")
    WebElement bb_link;

    @FindBy(xpath = "//*[text()='Business landline']")
    WebElement ll_link;

    public void hoverAndClick_bb(){
        Actions action = new Actions(driver);
        action.moveToElement(shop_link).build().perform();
        ((JavascriptExecutor)driver).executeScript("arguments[0].click()", bb_link);
        //bb_link.click();
    }

    public  void hoverAndClick_ll(){
        Actions action = new Actions(driver);
        action.moveToElement(shop_link).build().perform();
        //action.moveToElement(ll_link).build().perform();
        ((JavascriptExecutor)driver).executeScript("arguments[0].click()", ll_link);
    }
}
