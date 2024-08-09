package najah.edu.handmad_Sweet;

import static org.junit.Assert.assertTrue;

import MyAPP_Sweet_mgt2024.MyApp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserStatusCity_step {
	
	
	MyApp app;
	
	
	
	
	
	public UserStatusCity_step(MyApp app) {
		this.app = app;
	}

	@Given("Admin is loggedM in the System")
	public void adminIsLoggedMInTheSystem() {
	   app.loginAsAdmin();
	}

	@When("Admin navigate to the user statistics button")
	public void adminNavigateToTheUserStatisticsButton() {
	   app.systemAdmin.showStatisticsCheck();
	   app.systemAdmin.showStaistics();
	   
	}

	@Then("Admin should see a list of cities with the number of registered users in each city")
	public void adminShouldSeeAListOfCitiesWithTheNumberOfRegisteredUsersInEachCity() {
	   assertTrue(app.systemAdmin.showStatisticsUser);
	}

}
