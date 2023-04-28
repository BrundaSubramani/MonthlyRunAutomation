package PageFactory.BBAndLL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectPlan {
    WebDriver driver;

    public SelectPlan(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//*[@id=\"buyNowButtonLink\"]/span)[1]")
    WebElement BBConnect;

    @FindBy(xpath = "(//*[@id=\"buyNowButtonLink\"]/span)[2]")
    WebElement BBFibre;

    @FindBy(xpath = "(//*[@id=\"buyNowButtonLink\"]/span)[3]")
    WebElement BBSuperfastFibre;

    public void Select_BBconnect()
    {
        BBConnect.click();
    }

    public void select_bbfibre()
    {
        BBFibre.click();
    }

    public void select_bbfastfibre()
    {
        BBSuperfastFibre.click();
    }

}
