package najah.edu.handmad_Sweet;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import MyAPP_Sweet_mgt2024.MyApp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserSignup {
	
	MyApp app;
	boolean checkuserSignUp;
	
	
	
	public UserSignup(MyApp app) {
		this.app = app;
	}

	@Given("the user is on the sign-up page")
	public void theUserIsOnTheSignUpPage() {
	   
		checkuserSignUp=app.usernotSignUp();
		
		
	}

	@When("the user enter a user name {string} and passowrd {string} and email {string} and city {string}")
	public void theUserEnterAUserNameAndPassowrdAndEmailAndCity(String userName, String password, String userEmal, String city) {
		app.adduserList(app.Users);
		userName ="aya";
		password="1234567898";
		userEmal="aya@example.com";
		city="jit";
		checkuserSignUp =app.SignupUser(userName,password,userEmal,city);
		
	}

	@Then("the user should sign up seccessuflly")
	public void theUserShouldSignUpSeccessuflly() {
	    assertTrue(checkuserSignUp);
	}

	@When("the user enter a user name {string} and passowrd {string} and  existing email {string} and city {string}")
	public void theUserEnterAUserNameAndPassowrdAndExistingEmailAndCity(String userName, String password, String userEmal, String city) {
		app.adduserList(app.Users);
		userName ="aya";
		password="1234567898";
		userEmal="shaheen@examplecom";
		city="jit";
		checkuserSignUp =app.SignupUser(userName,password,userEmal,city);
	}

	@Then("the user  sign up failed because of existing email")
	public void theUserSignUpFailedBecauseOfExistingEmail() {
		assertFalse(checkuserSignUp);
	}

	@When("the user enter a user name {string} and invalid passowrd {string} and   email {string} and city {string}")
	public void theUserEnterAUserNameAndInvalidPassowrdAndEmailAndCity(String userName, String password, String userEmal, String city) {
		app.adduserList(app.Users);
		userName ="aya";
		password="123456";
		userEmal="shaheen@examplecom";
		city="jit";
		checkuserSignUp =app.SignupUser(userName,password,userEmal,city);;
	}

	@Then("the user  sign up failed because of invalid password")
	public void theUserSignUpFailedBecauseOfInvalidPassword() {
		assertFalse(checkuserSignUp);
	}

	@When("the user enter a invalid user name {string} and  passowrd {string} and  email {string} and city {string}")
	public void theUserEnterAInvalidUserNameAndPassowrdAndEmailAndCity(String userName, String password, String userEmal, String city) {
		app.adduserList(app.Users);
		userName = null;
		password="12345645315";
		userEmal="shaheen@examplecom";
		city="jit";
		checkuserSignUp =app.SignupUser(userName,password,userEmal,city);;
	}

	@Then("the user  sign up failed because of invalid userName")
	public void theUserSignUpFailedBecauseOfInvalidUserName() {
		assertFalse(checkuserSignUp);
	}
	
}
