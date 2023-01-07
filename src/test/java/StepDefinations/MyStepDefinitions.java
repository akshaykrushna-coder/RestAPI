package StepDefinations;

import org.junit.runner.RunWith;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class MyStepDefinitions {

	@Given("^User is on landing page$")
	public void user_is_on_landing_page() throws Throwable {
		System.out.println("landing page");
		//throw new PendingException();
	}

	@When("^User login with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_login_with_and(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(arg1);
	    System.out.println(arg2);
		// throw new PendingException();
	}


	@Then("^Home is displayed$")
	public void home_is_displayed() throws Throwable {
		System.out.println("Home page");
		//throw new PendingException();
	}

	@Then("^Cards are displayed$")
	public void cards_are_displayed() throws Throwable {
		System.out.println("card");
		//throw new PendingException();
	}

}