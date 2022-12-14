package com.ielts.restservice.stepdefinition;

import cucumber.api.java.en.Given;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.rest.SerenityRest;

import org.json.JSONObject;
import org.junit.Assert;

import com.ielts.restservice.actionclass.EmployeeAction;
import com.ielts.util.EndPoints;

public class EmployeeStepDefinition {
	
	EmployeeAction employeeservice;
	
	@Given("^Employee Service is up and running$")
	public void employee_Service_is_up_and_running() {
		
	    
		//employeeservice.checkservicestatus();
		RestAssured.baseURI=EndPoints.QA_BASEURL;
		SerenityRest.given().when().get(EndPoints.GetEmployee).then().statusCode(200);
		
	}
	
	@When("^User create Employee with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" details$")
	public void user_create_Employee_with_details(String arg1, String arg2, String arg3) {
		
		RequestSpecification request = RestAssured.given();
		
		JSONObject requestParams = new JSONObject();
		requestParams.put("name",arg1); 
		requestParams.put("salary",arg2);
		requestParams.put("age",arg3);
		
		Response response = request.header("Content-Type", "application/json").body(requestParams.toString()).post(EndPoints.CreateEmployee);
		int statuscode = response.getStatusCode();
		System.out.println(response.prettyPrint());
		Assert.assertEquals(statuscode,200);
		
		//Response response = SerenityRest.given().when().header("Content-Type", "application/json").body(requestParams.toString()).post(EndPoints.CreateEmployee);
		//Assert.assertEquals(response.getStatusCode(), "201");
	}

	@Then("^New Employee should get created with correct details$")
	public void new_Employee_should_get_created_with_correct_details() {
		
		SerenityRest.given().when().get(EndPoints.GetEmployee).then().statusCode(200);		
		SerenityRest.given().when().get(EndPoints.GetEmployee).prettyPrint();
	}
	
}
