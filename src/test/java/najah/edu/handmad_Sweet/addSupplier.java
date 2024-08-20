package najah.edu.handmad_Sweet;

import static org.junit.Assert.assertTrue;

import MyAPP_Sweet_mgt2024.MyApp;
import MyAPP_Sweet_mgt2024.Supplier;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class addSupplier {
	
	MyApp app;
	
	
	
	public addSupplier(MyApp app) {
		
		this.app = app;
	}

	@Given("Admin is loggedinW in the System")
	public void adminIsLoggedinWInTheSystem() {
	
		    app.loginAsAdmin();
	}

	@When("Admin click on Create new supplier")
	public void adminClickOnCreateNewSupplier() {
	    app.systemAdmin.setAddSupplier(true);
	}

	@When("fill the details of the supplier supplier name {string} and password {string}")
	public void fillTheDetailsOfTheSupplierSupplierNameAndPassword(String supname, String suppassword) {
	    Supplier s1 = new Supplier(supname,suppassword);
	    app.systemAdmin.addSupplier(s1);
	}

	@Then("the new supplier account should be created")
	public void theNewSupplierAccountShouldBeCreated() {
	    assertTrue(app.systemAdmin.isAddSupplier());
	}

}
