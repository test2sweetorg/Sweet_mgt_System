package najah.edu.handmad_Sweet;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import MyAPP_Sweet_mgt2024.Admin;
import MyAPP_Sweet_mgt2024.MyApp;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Admin_login_logout_steps {
	
	MyApp app;
	Admin adminn;
	
	public Admin_login_logout_steps(MyApp app) {
		this.app = app;
	}
	
	
	@Given("the Admin is on the log in page")
	public void theAdminIsOnTheLogInPage() {
		
		  app.notlogin();
		   
	}
	
	

	
	@When("the Admin enter username {string} and password {string}")
	public void theAdminEnterUsernameAndPassword(String username, String password) {
		username="malika";
		password="123456";
	     adminn = new Admin(username,password);
	     
	 
	}
	
	
	

	@When("the Admin click in login")
	public void theAdminClickInLogin() {
	    String EX_adminName= app.systemAdmin.getAdmin_name();
	    String EX_adminPassword=app.systemAdmin.getAdmin_password();
	    
	    if(EX_adminName.equals(adminn.getAdmin_name()) && EX_adminPassword.equals(adminn.getAdmin_password()) ) {
	    	
	    	app.loginAsAdmin();
	    	app.loginAdmin();
	    }
	   
	    	
	    	
	     
	}

	@Then("the Admin should be enter the dashboard")
	public void theAdminShouldBeEnterTheDashboard() {
		assertTrue(app.Admin_is_loggedin);
		
	}

	@Then("an error message should be displayed")
	public void anErrorMessageShouldBeDisplayed() {

		assertFalse(app.Admin_is_loggedin); 
	}

//	@Given("the Admin in the dashboard")
//	public void theAdminInTheDashboard() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	
//	
//
//	@When("the Admin click on logout")
//	public void theAdminClickOnLogout() {
//		
//		assertFalse(app.Admin_is_loggedin);
//	}
//	
//	
//
//	@Then("the Admin go to log in page")
//	public void theAdminGoToLogInPage() {
//	    //********************
//		assertFalse(app.Admin_is_loggedin);
//	}

}//public class Admin_login_logout_steps
