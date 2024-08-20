package najah.edu.handmad_Sweet;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import MyAPP_Sweet_mgt2024.MyApp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class deleteStoreOwner_step {
	
	MyApp app;
	int index;
	boolean checkdeleteStoreOwner;
	
	
	public deleteStoreOwner_step(MyApp app) {
		
		this.app = app;
	}

	@Given("Admin is loggedZ in the System")
	public void adminIsLoggedZInTheSystem() {
	    app.loginAsAdmin();
	}

	@When("Admin click on delete store owner account")
	public void adminClickOnDeleteStoreOwnerAccount() {
	    app.systemAdmin.deleteStoreOwnerFunction();
	}

	@When("Admin enter storeOwnerName {string}")
	public void adminEnterStoreOwnerName(String StoreOwnerName) {
		StoreOwnerName = "tariq";
		app.addStoreOwnerList(app.StoreOwnerList);
	    index=app.systemAdmin.searchStoreOwner(StoreOwnerName);
	}

	@When("there is an existing storeOwner account with storeOwnerName")
	public void thereIsAnExistingStoreOwnerAccountWithStoreOwnerName() {
	   if(index != -1) {
		   app.systemAdmin.deletStoreOwner(index);
		   app.systemAdmin.deleteStoreOwner=true;
	   }
	}

	@Then("this account should be deleted")
	public void thisAccountShouldBeDeleted() {
	    assertTrue(app.systemAdmin.deleteStoreOwner);
	}

	@When("there is No existing storeOwner account with storeOwnerName")
	public void thereIsNoExistingStoreOwnerAccountWithStoreOwnerName() {
		app.systemAdmin.deleteStoreOwner=false;
		app.systemAdmin.deleteStoreOwnerFaildMessage();
		
		
	    
	}

	@Then("there no existing account")
	public void thereNoExistingAccount() {
		assertFalse(app.systemAdmin.deleteStoreOwner);
	}

}
