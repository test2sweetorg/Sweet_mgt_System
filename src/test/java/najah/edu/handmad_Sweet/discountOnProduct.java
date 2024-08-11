package najah.edu.handmad_Sweet;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import MyAPP_Sweet_mgt2024.MyApp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class discountOnProduct {
	
	MyApp app;
	boolean discountPass;
	
	
	
	public discountOnProduct(MyApp app) {
		
		this.app = app;
	}
	
	

	@Given("Store owner is loggedU in the system")
	public void storeOwnerIsLoggedUInTheSystem() {
	    app.loginAsStoreOwner();
	}

	@When("Store owner selects the Product Discount section to product with name {string} with discount {int}%")
	public void storeOwnerSelectsTheProductDiscountSectionToProductWithNameWithDiscount(String productName, Integer dis) {
	    double discount = dis/100.0;
	    productName="prod1";
	    app.makeProductList(app.avalaibleProducts);
	    discountPass = app.SO1.Discount(productName,discount);
	    
	}

	@Then("the discount should be applied successfully to product")
	public void theDiscountShouldBeAppliedSuccessfullyToProduct() {
	    assertTrue(discountPass);
	}

	@When("Store owner selects the Product Discount section to not existing product with name {string} with discount {int}%")
	public void storeOwnerSelectsTheProductDiscountSectionToNotExistingProductWithNameWithDiscount(String productName, Integer dis) {
		double discount = dis/100.0;
	    productName="prod20";
	    app.makeProductList(app.avalaibleProducts);
	    discountPass = app.SO1.Discount(productName,discount);
	}

	@Then("the discount should be failed")
	public void theDiscountShouldBeFailed() {
	    assertFalse(discountPass);
	}

}
