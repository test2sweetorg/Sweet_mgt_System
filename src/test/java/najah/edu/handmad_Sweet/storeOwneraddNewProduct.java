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
		productname="prod3";
		storename="StroeA";
		price="30";
		double price1=Double.parseDouble(price);
		boolean b1 =true;
		
		if(productname ==null || storename==null || price1==0.0 ) {
		app.SO1.invaildproduct();
			
		}else {
			app.makeProductList(app.avalaibleProducts);
			prod1 = new Product(productname,storename,price1);
		    for( Product p1: app.avalaibleProducts) {
		    	if(p1.getProductName().equals(prod1.getProductName()) && p1.getStoreNmae().equals(prod1.getStoreNmae())) {
		    		app.SO1.invaildproduct();
		    		b1 = false;
		    	}
		    	
		    }
		    
		    if(b1 ==true) {
		    	
		    	app.SO1.addnewProduct( prod1);
		    }
			
			
		}
		
	    
	}

	@Then("the new product should be added to the product list")
	public void theNewProductShouldBeAddedToTheProductList() {
	    assertTrue(app.SO1.addproductsuccessfuly);
	}

	@Then("an error message {string} should be displayed")
	public void anErrorMessageShouldBeDisplayed(String string) {
	    assertFalse(app.SO1.addproductsuccessfuly);
	}

}
