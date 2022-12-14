package com.ielts.ui.stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

import java.awt.AWTException;
import java.text.ParseException;

import com.ielts.pagefactory.HomePage;
import com.ielts.pagefactory.SearchResultPage;

public class OrganisationSearch {
	
	
	SearchResultPage SearchResultPage;
	HomePage HomePageobj;
	
	
	
    @Given("^Candiate is on IELTS home page$")
    public void candiate_is_on_IELTS_home_page() {
    
    	HomePageobj.open();
    
    }

    @When("^Candiate select \"([^\"]*)\" and search for the Organization$")
    public void candiate_select_and_search_for_the_Organization(String arg1) throws InterruptedException, AWTException {
    	
    	
    	HomePageobj.acceptcookies();
    	HomePageobj.selectIeltsScore(arg1);
    	HomePageobj.searchorganization();
        
    }
    
    @Then("^Candidate should see the list of organisation based on entered \"([^\"]*)\"$")
    public void candidate_should_see_the_list_of_organisation_based_on_entered(String arg1) throws InterruptedException {
    	
    	SearchResultPage.searchpagecheck(arg1);
    }

    @When("^Candiate select \"([^\"]*)\" and search for the Organization name$")
    public void candiate_select_and_search_for_the_Organization_name(String arg1) throws InterruptedException, AWTException {


        //HomePageobj.acceptcookies();
        HomePageobj.selectIeltsOrg(arg1);
        HomePageobj.acceptcookies();
        HomePageobj.searchorganization();

    }

    @Then("^Candidate should see the list of organisation name based on entered \"([^\"]*)\"$")
    public void candidate_should_see_the_list_of_organisation_name_based_on_entered(String arg1) throws InterruptedException {

        SearchResultPage.searchpagecheckOrg(arg1);
    }

}
