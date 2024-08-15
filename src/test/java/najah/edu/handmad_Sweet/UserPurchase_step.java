package najah.edu.handmad_Sweet;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import MyAPP_Sweet_mgt2024.MyApp;
import MyAPP_Sweet_mgt2024.Product;
import MyAPP_Sweet_mgt2024.User;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserPurchase_step {
	
	MyApp app;
	boolean UserloginCheck;
	boolean UserShoppingbutton;
	boolean checkproductaddtoshoppingcard;
	boolean checkproductdeletedfromshoppingcard;
	boolean checkconfirmpayment;
	Product p1;
	User u1;
	
	
	public UserPurchase_step(MyApp app) {
		
		this.app = app;
	}

	@Given("the user is loggedms in the system")
	public void theUserIsLoggedmsInTheSystem() {
	   
		UserloginCheck = app.CheckUserLOgIn();	}

	@When("the user click in shopping button")
	public void theUserClickInShoppingButton() {
		
		UserShoppingbutton = app.shaheen.checkShoppingButton();
		
	}

	@When("click on add product {string} to shopping card")
	public void clickOnAddProductToShoppingCard(String ProductName) {
		app.makeProductList(app.avalaibleProducts);
		ProductName="prod1";
		p1 = app.SearchonProduct(ProductName);
		checkproductaddtoshoppingcard = app.shaheen.addproducttoShoppingcard(p1);
		
	}

	@Then("the product added shopping card")
	public void theProductAddedShoppingCard() {
	   
		assertTrue(UserloginCheck);
		assertTrue(UserShoppingbutton);
		assertTrue(checkproductaddtoshoppingcard);
	}

	@When("click on add invalid product {string} to shopping card")
	public void clickOnAddInvalidProductToShoppingCard(String ProductName) {
		app.makeProductList(app.avalaibleProducts);
		ProductName="prod7";
		p1 = app.SearchonProduct(ProductName);
		checkproductaddtoshoppingcard = app.shaheen.addproducttoShoppingcard(p1);
	}

	@Then("the product added shopping card failed")
	public void theProductAddedShoppingCardFailed() {
		assertTrue(UserloginCheck);
		assertTrue(UserShoppingbutton);
		assertFalse(checkproductaddtoshoppingcard);
	}

	@When("click on delete valid product {string} from shopping card")
	public void clickOnDeleteValidProductFromShoppingCard(String productName) {
		
		Product p2= new Product("prod1","StoreA",20);
		boolean x1= app.shaheen.addproducttoShoppingcard(p2);
		productName="prod1";
		p1 = app.shaheen.searchOnProductFromShoppingCard(productName);
		checkproductdeletedfromshoppingcard = app.shaheen.deleteProductFromShoppingCard(p1);
	    
		
	}

	@Then("the product delete successfully")
	public void theProductDeleteSuccessfully() {
	   
		assertTrue(UserloginCheck);
		assertTrue(UserShoppingbutton);
		assertTrue(checkproductdeletedfromshoppingcard);
	}

	@When("click on delete invalid product {string} from shopping card")
	public void clickOnDeleteInvalidProductFromShoppingCard(String productName) {

		Product p2= new Product("prod1","StoreA",20);
		boolean x1= app.shaheen.addproducttoShoppingcard(p2);
		productName="prod2";
		p1 = app.shaheen.searchOnProductFromShoppingCard(productName);
		checkproductdeletedfromshoppingcard = app.shaheen.deleteProductFromShoppingCard(p1);
	}

	@Then("the product delete fail")
	public void theProductDeleteFail() {
	   
		assertTrue(UserloginCheck);
		assertTrue(UserShoppingbutton);
		assertFalse(checkproductdeletedfromshoppingcard);
	}

	@When("click on confirm")
	public void clickOnConfirm() {
		Product p2= new Product("prod1","StoreA",20);
		boolean x1= app.shaheen.addproducttoShoppingcard(p2);
		checkconfirmpayment = app.shaheen.buy();
	    
	}

	@Then("the products added to order list successfully")
	public void theProductsAddedToOrderListSuccessfully() {
		assertTrue(UserloginCheck);
		assertTrue(UserShoppingbutton);
		assertTrue(checkconfirmpayment);
	}




}
