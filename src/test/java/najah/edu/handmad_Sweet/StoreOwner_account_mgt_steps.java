package najah.edu.handmad_Sweet;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import MyAPP_Sweet_mgt2024.MyApp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StoreOwner_account_mgt_steps {
	
	
	MyApp app;
	boolean changeStoreNameCheck;
	boolean changeProductNameCheck;
	boolean changeStoreOwnerNameCheck;
	boolean changeStoreOwnerPasswordCheck;
	
	
	
	
	public StoreOwner_account_mgt_steps(MyApp app) {
		
		this.app = app;
	}

	@Given("Store Owner is loggedF in the sysyem")
	public void storeOwnerIsLoggedFInTheSysyem() {
	    app.loginAsStoreOwner();
	}

	@When("Store owner click on acount information management")
	public void storeOwnerClickOnAcountInformationManagement() {
	    
		app.SO1.accountMangementCheck();
	}

	@When("stroe Owner select upade store name to {string}")
	public void stroeOwnerSelectUpadeStoreNameTo(String newStoreName) {
	   app.addStoreOwnerList(app.StoreOwnerList);
	   newStoreName = "StoreC";
	   changeStoreNameCheck= app.SO1.manageStoreName(newStoreName);
	   
	   
	}

	@Then("the store name updated successfully")
	public void theStoreNameUpdatedSuccessfully() {
	    assertTrue(changeStoreNameCheck);
	}

	@When("Store Owner select update store name to excisted name {string}")
	public void storeOwnerSelectUpdateStoreNameToExcistedName(String newStoreName) {
		 app.addStoreOwnerList(app.StoreOwnerList);
		 newStoreName = "StoreB";
		 changeStoreNameCheck= app.SO1.manageStoreName(newStoreName);
		 
		 
	}

	@Then("the store name update faild")
	public void theStoreNameUpdateFaild() {
		assertFalse(changeStoreNameCheck);
	}



	@When("Store Owner select update his name  to new name {string}")
	public void storeOwnerSelectUpdateHisNameToNewName(String newStoreOwnerName) {
		app.addStoreOwnerList(app.StoreOwnerList);
		newStoreOwnerName ="ibraheem";
		changeStoreOwnerNameCheck=app.SO1.manageStoreOwnerName(newStoreOwnerName);
		
	}

	@Then("the storeOwner name updated successfully")
	public void theStoreOwnerNameUpdatedSuccessfully() {
		assertTrue(changeStoreOwnerNameCheck);
	}

	@When("Store Owner select update his name  to invalid name {string}")
	public void storeOwnerSelectUpdateHisNameToInvalidName(String newStoreOwnerName) {
		app.addStoreOwnerList(app.StoreOwnerList);
		newStoreOwnerName =null;
		changeStoreOwnerNameCheck=app.SO1.manageStoreOwnerName(newStoreOwnerName);
		
	}

	@Then("the storeOwner name updated should failed")
	public void theStoreOwnerNameUpdatedShouldFailed() {
		assertFalse(changeStoreOwnerNameCheck);
	}

	@When("Store Owner select update his password  to new password {string}")
	public void storeOwnerSelectUpdateHisPasswordToNewPassword(String newPassword) {
	    app.addStoreOwnerList(app.StoreOwnerList);
	    newPassword="123555";
	    changeStoreOwnerPasswordCheck = app.SO1.manegeStroeOwnerPassword(newPassword);
	    
	    
	}

	@Then("the storeOwner password updated successfully")
	public void theStoreOwnerPasswordUpdatedSuccessfully() {
	    assertTrue(changeStoreOwnerPasswordCheck);
	}

	@When("Store Owner select update his password  to new invalid password {string}")
	public void storeOwnerSelectUpdateHisPasswordToNewInvalidPassword(String newPasswordinvaild) {
		app.addStoreOwnerList(app.StoreOwnerList);
		newPasswordinvaild=null;
	    changeStoreOwnerPasswordCheck = app.SO1.manegeStroeOwnerPassword(newPasswordinvaild);
	}

	@Then("the storeOwner password updated failed")
	public void theStoreOwnerPasswordUpdatedFailed() {
		 assertFalse(changeStoreOwnerPasswordCheck);
	}

}
