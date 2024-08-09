package najah.edu.handmad_Sweet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import MyAPP_Sweet_mgt2024.MyApp;
import MyAPP_Sweet_mgt2024.Product;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class best_sellingProduct_Admin {
	
	MyApp app;
	Product bestSellingProducts;
	
	
	public best_sellingProduct_Admin(MyApp app) {
	
		this.app = app;
	}

	@Given("Admin is loggedQ in the System")
	public void adminIsLoggedQInTheSystem() {
	    //app.Admin_is_loggedin=true;
		app.loginAsAdmin();
	}

	@When("Admin click on the best-selling products button")
	public void adminClickOnTheBestSellingProductsButton() {
	    //app.systemAdmin.showBest_SellingBroduct =true;
		app.systemAdmin.showbestSelling();
	    
	}
	

	@When("Admin select a store")
	public void adminSelectAStore() {
		app.makeProductList(app.avalaibleProducts);
		bestSellingProducts = app.systemAdmin.getBestSellingProducts("StoreB");
	}

	@Then("Admin should see a list of the best-selling products in the selected store")
	public void adminShouldSeeAListOfTheBestSellingProductsInTheSelectedStore() {
		assertNotNull(bestSellingProducts);
		//assertTrue(app.systemAdmin.showBest_SellingBroduct);
		
        
	}

	@Then("the list should include product names and total sales")
	public void theListShouldIncludeProductNamesAndTotalSales() {
	    assertNotNull(bestSellingProducts.getProductName());
    int expected= 0;
    assertNotEquals(bestSellingProducts.getNumberOfSalling(),expected);
		//assertTrue(app.systemAdmin.showBest_SellingBroduct);
		
	}

}
