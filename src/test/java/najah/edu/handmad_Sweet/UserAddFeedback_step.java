package najah.edu.handmad_Sweet;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import MyAPP_Sweet_mgt2024.MyApp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserAddFeedback_step {
	
	MyApp app;
	boolean userlogincheck;
	boolean UserFeedbackCheck;
	

	public UserAddFeedback_step(MyApp app) {
	
		this.app = app;
	}

	@Given("the user is loggedpp in the system")
	public void theUserIsLoggedppInTheSystem() {
		userlogincheck = app.CheckUserLOgIn();
		
		}

	@When("User click on add feedback and enter the feedback {string}")
	public void userClickOnAddFeedbackAndEnterTheFeedback(String feedback) {
		
		feedback = "malik is fire";
		UserFeedbackCheck = app.shaheen.addFeedback(feedback);
	    
	}

	@Then("the feedback should added")
	public void theFeedbackShouldAdded() {
	    assertTrue(UserFeedbackCheck);
	}
	
	@When("User click on add feedback and enter the invalid feedback {string}")
	public void userClickOnAddFeedbackAndEnterTheInvalidFeedback(String feedback) {
		feedback = "";
		UserFeedbackCheck = app.shaheen.addFeedback(feedback);
	}

	@Then("the feedback should not added")
	public void theFeedbackShouldNotAdded() {
		
		 assertFalse(UserFeedbackCheck);
	   
	}


}
