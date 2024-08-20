package najah.edu.handmad_Sweet;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import MyAPP_Sweet_mgt2024.MyApp;
import MyAPP_Sweet_mgt2024.Product;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class storeOwneraddNewProduct {
	
	MyApp app;
	public Product prod1;
	
	public storeOwneraddNewProduct(MyApp app) {
		
		this.app = app;
	}

	@Given("Store owner is logged in the System")
	public void storeOwnerIsLoggedInTheSystem() {
	    
		app.loginAsStoreOwner();
	}

	@When("Store owner clicks on Add New Product with productname {string} and storename {string} and price {string}")
	public void storeOwnerClicksOnAddNewProductWithProductnameAndStorenameAndPrice(String productname, String storename, String price) {
		productname="prod5";
		storename="StroeA";
		price="30";
		double price1=Double.parseDouble(price);
		boolean b1 =true;
		app.makeProductList(app.avalaibleProducts);
		app.SO1.addnewProduct(productname,storename,price1);	
	    
	}

	@Then("the new product should be added to the product list")
	public void theNewProductShouldBeAddedToTheProductList() {
	    assertTrue(app.SO1.addproductsuccessfuly);
	}
	
	@When("Store owner clicks on Add New Product with already existing productname {string} and storename {string} and price {string}")
	public void storeOwnerClicksOnAddNewProductWithAlreadyExistingProductnameAndStorenameAndPrice(String productname, String storename, String price) {
	    
		productname="prod2";
		storename="StroeA";
		price="30";
		double price1=Double.parseDouble(price);
		app.makeProductList(app.avalaibleProducts);
		app.SO1.addnewProduct(productname,storename,price1);
		
		
	}

	@Then("an error message {string} should be displayed")
	public void anErrorMessageShouldBeDisplayed(String message) {
		message ="hello";
	    assertFalse(app.SO1.addproductsuccessfuly);
	}

}
