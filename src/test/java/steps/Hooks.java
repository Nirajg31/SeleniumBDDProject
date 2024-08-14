package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Hooks
{

   public static WebDriver driver;
    @Before
    public  void setup()
    {
        driver=new ChromeDriver();

    }
    @After
    public void Teardown()
    {
        driver.quit();
    }
}
