package najah.edu.handmad_Sweet;

import static org.junit.Assert.assertTrue;

import MyAPP_Sweet_mgt2024.MyApp;
import MyAPP_Sweet_mgt2024.StoreOwner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class addStoreOwner_step {
	
	MyApp app;
	
	
	
	public addStoreOwner_step(MyApp app) {
		
		this.app = app;
	}

	@Given("Admin is logged in the System")
	public void adminIsLoggedInTheSystem() {
		app.loginAsAdmin();
	}

	@When("Admin click on Create new Store owner")
	public void adminClickOnCreateNewStoreOwner() {
	    app.systemAdmin.addstoreOwner=true;
	}

	@When("fill the details of the store owner storeOwnerName {string} and password {string} storecity {string}")
	public void fillTheDetailsOfTheStoreOwnerStoreOwnerNameAndPasswordStorecity(String username, String password, String city) {
	    StoreOwner so1 = new StoreOwner(username,username,city);
	    app.systemAdmin.addStoreOwnertoList(so1);
	}

	@Then("the new store owner account should be created")
	public void theNewStoreOwnerAccountShouldBeCreated() {
	    assertTrue(app.systemAdmin.addstoreOwner);
	}

}
