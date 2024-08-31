package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Steps{
    ChromeDriver driver;
    @Given("user open the website and go to login")

    public void user_open_the_website_and_go_to_login() {

        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
         driver = new ChromeDriver();/* ChromeDriver */
        driver.manage().window().maximize();
        driver.get("https://classic.freecrm.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }
    @When("user fill email and password and click login")
    public void user_fill_email_and_password_and_click_login() {
        driver.findElement(By.name("username")).sendKeys("samar saleh");
        driver.findElement(By.name("password")).sendKeys("Ww7vxKyuD.C!fp4");
        driver.findElement(By.cssSelector("[value=\"login\"]")).click();

    }
    @Then("the registration page displayed successfully")
    public void the_registration_page_displayed_successfully() {
        driver .switchTo().frame("mainpanel");
        System.out.println(driver.findElement(By.cssSelector("logo_text")).isDisplayed());


    }




}