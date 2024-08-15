package najah.edu.handmad_Sweet;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import MyAPP_Sweet_mgt2024.MyApp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserSignIn {

	MyApp app;
	boolean signinCheck;
	
	
	public UserSignIn(MyApp app) {
		this.app = app;
	}

	@Given("User is in the log_in page")
	public void userIsInTheLogInPage() {
	 
	signinCheck =app.checkUsernotlogin();
		
	}

	@When("User enter valid userName {string} and valid password {string}")
	public void userEnterValidUserNameAndValidPassword(String userName, String password) {
		app.adduserList(app.Users);
		userName ="shaheen";
		password = "54545454"; 
		
		signinCheck = app.UserloginPage(userName,password);
	    
	}

	@Then("User log_in successfully")
	public void userLogInSuccessfully() {
	    assertTrue(signinCheck);
	}

	@When("User enter invalid userName {string} and password {string}")
	public void userEnterInvalidUserNameAndPassword(String userName, String password) {
		app.adduserList(app.Users);
		userName =null;
		password = "54545454"; 
		signinCheck = app.UserloginPage(userName,password);
	}

	@Then("User log_in failed because of invalid userName")
	public void userLogInFailedBecauseOfInvalidUserName() {
		 assertFalse(signinCheck);
	}

	@When("User enter  userName {string} and invalid password {string}")
	public void userEnterUserNameAndInvalidPassword(String userName, String password) {
		app.adduserList(app.Users);
		userName = "shaheen";
		password = "545488777"; 
		signinCheck = app.UserloginPage(userName,password);
	}

	@Then("User log_in failed because of invalid password")
	public void userLogInFailedBecauseOfInvalidPassword() {
	
		assertFalse(signinCheck);
	}
	
	@When("User enter userName {string} and  password {string} and he has no account")
	public void userEnterUserNameAndPasswordAndHeHasNoAccount(String userName, String password) {
	   
		app.adduserList(app.Users);
		userName = "ahmad";
		password = "545488777"; 
		signinCheck = app.UserloginPage(userName,password);
		
	}

	@Then("User log_in failed because he doesn't have account")
	public void userLogInFailedBecauseHeDoesnTHaveAccount() {
		
		assertFalse(signinCheck);
	}
}
