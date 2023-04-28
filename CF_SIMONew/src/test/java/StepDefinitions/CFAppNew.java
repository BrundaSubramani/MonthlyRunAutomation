package StepDefinitions;

import PageFactory.AppJourney.*;
import PageFactory.CFSimoNew.BusinessDetailsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CFAppNew {

    WebDriver driver;

    @Given("Customer is able to launch the online shop")
    public void customer_is_able_to_launch_the_online_shop() {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.chrome.driver", "src/test/java/Browsers/chromedriver.exe");
        driver = new ChromeDriver();
        //driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://csupreprod-businessshop.cs88.force.com/");
    }

    SelectApp app;
    @Then("Customer selects the {string}")
    public void customer_selects_the(String App) {
        app=new SelectApp(driver);
        app.hoverAndClick();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,450)", "");
        app.select_particular_app();
    }


    QuantityAndChoose ChooseClick;
    @Then("Customer can choose the {string} and click on choose button")
    public void customer_can_choose_the_and_click_on_choose_button(String qty) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
        ChooseClick=new QuantityAndChoose(driver);
        ChooseClick.clickOnChoose(qty);
    }

    ProceedtoOrder pto;
    @Then("Customer lands on review basket page and clicks on proceed to order button")
    public void customer_lands_on_review_basket_page_and_clicks_on_proceed_to_order_button() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        pto=new ProceedtoOrder(driver);
        pto.clickProceedToOrder();
    }

    @Then("customer continues as a new customer")
    public void customer_continues_as_a_new_customer() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[text()= \"I’m a new customer\"]")).click();

    }
    BusinessDetailsPage BDP;
    @Then("customer provides the business details")
    public void customer_provides_the_business_details() throws InterruptedException {
        BDP= new BusinessDetailsPage(driver);
        BDP.Business_professional();
        Thread.sleep(10000);
        BDP.debit_details();
        Thread.sleep(15000);
    }

    personaldetails PD;
    @Then("customer provides the personal details")
    public void customer_provides_the_personal_details() throws InterruptedException {
        PD= new personaldetails(driver);
        PD.personal_detailspage();
        Thread.sleep(10000);
        PD.card_details();
        Thread.sleep(10000);
        //PD.purchase_authentication();
        //Thread.sleep(10000);
    }

    monthlypaymentdetails mpd;
    @Then("customer provides the monthly payment details and continue to credit check")
    public void customerProvidesTheMonthlyPaymentDetailsAndContinueToCreditCheck() throws InterruptedException {
        mpd= new monthlypaymentdetails(driver);
        mpd.monthly_payment();
    }
    @Then("customer provides the upfront details")
    public void customer_provides_the_upfront_details() {
        System.out.println(driver.findElement(By.xpath("//*[@id=\"completeOrder\"]/div/p[1]")).getText());
    }


}
