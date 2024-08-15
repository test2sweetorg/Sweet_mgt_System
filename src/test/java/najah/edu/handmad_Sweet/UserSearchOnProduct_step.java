package najah.edu.handmad_Sweet;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import MyAPP_Sweet_mgt2024.MyApp;
import MyAPP_Sweet_mgt2024.Product;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserSearchOnProduct_step {
	
	MyApp app;
	boolean checkUserlogin;
	Product p1;
	
	
	
	public UserSearchOnProduct_step(MyApp app) {
		this.app = app;
	}

	@Given("the user is loggedMA in the system")
	public void theUserIsLoggedMAInTheSystem() {
	   
		checkUserlogin = app.CheckUserLOgIn();
	}

	@When("the user click on Search button and enter ProductName {string}")
	public void theUserClickOnSearchButtonAndEnterProductName(String productName) {
	    
		
		app.makeProductList(app.avalaibleProducts);
		productName = "prod1"; 
		p1 = app.SearchonProduct(productName);
		
	}

	@Then("the product should be display for the user")
	public void theProductShouldBeDisplayForTheUser() {
	  
		assertTrue(checkUserlogin);
		assertNotNull(p1);
		
	}

	@When("the user click on Search button and enter invalid ProductName {string}")
	public void theUserClickOnSearchButtonAndEnterInvalidProductName(String productName) {
	   
		app.makeProductList(app.avalaibleProducts);
		productName = ""; 
		p1 = app.SearchonProduct(productName);
		
	}

	@Then("an error message should be shown")
	public void anErrorMessageShouldBeShown() {
	    
		assertTrue(checkUserlogin);
		assertNull(p1);
	}

}
