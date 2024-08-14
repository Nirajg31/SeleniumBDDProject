package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.List;

public class SimplilearnStepDef
{

    private static final Logger log = LoggerFactory.getLogger(SimplilearnStepDef.class);
    WebDriver driver= Hooks.driver;
    @Given("I have launched the application")
    public void i_have_launched_the_application()
    {
        driver.get("https://www.simplilearn.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }
    @Given("I clicked on the login link")
    public void i_clicked_on_the_login_link()
    {
        WebElement login=driver.findElement(By.linkText("Log in"));
        login.click();
    }
    @When("I enter the username")
    public void i_enter_the_username()
    {
        WebElement username=driver.findElement(By.name("user_login"));
        username.sendKeys("abc@xyz.com");

    }
    @When("I enter the password")
    public void i_enter_the_password()
    {
        WebElement password=driver.findElement(By.id("password"));
        password.sendKeys("Abc@1234");
    }
    @When("I click on the login button")
    public void i_click_on_the_login_button()
    {
        WebElement loginBtn=driver.findElement(By.name("btn_login"));
        loginBtn.click();
    }
    @Then("I should get the error message as {string}")
    public void i_should_get_the_error_message_as(String expResult)
    {

        WebElement errorMessage = driver.findElement(By.className("error_msg"));
        String errorText = errorMessage.getText();
            Assert.assertEquals(errorText,expResult);
    }
    @When("I enter the username as {string}")
    public void i_enter_the_username_as(String username)
    {
        WebElement username1=driver.findElement(By.name("user_login"));
        username1.sendKeys(username);


    }
    @When("I enter the password as {string}")
    public void i_enter_the_password_as(String password)
    {
        WebElement pwd=driver.findElement(By.id("password"));
        pwd.sendKeys(password);
    }

    @Then("I see the below login options are present on the screen")
    public void i_see_the_below_login_options_are_present_on_the_screen(List<String>list1)
    {
        for(String option:list1)
        {
            WebElement actopt=driver.findElement(By.xpath("//button[@data-clickedtype='" + option + "']"));
            Assert.assertTrue(actopt.isDisplayed());
        }

    }


}
