package innotech.auto;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinitions {
	
	@Given("^I want to write a step with precondition$")
	public void i_want_to_write_a_step_with_precondition() {
	    System.out.println("Step Given: want to write a step with precondition");
	}


	@Given("^some other precondition$")
	public void some_other_precondition() {
		System.out.println("Step Given: some other precondition");
	}

	@When("^I complete action$")
	public void i_complete_action() {
		System.out.println("Step Given: some other precondition");
	}

	@When("^some other action$")
	public void some_other_action() {
		System.out.println("Step Given: some other action");
	}

	@When("^yet another action$")
	public void yet_another_action() {
		System.out.println("Step When: yet another action");
	}

	@Then("^I validate the outcomes$")
	public void i_validate_the_outcomes() {
		System.out.println("Step Then: I validate the outcomes");
	}

	@Then("^check more outcomes$")
	public void check_more_outcomes() {
		System.out.println("Step Then:"
				+ "check more outcomes");
	}

}
