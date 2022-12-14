package com.ielts.ui.stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

import java.awt.AWTException;
import java.text.ParseException;

import com.ielts.pagefactory.HomePageUK;
import com.ielts.pagefactory.SearchResultPage;

public class UKStudyVisa {


    HomePageUK HomePageUK;

    @Given("^I provide a nationality of \"([^\"]*)\"$")
    public void i_provide_a_nationality_of(String arg1) throws InterruptedException, AWTException {
        HomePageUK.clickdropdown();
        HomePageUK.selectcountry();
        HomePageUK.clicknextpage();

    }

    @And("^I select the reason \"([^\"]*)\"$”)
    public void i_select_the_reason(String arg1) throws InterruptedException, AWTException {
        HomePageUK.selectstudy();
        HomePageUK.clickstudybutton();
    }

    @And("^I state I am intending to stay for \"([^\"]*)\"$")
    public void i_state_i_am_intending_to_stay_for(String arg1) throws InterruptedException, AWTException {
        HomePageUK.selectmorethan6months();

    }

    @When("^I submit the form \"([^\"]*)\"$")
    public void i_submit_the_form(String arg1) throws InterruptedException, AWTException {
        HomePageUK.selectduration();
    }

    @Then("^I will be informed \"([^\"]*)\"$")
    public void i_will_be_informed(String arg1) throws InterruptedException, AWTException {
        HomePageUK.visavalidation();
    }

}
