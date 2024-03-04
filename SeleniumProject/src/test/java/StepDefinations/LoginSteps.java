package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("username should be on application page and should be registered on application")
	public void username_should_be_on_application_page_and_should_be_registered_on_application() {
	    System.out.print("User is on login page...");
	}

	@When("enter username and password")
	public void enter_username_and_password() {
		System.out.println("enter username and password...");
	}

	@And("click on login button")
	public void click_on_login_button() {
		System.out.println("clicked login button...");
	}

	@Then("login sucessful message should be visible")
	public void login_sucessful_message_should_be_visible() {
		System.out.println("sucessful message poped up...");
	}
	
	@And("User should be navigated to home page")
	public void user_should_be_navigated_to_home_page() {
	    System.out.println("landed on homepage");
	}
}
