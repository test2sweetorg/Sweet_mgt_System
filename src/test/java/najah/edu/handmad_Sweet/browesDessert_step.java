package najah.edu.handmad_Sweet;

import static org.junit.Assert.assertTrue;

import MyAPP_Sweet_mgt2024.MyApp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class browesDessert_step {
	
	MyApp app;
	boolean isUserLOgin;
	boolean browesDessertCheck;
	
	public browesDessert_step(MyApp app) {
		
		this.app = app;
	}

	@Given("the User is LoggedS in the system")
	public void theUserIsLoggedSInTheSystem() {
		isUserLOgin=app.CheckUserLOgIn();
	}

	@When("User click on browes dessert")
	public void userClickOnBrowesDessert() {
		app.makeProductList(app.avalaibleProducts);
		browesDessertCheck=app.browesDessert();
		
	}

	@Then("all dessert should be displayed")
	public void allDessertShouldBeDisplayed() {
	    assertTrue(isUserLOgin);
	    assertTrue(browesDessertCheck);
	}

}
