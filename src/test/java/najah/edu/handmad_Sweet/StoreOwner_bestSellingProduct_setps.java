package najah.edu.handmad_Sweet;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import MyAPP_Sweet_mgt2024.MyApp;
import MyAPP_Sweet_mgt2024.Product;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StoreOwner_bestSellingProduct_setps {
	
	MyApp app;
	Product bestSellingProducts;
	
	
	
	public StoreOwner_bestSellingProduct_setps(MyApp app) {
		
		this.app = app;
	}

	@Given("Store owner is loggedY into the system")
	public void storeOwnerIsLoggedYIntoTheSystem() {
	    app.loginAsStoreOwner();
	}

	@When("Store owner click on the best-selling products button")
	public void storeOwnerClickOnTheBestSellingProductsButton() {
	    app.SO1.ShowBestSellingCheck();
	}

	@When("Store owner select a store")
	public void storeOwnerSelectAStore() {
		app.makeProductList(app.avalaibleProducts);
		bestSellingProducts = app.SO1.getBestSellingProducts("StoreB");
		
	}

	@Then("Store owner should see the best-selling products in the selected store")
	public void storeOwnerShouldSeeTheBestSellingProductsInTheSelectedStore() {
		assertNotNull(bestSellingProducts);
	}

}
