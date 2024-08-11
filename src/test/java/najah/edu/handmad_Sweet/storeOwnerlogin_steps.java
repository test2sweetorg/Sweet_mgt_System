package najah.edu.handmad_Sweet;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import MyAPP_Sweet_mgt2024.MyApp;
import MyAPP_Sweet_mgt2024.StoreOwner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class storeOwnerlogin_steps {

	
	MyApp app;
	StoreOwner storeOwner1;
	
	
	public storeOwnerlogin_steps(MyApp app) {
		
		this.app = app;
	}

	@Given("the StoreOwner is on the log in page")
	public void theStoreOwnerIsOnTheLogInPage() {
	    app.storeOwnernotLogin();
	}

	@When("the StoreOwner enter username {string} and password {string}")
	public void theStoreOwnerEnterUsernameAndPassword(String username, String password) {
		username ="sameh";
		password="14144";
		storeOwner1 = new StoreOwner(username,password);
		
	}

	@When("the StoreOwner click in login")
	public void theStoreOwnerClickInLogin() {
		String excpectedUserName;
		String excpectedPassword;
		app.addStoreOwnerList(app.StoreOwnerList);
	   for(StoreOwner s1: app.StoreOwnerList) {
		   excpectedUserName= s1.getStoreOwner_name();
		   excpectedPassword=s1.getStoreOwner_password();
		   if(storeOwner1.getStoreOwner_name().equals(excpectedUserName) && storeOwner1.getStoreOwner_password().equals(excpectedPassword)) {
			   
			   app.loginAsStoreOwner();
			   break;
			   
		   }
		   
	   }
	}

	@Then("the StoreOwner should be enter the dashboard")
	public void theStoreOwnerShouldBeEnterTheDashboard() {
	   assertTrue(app.StoreOwner_is_loggedin);
	}

	@Then("invalid StoreOwner message disply")
	public void invalidStoreOwnerMessageDisply() {
	   
		assertFalse(app.StoreOwner_is_loggedin);
	}
}
