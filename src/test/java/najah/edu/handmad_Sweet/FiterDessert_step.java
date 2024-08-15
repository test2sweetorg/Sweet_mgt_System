package najah.edu.handmad_Sweet;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import MyAPP_Sweet_mgt2024.MyApp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FiterDessert_step {
	
	
	MyApp app;
	boolean checkuserlogin;
	boolean checkfilterDessert;
	
	
	
	public FiterDessert_step(MyApp app) {
		
		this.app = app;
	}

	@Given("User is loggedRR in the system")
	public void userIsLoggedRRInTheSystem() {
		checkuserlogin=app.CheckUserLOgIn();
	}

	@When("the user need a dessert with sugar percantage {int}")
	public void theUserNeedADessertWithSugarPercantage(Integer sugerpercent) {
	    app.makeProductList(app.avalaibleProducts);
	    sugerpercent=3;
		checkfilterDessert= app.filterSugar(sugerpercent);
	}

	@Then("the dessert with this value of suger shown")
	public void theDessertWithThisValueOfSugerShown() {
	    assertTrue(checkuserlogin);
	    assertTrue(checkfilterDessert);
	}

	@When("the user need a dessert with not valid sugar percantage {int}")
	public void theUserNeedADessertWithNotValidSugarPercantage(Integer sugerpercent) {
		app.makeProductList(app.avalaibleProducts);
		sugerpercent=10;
		checkfilterDessert= app.filterSugar(sugerpercent);
	}

	@Then("error message sholud be display")
	public void errorMessageSholudBeDisplay() {
		 assertTrue(checkuserlogin);
		    assertFalse(checkfilterDessert);
	}

}
