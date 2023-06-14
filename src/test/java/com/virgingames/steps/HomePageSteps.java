package com.virgingames.steps;

import com.virgingames.pages.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageSteps {
    @Given("^I am on Homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I click on all \"([^\"]*)\"$")
    public void iClickOnAll(String headers)  {
    new HomePage().clickOnAllHeaders(headers);
    }

    @Then("^I verify to play all headers games at virginmedia$")
    public void iVerifyToPlayAllHeadersGamesAtVirginmedia(String headers) {
        new HomePage().clickOnAllHeaders(headers);
    }

    @When("^I click on accept cookies$")
    public void iClickOnAcceptCookies() {
        new HomePage().clickAcceptCookies();
    }
}
