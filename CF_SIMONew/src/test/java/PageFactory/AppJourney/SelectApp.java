package PageFactory.AppJourney;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectApp {
    WebDriver driver;
    public SelectApp(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(linkText = "Shop")
    WebElement shop_link;

    @FindBy(linkText="Apps")
    WebElement apps_link;

    public void hoverAndClick(){
        Actions action = new Actions(driver);
        action.moveToElement(shop_link).build().perform();
        apps_link.click();
    }

    @FindBy(xpath = "(//*[@class='body-link body-link-right'])[2]")
    WebElement mcaffe;

    public  void select_particular_app(){
        ((JavascriptExecutor)driver).executeScript("arguments[0].click()",mcaffe);
    }

}
