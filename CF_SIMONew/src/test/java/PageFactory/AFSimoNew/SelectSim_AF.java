package PageFactory.AFSimoNew;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.util.concurrent.TimeUnit;


public class SelectSim_AF {
    WebDriver driver;

    public SelectSim_AF(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void clickSim() {

        Actions action=new Actions(driver);
        WebElement Bshop=driver.findElement(By.xpath("//*[text()='Business shop']"));
        action.moveToElement(Bshop).build().perform();
        WebElement apps=driver.findElement(By.xpath("//*[text()='Connectivity']"));
        action.moveToElement(apps).build().perform();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement sim=driver.findElement(By.xpath("//*[text()='SIM only']"));
        // action.moveToElement(mcaffe).build().perform();
        sim.click();
    }

}
