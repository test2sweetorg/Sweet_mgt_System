package najah.edu.handmad_Sweet;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import MyAPP_Sweet_mgt2024.MyApp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class updateProductStoreOwner_step {
	
	
	
	MyApp app;
	int productfountindex = -1;
	int newnameisalredyexist = -1;
	
	
	
	
	public updateProductStoreOwner_step(MyApp app) {
		
		this.app = app;
	}

	@Given("Store owner is loggedW into the system")
	public void storeOwnerIsLoggedWIntoTheSystem() {
	    app.loginAsStoreOwner();
	}

	@When("Store owner click on update product with name {string} to name {string}")
	public void storeOwnerClickOnUpdateProductWithNameToName(String oldname, String newname) {
		oldname="prod1";
		newname="prod5";
	   app.makeProductList(app.avalaibleProducts);
		productfountindex =app.SO1.serchOnAProduct(oldname);
		if(productfountindex == -1) {
			app.SO1.invalidupdate();
		}else {
			newnameisalredyexist = app.SO1.serchOnAProduct(newname);
			if(newnameisalredyexist != -1) {
				app.SO1.invalidupdate();
			}
			else {
				app.SO1.updateproductName(productfountindex,newname);
				app.SO1.validupdateProduct();
			}
			
		}
		
		
	}

	@Then("the product name shoud updated successfully")
	public void theProductNameShoudUpdatedSuccessfully() {
	    assertTrue(app.SO1.updateproductseccessfully);
	}

	@Then("the product update failed")
	public void theProductUpdateFailed() {
	    assertFalse(app.SO1.updateproductseccessfully);
	}
	
	
	
	
	@When("Store owner click on update product with name {string} to price {string}")
	public void storeOwnerClickOnUpdateProductWithNameToPrice(String productname, String price) {
		productname="prod2";
		price ="40";
		double price1 = Double.parseDouble(price);
		app.makeProductList(app.avalaibleProducts);
		productfountindex=app.SO1.serchOnAProduct(productname);
		if(productfountindex == -1) {
			app.SO1.invalidupdate();
		}else {
			app.SO1.updateproductPrice(productfountindex,price1);
			app.SO1.validupdateProduct();
			
		}
		
		
		
		
	    
	}

	@Then("the product price shoud updated successfully")
	public void theProductPriceShoudUpdatedSuccessfully() {
		assertTrue(app.SO1.updateproductseccessfully);
	}

	@When("Store owner click on update product with name not found  {string} to price {string}")
	public void storeOwnerClickOnUpdateProductWithNameNotFoundToPrice(String productname, String price) {
		productname="prod7";
		price ="40";
		double price1 = Double.parseDouble(price);
		app.makeProductList(app.avalaibleProducts);
		productfountindex=app.SO1.serchOnAProduct(productname);
		if(productfountindex == -1) {
			app.SO1.invalidupdate();
		}else {
			app.SO1.updateproductPrice(productfountindex,price1);
			app.SO1.validupdateProduct();
			
		}
	}

	@Then("the product price update failed")
	public void theProductPriceUpdateFailed() {
		
		assertFalse(app.SO1.updateproductseccessfully);
	   
	}

}
