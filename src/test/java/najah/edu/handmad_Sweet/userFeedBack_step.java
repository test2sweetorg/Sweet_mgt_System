package najah.edu.handmad_Sweet;

import static org.junit.Assert.assertTrue;

import MyAPP_Sweet_mgt2024.MyApp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class userFeedBack_step {
	
	MyApp app;
	
	
	
	public userFeedBack_step(MyApp app) {
		
		this.app = app;
	}

	@Given("I am loggedJ in as an Admin")
	public void iAmLoggedJInAsAnAdmin() {
	   app.loginAsAdmin();
	}

	@When("I navigate to the User Feedback Management page")
	public void iNavigateToTheUserFeedbackManagementPage() {
		app.adduserList(app.Users);
	   app.systemAdmin.showFeedBack();
	}

	@Then("I should see a list of all user feedback")
	public void iShouldSeeAListOfAllUserFeedback() {
	    assertTrue(app.systemAdmin.isShowfeedbacks());
	}

}
