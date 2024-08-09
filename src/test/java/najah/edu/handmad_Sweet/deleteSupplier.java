package najah.edu.handmad_Sweet;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import MyAPP_Sweet_mgt2024.MyApp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class deleteSupplier {
    
	
	MyApp app;
	 public int index;
	
	
	
	public deleteSupplier(MyApp app) {
		
		this.app = app;
	}

	@Given("Admin is loggedx in the System")
	public void adminIsLoggedxInTheSystem() {
		app.loginAsAdmin();
	}

	@When("Admin click on delete supplier account")
	public void adminClickOnDeleteSupplierAccount() {
		app.systemAdmin.deleteSupplierrFunction();
	}

	@When("Admin enter supplierName {string}")
	public void adminEnterSupplierName(String suppliername) {
		suppliername="kaser";
		app.addSupplierList(app.SupplierList);
	    index=app.systemAdmin.serchSupplier(suppliername);
	}

	@When("there is an existing supplier account with supplierName")
	public void thereIsAnExistingSupplierAccountWithSupplierName() {
	    if(index!=-1) {
	    	app.systemAdmin.deleteSuppler(index);
	    	app.systemAdmin.deleteSupplier =true;
	    }
	}

	@When("Admin enter supplierrName {string}")
	public void adminEnterSupplierrName(String suppliername) {
		suppliername="shaheen";
		app.addSupplierList(app.SupplierList);
		index=app.systemAdmin.serchSupplier(suppliername);
	}
	
	
	@Then("this account should be deleteds")
	public void thisAccountShouldBeDeleteds() {
	    assertTrue(app.systemAdmin.deleteSupplier);
	}

	@When("there is No existing supplier account with supplierName")
	public void thereIsNoExistingSupplierAccountWithSupplierName() {
	    app.systemAdmin.deleteSupplier=false;
	    app.systemAdmin.deleteSupplierfaildMessage();
	}

	@Then("the account not found")
	public void theAccountNotFound() {
	    assertFalse(app.systemAdmin.deleteSupplier);
	    
	}
}
