package com.momsmeals.step_definitions;

import com.momsmeals.pages.GoogleSearchPage;
import com.momsmeals.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.List;

public class GoogleSearch {

GoogleSearchPage googleSearchPage = new GoogleSearchPage();


    @Given("User is on Google search page")
    public void user_is_on_google_search_page() {
        Driver.getDriver().get("https://www.google.com/");

    }


    @When("User types {string} in the google search box and clicks enter")
    public void userTypesInTheGoogleSearchBoxAndClicksEnter(String string) {
        googleSearchPage.searchBox.sendKeys(string + Keys.ENTER);

    }

    @Then("User sees {string} is in the google title")
    public void userSeesIsInTheGoogleTitle(String title) {

        Assert.assertEquals("Title verification is failed!",title ,Driver.getDriver().getTitle());
    }
}