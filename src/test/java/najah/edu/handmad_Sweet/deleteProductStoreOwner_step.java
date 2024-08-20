package najah.edu.handmad_Sweet;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import MyAPP_Sweet_mgt2024.MyApp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class deleteProductStoreOwner_step {
	
	MyApp app;
	boolean index;
	
	public deleteProductStoreOwner_step(MyApp app) {
		this.app = app;
	}

	@Given("Store owner is loggedQ into the system")
	public void storeOwnerIsLoggedQIntoTheSystem() {
	    app.loginAsStoreOwner();
	}

	@When("Store owner click on delete product with name {string}")
	public void storeOwnerClickOnDeleteProductWithName(String productName) {
		app.makeProductList(app.avalaibleProducts);
		productName = "prod1";
		index = app.SO1.deleteProduct(productName);
		
	    
	}

	@Then("the product should be removed from the list of products")
	public void theProductShouldBeRemovedFromTheListOfProducts() {
	   assertTrue(index);
	}
	
	@When("Store owner click on delete product with invalid name {string}")
	public void storeOwnerClickOnDeleteProductWithInvalidName(String productName) {
		app.makeProductList(app.avalaibleProducts);
		productName = "prod20";
		index = app.SO1.deleteProduct(productName);
	}

	@Then("Store owner should see an error message indicating the product does not exist")
	public void storeOwnerShouldSeeAnErrorMessageIndicatingTheProductDoesNotExist() {
	    assertFalse(index);
	}


}
