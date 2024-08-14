package steps;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        monochrome = true,
        plugin ={ "pretty","html:target/html-cucumber"},
        features ="src/test/java/Features",
        glue = "steps",
       tags= "@U_1000"
        //tags = "not @Ignore" to ignore particular test case
        //tags="@Calculator" to run the entire feature use feature level tag
       // tags="@Simplilearn and not @Ignore" will run entire feature file except ignored one
        // tags = "@Regression" scenario can have multiple tags
        //tags="  @Regression and @U_1000" This will run all the test which have both the tags
      //  tags ="@Calculator or @Simplilearn" this will run  both calculator or Simplilearn




)
public class TestRunner
{

}
