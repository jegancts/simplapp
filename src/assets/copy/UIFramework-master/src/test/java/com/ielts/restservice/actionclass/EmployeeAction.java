package com.ielts.restservice.actionclass;

import cucumber.api.java.Before;
import io.restassured.RestAssured;
import net.serenitybdd.rest.SerenityRest;

import com.ielts.util.EndPoints;

public class EmployeeAction {
	
	
	@Before
    public void setbaseurl(){
		
		RestAssured.baseURI=EndPoints.QA_BASEURL;
    }
	
	public void checkservicestatus()
	{
		
	SerenityRest.given().when().get(EndPoints.GetEmployee).then().statusCode(200);
		
	}
	
}


