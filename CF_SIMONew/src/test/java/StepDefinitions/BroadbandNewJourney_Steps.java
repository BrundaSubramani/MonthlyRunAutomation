package StepDefinitions;

import PageFactory.BBAndLL.*;
import PageFactory.CFSimoNew.BusinessDetailsPage;
import PageFactory.CFSimoNew.PersonalDetailsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class BroadbandNewJourney_Steps {

    WebDriver driver;

    @Given("Customer is able to launch the business shop")
    public void customer_is_able_to_launch_the_business_shop() {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.chrome.driver", "src/test/java/Browsers/chromedriver.exe");
        driver = new ChromeDriver();
        //driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://csupreprod-businessshop.cs88.force.com/");
    }

    Shophomepage click;
    @When("Customer hover on shop and click on Broadband")
    public void customer_hover_on_shop_and_click_on_broadband() {
        click=new Shophomepage(driver);
        click.hoverAndClick_bb();
    }

    CheckAvailability check;
    @Then("customer enters the {string} {string} {string}")
    public void customer_enters_the(String postcode, String fixedline, String o2mobilenumber) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,450)", "");
        check=new CheckAvailability(driver);
        check.enterdetails(postcode,fixedline,o2mobilenumber);
    }


    @Then("Customer clicks the  check button")
    public void customer_clicks_the_check_button() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        check.clickCheck();
    }

    SelectPlan SP;
    @Then("Customer chooses the {string} for broadband and clicks on buynow button")
    public void customer_chooses_the_for_broadband_and_clicks_on_buynow_button(String plan) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        SP= new SelectPlan(driver);
        System.out.println(plan);
        SP.Select_BBconnect();
    }
    ContinuePage cont;
    @Then("Customer clicks on continue button")
    public void customer_clicks_on_continue_button() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        cont=new ContinuePage(driver);
        cont.clickContinue_1();
    }

    OnSiteContact contact;
    @Then("Customer enters the {string} {string} {string} and installation address")
    public void customer_enters_the_and_installation_address(String fname, String lname, String mpn) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        contact=new OnSiteContact(driver);
        contact.fillform(fname, lname, mpn);
    }

    ProceedtoOrder PTO;
    @Then("Customer can see the basket page and click on proceed button.")
    public void customer_can_see_the_basket_page_and_click_on_proceed_button() {
        PTO=new ProceedtoOrder(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        PTO.clickProceedToOrder();
    }

    @Then("Customer continues as a new customer")
    public void customer_continues_as_a_new_customer() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[text()= \"I’m a new customer\"]")).click();
        Thread.sleep(10000);
    }

    PersonalDetails PD;
    @Then("Customer provides the personal details")
    public void customerProvidesThePersonalDetails() throws InterruptedException {
        PD= new PersonalDetails(driver);
        PD.Personal_Details();
        Thread.sleep(8000);
    }

    businessdetails bd;
    @Then("Customer provides the business details")
    public void customerProvidesTheBusinessDetails() throws InterruptedException {
        bd= new businessdetails(driver);
        bd.business_details();
        Thread.sleep(8000);
    }

    paymentdetails Pdetails;
    @Then("Customer provides the payment details")
    public void customerProvidesThePaymentDetails() throws InterruptedException {
        Pdetails= new paymentdetails(driver);
        Pdetails.payment_details();
        Thread.sleep(8000);
    }

    confirmorder CO;
    @Then("Customer confirms the order")
    public void customerConfirmsTheOrder() throws InterruptedException {
        CO= new confirmorder(driver);
        CO.confirmorder();
    }
}
