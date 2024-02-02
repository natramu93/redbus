package com.metlife.stepdefinition;

import com.metlife.pageobjects.HomePage;
import com.metlife.utilities.WebDriverUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TicketBookingDefn {
    @Given("I log into redbus.in as a user")
    public void i_log_into_redbus_in_as_a_user() {
        // Write code here that turns the phrase above into concrete actions
        WebDriverUtils.initialize("chrome");
        WebDriverUtils.navigate("http://redbus.in");
    }
    @When("I update the source as {string}")
    public void i_update_the_source_as(String string) {
        // Write code here that turns the phrase above into concrete actions
        WebDriverUtils.type(HomePage.src_ip,string);
    }
    @When("I update the destination as {string}")
    public void i_update_the_destination_as(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I choose the date as 4th of next month")
    public void i_choose_the_date_as_4th_of_next_month() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I click on Search Busses")
    public void i_click_on_search_busses() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("I should get the message as {string}")
    public void i_should_get_the_message_as(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
