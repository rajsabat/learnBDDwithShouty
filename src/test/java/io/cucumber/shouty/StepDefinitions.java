package io.cucumber.shouty;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefinitions {

    String seanMessage;
    private Person lucy;
    private Person sean;

    @Given("Lucy is located {int} mtrs from the shop")
    public void lucy_is_located_mtrs_from_the_shop(Integer distance) {
        // Write code here that turns the phrase above into concrete actions
        lucy = new Person();
        sean = new Person();
        lucy.moveTo(distance);
    }

    @When("Sean shouts {string}")
    public void sean_shouts(String string) {
        // Write code here that turns the phrase above into concrete actions
        seanMessage = string;
        sean.shout(string);
    }

    @Then("Lucy hears Sean's message")
    public void lucy_hears_sean_s_message() {
        // Write code here that turns the phrase above into concrete actions

        assertEquals(asList(seanMessage), lucy.getHeardMessage());
    }
}
