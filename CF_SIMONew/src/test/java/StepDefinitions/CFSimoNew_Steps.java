package StepDefinitions;

import PageFactory.AppJourney.ProceedtoOrder;
import PageFactory.CFSimoNew.*;
import gherkin.lexer.Th;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CFSimoNew_Steps {

   WebDriver driver;
    @Given("User is on the Online Business Shop home page")
    public void user_is_on_the_online_business_shop_home_page() {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.chrome.driver", "src/test/java/Browsers/chromedriver.exe");
        driver = new ChromeDriver();
        //driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://csupreprod-businessshop.cs88.force.com/");
    }

    SimoPage SP;
    @Then("User is navigated to the Sim only page")
    public void user_is_navigated_to_the_sim_only_page() {
        SP = new SimoPage(driver);
        SP.Simo_page();
    }

    TariffPage TP;
    @Then("User selects the tariff {string} and clicks on continue button")
    public void user_selects_the_tariff_and_clicks_on_continue_button(String SimoTariff) throws InterruptedException {
        Thread.sleep(10000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("scroll(0,300)");
        TP= new TariffPage(driver);
        TP.select_tariff();

    }
    @Then("User clicks on FourG or FiveG Simo {string}")
    public void user_clicks_on_four_g_or_five_g_simo(String string) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//*[@id=\"gen4G\"]")).click();
    }

    ExtrasPage EP;
    @Then("User is navigated to the extras page and selects spend cap {string} {string} and clicks on next button")
    public void user_is_navigated_to_the_extras_page_and_selects_spend_cap_and_clicks_on_next_button(String string, String string2) throws InterruptedException {
        EP= new ExtrasPage(driver);
        EP.Extas_page();
    }

    BusinessAppPage BAP;
    @Then("User is navigated to business apps page and select the business app and clicks on next button")
    public void user_is_navigated_to_business_apps_page_and_select_the_business_app_and_clicks_on_next_button() throws InterruptedException {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("scroll(0,300)");
        BAP = new BusinessAppPage(driver);
        BAP.select_businessapp();
        Thread.sleep(3000);
        BAP.clickNext();
        Thread.sleep(10000);
    }

    ProceedtoOrder order;
    @Then("User lands on review basket page and clicks on proceed button")
    public void user_lands_on_review_basket_page_and_clicks_on_proceed_button() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        order=new ProceedtoOrder(driver);
        order.clickProceedToOrder();
    }
    @Then("User continues as a new customer")
    public void user_continues_as_a_new_customer() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[text()= \"I’m a new customer\"]")).click();
    }
    @Then("User is navigated to the first step and clicks on Go To About your business")
    public void user_is_navigated_to_the_first_step_and_clicks_on_go_to_about_your_business() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("(//*[text()= \"Go to About your business\"])[1]")).click();
    }

    BusinessDetailsPage BDP;
    @Then("User provides the business details")
    public void user_provides_the_business_details() throws InterruptedException {
        Thread.sleep(20000);
        BDP= new BusinessDetailsPage(driver);
        BDP.Business_professional();
        Thread.sleep(10000);
        BDP.debit_details();
        Thread.sleep(15000);
    }

    PersonalDetailsPage PDP;
    @Then("User provides the personal details")
    public void user_provides_the_personal_details() throws InterruptedException {
        PDP= new PersonalDetailsPage(driver);
        PDP.personal_detailspage();
        Thread.sleep(10000);
        PDP.card_details();
        Thread.sleep(20000);
        //PDP.purchase_authentication();
        //Thread.sleep(10000);
    }
    @Then("User provides the delivery details")
    public void user_provides_the_delivery_details() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//*[@id=\"j_id0:o2TemplateDSMB:j_id1528:j_id1619\"]")).click();
    }
    @Then("User provides the monthly payment details")
    public void user_provides_the_monthly_payment_details() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//*[@id=\"j_id0:o2TemplateDSMB:step4form:j_id1727:j_id1728:checkboxDiv9\"]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//*[@id=\"j_id0:o2TemplateDSMB:section2Form:CCA-HLA:checkboxDiv6\"]")).click();
    }
    @Then("User provides the upfront details")
    public void user_provides_the_upfront_details() throws InterruptedException {
        driver.findElement(By.xpath("//*[text()= \"Go to Upfront payment\"]")).click();
        Thread.sleep(8000);
        driver.findElement(By.xpath("//*[@id=\"j_id0:o2TemplateDSMB:step5form:noUpfrontProceedBtn\"]")).click();
        Thread.sleep(8000);
        System.out.println(driver.findElement(By.xpath("//*[@id=\"completeOrder\"]/div/p[1]")).getText());

    }

}
