package najah.edu.handmad_Sweet;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import MyAPP_Sweet_mgt2024.MyApp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class User_edit_information {

	
	MyApp app;
	boolean isUserLogin;
	boolean checkUserMgtInfo;
	boolean checkEditUserName;
	boolean checkEditUserPassword;
	boolean checkEditUserCity;
	
	
	public User_edit_information(MyApp app) {
		
		this.app = app;
	}

	@Given("User is logINB in the System")
	public void userIsLogINBInTheSystem() {
		isUserLogin=app.CheckUserLOgIn();
		
	}

	@When("User Click on manage personal account")
	public void userClickOnManagePersonalAccount() {
		checkUserMgtInfo=app.shaheen.checkUserManagmentInfo();
	}

	@When("choose edite user name to a new vaild name {string}")
	public void chooseEditeUserNameToANewVaildName(String newUserName) {
		newUserName = "shaheen7";
		app.adduserList(app.Users);
		checkEditUserName = app.shaheen.updateUserName(newUserName);
	}

	@Then("the user name updated successfully")
	public void theUserNameUpdatedSuccessfully() {
	    assertTrue(isUserLogin);
	    assertTrue(checkUserMgtInfo);
	    assertTrue(checkEditUserName);
	    
	}

	@When("choose edite user name to a new invaild name {string}")
	public void chooseEditeUserNameToANewInvaildName(String newUserName) {
		newUserName = "";
		app.adduserList(app.Users);
		checkEditUserName = app.shaheen.updateUserName(newUserName);
	}

	@Then("the user name updated failed")
	public void theUserNameUpdatedFailed() {
		assertTrue(isUserLogin);
	    assertTrue(checkUserMgtInfo);
	    assertFalse(checkEditUserName);
	}

	@When("choose edite user name to a new already exist name {string}")
	public void chooseEditeUserNameToANewAlreadyExistName(String newUserName) {
		newUserName = "hanaal";
		app.adduserList(app.Users);
		checkEditUserName = app.shaheen.updateUserName(newUserName);
	}

	@Then("the user name updated faileddd")
	public void theUserNameUpdatedFaileddd() {
		assertTrue(isUserLogin);
	    assertTrue(checkUserMgtInfo);
	    assertFalse(checkEditUserName);
	}

	@When("choose edite user password to a new vaild password {string}")
	public void chooseEditeUserPasswordToANewVaildPassword(String newPssword) {
		
		newPssword = "lposa45987";
		app.adduserList(app.Users);
		checkEditUserPassword= app.shaheen.UpdateUserPassword(newPssword);
		
	}

	@Then("the user password updated successfully")
	public void theUserPasswordUpdatedSuccessfully() {
		assertTrue(isUserLogin);
	    assertTrue(checkUserMgtInfo);
	    assertTrue(checkEditUserPassword);
	}

	@When("choose edite user password to a new invaild password {string}")
	public void chooseEditeUserPasswordToANewInvaildPassword(String newPssword) {
		
		newPssword = "lpo";
		app.adduserList(app.Users);
		checkEditUserPassword= app.shaheen.UpdateUserPassword(newPssword);
	}

	@Then("the user password updated failed")
	public void theUserPasswordUpdatedFailed() {
		assertTrue(isUserLogin);
	    assertTrue(checkUserMgtInfo);
	    assertFalse(checkEditUserPassword);
	}

	@When("choose edite user city to a new vaild city {string}")
	public void chooseEditeUserCityToANewVaildCity(String newCity) {
		
		newCity = "jenin";
		app.adduserList(app.Users);
		checkEditUserCity= app.shaheen.UpdateUserCity(newCity);
	}

	@Then("the user city updated successfully")
	public void theUserCityUpdatedSuccessfully() {
		assertTrue(isUserLogin);
	    assertTrue(checkUserMgtInfo);
	    assertTrue(checkEditUserCity);
	}

	@When("choose edite user city to a new invaild city {string}")
	public void chooseEditeUserCityToANewInvaildCity(String newCity) {
		
		newCity ="5343548";
		app.adduserList(app.Users);
		checkEditUserCity= app.shaheen.UpdateUserCity(newCity);
	}

	@Then("the user city updated failed")
	public void theUserCityUpdatedFailed() {
		assertTrue(isUserLogin);
	    assertTrue(checkUserMgtInfo);
	    assertFalse(checkEditUserCity);
	}
}
