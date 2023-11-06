package com.homeoffice.steps;

import com.homeoffice.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MySteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @And("^I click on data set link$")
    public void iClickOnDataSetLink() {
        new HomePage().clickOnDataSet();
    }

    @Then("^I should navigate to HM land registry page successfully$")
    public void iShouldNavigateToHMLandRegistryPageSuccessfully() {
        String expectedMessage = "HM Land Registry";
        String actualMessage  = new HomePage().getText();
        Assert.assertEquals("Text not verified", expectedMessage, actualMessage);
    }

    @When("^I accept cookies$")
    public void iAcceptCookies() {
        new HomePage().acceptCookies();
    }
}
