package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CompareString
{
    String name1;
    String name2;
    String actResult;

    @Given("The first string is {string}")
    public void the_first_string_is(String str1)
    {
        this.name1=str1;

    }
    @Given("The second string is {string}")
    public void the_second_string_is(String str2)
    {
        this.name2=str2;

    }
    @When("I compare the strings")
    public void i_compare_the_strings()
    {
        if (name1.equalsIgnoreCase(name2))
        {
            actResult="matching";

        }
        else
        {
            actResult="missmatching";
        }

    }
    @Then("I should get the result as {string}")
    public void i_should_get_the_result_as(String expResult)
    {
        Assert.assertEquals(actResult,expResult);

    }

}
