package com.ielts.runner;
import com.browserstack.BrowserStackSerenityTest;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		 features = "src/test/resources/features/RestService_Automation/Employee/employee_management.feature"
		 ,glue={"com.ielts.restservice.stepdefinition"},
		 tags = {""}
		 )
public class RestTestRunner extends BrowserStackSerenityTest {
}










	

	
	
		
	
	
		
	
	
		

	
