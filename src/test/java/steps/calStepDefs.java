package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.sl.In;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class calStepDefs
{
    int num1;
    int num2;
    int actresult;
    List<Integer> numbers;
    Map<String, Integer> cart;
    int actBill;
    DataTable dataTable;

    @Given("I have two numbers {int} and {int}")
    public void i_have_two_numbers_and(int a, int b) {
        num1 = a;
        num2 = b;
    }

    @When("I add those numbers")
    public void i_add_those_numbers()
    {

        actresult = num1 + num2;
    }


    @Then("the result should be as {int}")
    public void the_result_should_be_as(int expResult) {
        Assert.assertEquals(expResult, actresult);
    }
    @When("I subtract those numbers")
    public void i_subtract_those_numbers()
    {
        actresult=num1-num2;
    }
    @When("I multiply those numbers")
    public void i_multiply_those_numbers()
    {
        actresult=num1*num2;

    }
    @Given("I have below numbers")
    public void i_have_below_numbers(DataTable dataTable)
    {
        numbers=dataTable.asList(Integer.class);
    }
    @When("I add the numbers")
    public void i_add_the_numbers()
    {
        actresult=0;
        for (int num:numbers)
        {
            actresult=actresult+num;
        }

    }


    @Given("Below items are added to the cart")
    public void below_items_are_added_to_the_cart(Map<String,Integer> map1)
    {
        this.cart=map1;

    }
    @When("I do the checkout")
    public void i_do_the_checkout()
    {

        actBill=0;
        for(String item: cart.keySet())
        {
            actBill=actBill+cart.get(item);
        }

    }

    @Then("Validate the total bill as {int}")
    public void validate_the_total_bill_as(int expBill)
    {
        Assert.assertEquals(actBill,expBill);
    }

    @Given("Below items are added to the cart with given quantity")
    public void below_items_are_added_to_the_cart_with_given_quantity(DataTable dataTable)
    {

        this.dataTable=dataTable;
    }
    @When("I do the checkout with given quantity")
    public void i_do_the_checkout_with_given_quantity()
    {
int rows=dataTable.height();
actBill=0;
for (int i=0;i<rows;i++)
{
    String item=dataTable.cell(i,0);
    int qnt=Integer.parseInt(dataTable.cell(i,1));
    int price=Integer.parseInt(dataTable.cell(i,2));
    actBill=actBill+qnt*price;


}
    }







}
