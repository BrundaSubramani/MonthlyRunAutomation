package StepDefinitions;

import PageFactory.AFSimoNew.*;

import PageFactory.AppJourney.ProceedtoOrder;
import PageFactory.CFSimoNew.BusinessAppPage;
import PageFactory.CFSimoNew.ExtrasPage;
import PageFactory.CFSimoNew.TariffPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class AFSimoNew_Steps {

        WebDriver driver;

        Loginpage LP;
        @Given("Sales rep is on salesforce login page")
        public void sales_rep_is_on_salesforce_login_page() {
            System.setProperty("webdriver.chrome.driver", "src/test/java/Browsers/chromedriver.exe");
            ChromeOptions opt = new ChromeOptions();
            opt.addArguments("--remote-allow-origins=*");
            driver =new ChromeDriver(opt);
            //driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
            driver.get("https://test.salesforce.com/");
            LP= new Loginpage(driver);
            LP.launch();
        }


        loginProfile lp;
        @Then("Sales rep navigtes to search box and search for DMU profile and login")
        public void sales_rep_navigtes_to_search_box_and_search_for_dmu_profile() {
            lp= new loginProfile(driver);
            lp.login_profile();
        }

        LeadPage leadPage;

        @Then("Sales rep creates a new lead")
        public void sales_rep_creates_a_new_lead() {
                leadPage= new LeadPage(driver);
                leadPage.lead_page();
        }

        ConvertPage convertPage;
        @Then("Sales rep converts the lead into account")
        public void sales_rep_converts_the_lead_into_account() {
                convertPage= new ConvertPage(driver);
                driver.findElement(By.xpath("//*[@id=\"topButtonRow\"]/input[4]")).click();
                convertPage.convert_page();
        }
        @Then("Sales rep clicks on place an order")
        public void sales_rep_clicks_on_place_an_order() {
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                driver.findElement(By.xpath("//*[@id=\"topButtonRow\"]/input[11]")).click();
        }

        SelectSim_AF simAF;
        @Then("Sales rep is navigated to Business shop and selects Simo")
        public void sales_rep_is_navigated_to_business_shop_and_selects_simo() throws InterruptedException {
                simAF= new SelectSim_AF(driver);
                Thread.sleep(40000);
                String parent=driver.getWindowHandle();
                Set<String> s=driver.getWindowHandles();
                Iterator<String> I1= s.iterator();
                while(I1.hasNext())
                {
                        String child_window=I1.next();
                        if(!parent.equals(child_window))
                                driver.switchTo().window(child_window);}
                driver.manage().window().maximize();
                Thread.sleep(5000);
                simAF.clickSim();
                Thread.sleep(5000);
        }

        TariffandExtrasPage TP;
        @Then("Sales rep navigated to Tariffs page and selects the tariff {string}")
        public void sales_rep_navigated_to_tariffs_page_and_selects_the_tariff(String string) throws InterruptedException {
                Thread.sleep(10000);
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
                JavascriptExecutor js = ((JavascriptExecutor) driver);
                js.executeScript("scroll(0,300)");
                TP= new TariffandExtrasPage(driver);
                TP.select_tariff();
        }


        @Then("Sales rep clicks on FourG or FiveG Simo {string}")
        public void sales_rep_clicks_on_four_g_or_five_g_simo(String string) {
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                driver.findElement(By.xpath("//*[@id=\"gen4G\"]")).click();
        }

        ExtrasPage EP;
        @Then("Sales rep is navigated to the extras page and selects spend cap {string} {string} and clicks on next button")
        public void sales_rep_is_navigated_to_the_extras_page_and_selects_spend_cap_and_clicks_on_next_button(String string, String string2) throws InterruptedException {
                EP= new ExtrasPage(driver);
                EP.Extas_page();
        }

        BusinessAppPage BAP;
        @Then("Sales rep is navigated to business apps page and select the business app and clicks on next button")
        public void sales_rep_is_navigated_to_business_apps_page_and_select_the_business_app_and_clicks_on_next_button() throws InterruptedException {
                JavascriptExecutor js = ((JavascriptExecutor) driver);
                js.executeScript("scroll(0,300)");
                BAP = new BusinessAppPage(driver);
                BAP.select_businessapp();
                Thread.sleep(3000);
                BAP.clickNext();
                Thread.sleep(10000);
        }

        ProceedtoOrder order;
        @Then("Sales rep lands on review basket page and clicks on proceed button")
        public void sales_rep_lands_on_review_basket_page_and_clicks_on_proceed_button() {
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
                order=new ProceedtoOrder(driver);
                order.clickProceedToOrder();
        }

        BusinessDetails BD;
        @Then("Sales rep enters the business details on transactional checkout page")
        public void sales_rep_enters_the_business_details_on_transactional_checkout_page() throws InterruptedException {
                Thread.sleep(5000);
                driver.findElement(By.xpath("//*[@id=\"mpn-next-button\"]")).click();
                Thread.sleep(5000);
                BD= new BusinessDetails(driver);
                BD.business_details();

        }

        PersonalDetails PD;
        @Then("Sales rep provides the personal details")
        public void sales_rep_provides_the_personal_details() throws InterruptedException {
                PD= new PersonalDetails(driver);
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                PD.personal_details();
        }

        DeliveryDetails DD;
        @Then("Sales rep provides the delivery details")
        public void sales_rep_provides_the_delivery_details() throws InterruptedException {
                DD= new DeliveryDetails(driver);
                DD.setDeliverynextbutton();
        }

        PaymentDetails PP;
        @Then("Sales rep provides the monthly payment details")
        public void sales_rep_provides_the_monthly_payment_details() throws InterruptedException {
                PP= new PaymentDetails(driver);
                PP.monthly_details();
        }

        UpfrontDetails UD;

        @Then("Sales rep provides the upfront details")
        public void sales_rep_provides_the_upfront_details() throws InterruptedException {
                UD= new UpfrontDetails(driver);
                UD.setConfirmorder();
        }

}