package stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TaggedHooksStepDefinition {
	
	//Tagged Hooks:Execute precondition for specific scenario 
	
	//Global Hooks:
	@Before(order=0)
	public void setUP() {
		System.out.println("launch chrome");
		System.out.println("Enter Url for Free CRM App");
	}
	
	@After(order=0)
	public void tearDown() {
		System.out.println("close the browser");
	}
	
	@Before(order=1)
	public void setUp1() {
		System.out.println("setUP1-launch chrome");
		System.out.println("setUP1-Enter Url for Free CRM App");
	}
	
	@After(order=1)
	public void tearDown2() {
		System.out.println("tearDown2-close the browser");
	}
	
	//Local-only for first scenario
	@Before("@First")
	public void beforeFirst() {
		System.out.println("before only first scenario");
	}
	
	//Local-only for first scenario
	@After("@First")
	public void afterFirst() {
		System.out.println("after only first scenario");
	}

	@Before("@Second")
	public void beforeSecong() {
		System.out.println("before only second scenario");
	}
	
	@After("@Second")
	public void afterSecond() {
		System.out.println("after only second scenario");
	}
	
	@Before("@Third")
	public void beforeThird() {
		System.out.println("before only third scenario");
	}
	
	@After("@Third")
	public void afterThird() {
		System.out.println("after only third scenario");
	}


	@Given("^this is  the first step$")
	public void this_is_the_first_step() throws Throwable {
		System.out.println("1st Step");
	}

	@When("^this is the second step$")
	public void this_is_the_second_step() throws Throwable {
		System.out.println("2nd Step");
	}

	@Then("^this is the third step$")
	public void this_is_the_third_step() throws Throwable {
		System.out.println("3rd Step");
	}
}
