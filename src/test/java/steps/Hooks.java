package steps;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Hooks
{

   public static WebDriver driver;
   public static ExtentReports extentReports= new ExtentReports("HtmlReults.html",false);
   public static ExtentTest test;



    @Before
    public  void setup(Scenario scenario)
    {
        test= extentReports.startTest(scenario.getName());
        driver=new ChromeDriver();

    }
    @After
    public void Teardown()
    {
        driver.quit();
        extentReports.endTest(test);
        extentReports.close();
    }
}
