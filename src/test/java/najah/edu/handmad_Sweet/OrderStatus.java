package najah.edu.handmad_Sweet;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import MyAPP_Sweet_mgt2024.MyApp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderStatus {
	
	MyApp app;
	boolean viewOrdercheck;
	boolean changeOrderStatusCheck;
	boolean deleteOrderCheck;
	
	public OrderStatus(MyApp app) {
		
		this.app = app;
	}

	@Given("store owner is loggedK in the system")
	public void storeOwnerIsLoggedKInTheSystem() {
	    app.loginAsStoreOwner();
	}

	@When("StoreOwner click on view order status")
	public void storeOwnerClickOnViewOrderStatus() {
		app.addStoreOwnerList(app.StoreOwnerList);
		app.SO1.makeOrderList(app.SO1.userOrders);
		viewOrdercheck = app.SO1.viewOrders();
	}

	@Then("the orders sholud be display")
	public void theOrdersSholudBeDisplay() {
	    assertTrue(viewOrdercheck);
	}

	@When("storeOwner click on change order status for order has Id {int}")
	public void storeOwnerClickOnChangeOrderStatusForOrderHasId(Integer orderId) {
		app.SO1.makeOrderList(app.SO1.userOrders);
		orderId =123;
	    changeOrderStatusCheck = app.SO1.changeOrderStatus(orderId);
	}

	@Then("the Order should be updated")
	public void theOrderShouldBeUpdated() {
	    assertTrue(changeOrderStatusCheck);
	}

	@When("storeOwner click on change order status for order has not found Id {int}")
	public void storeOwnerClickOnChangeOrderStatusForOrderHasNotFoundId(Integer orderId) {
		app.SO1.makeOrderList(app.SO1.userOrders);
		orderId =123456;
		changeOrderStatusCheck = app.SO1.changeOrderStatus(orderId);
	}

	@Then("the order has not found message")
	public void theOrderHasNotFoundMessage() {
		assertFalse(changeOrderStatusCheck);
	}

	@When("storeOwner click on delete order with valid id {int} from the list")
	public void storeOwnerClickOnDeleteOrderWithValidIdFromTheList(Integer orderid) {
		app.SO1.makeOrderList(app.SO1.userOrders);
		orderid =123;
	    deleteOrderCheck = app.SO1.deleteOrder(orderid); 
	}

	@Then("the Order should be deleted successfully")
	public void theOrderShouldBeDeletedSuccessfully() {
	   assertTrue(deleteOrderCheck);
	}

	@When("storeOwner click on delete order with invalid id {int} from the list")
	public void storeOwnerClickOnDeleteOrderWithInvalidIdFromTheList(Integer orderid) {
		app.SO1.makeOrderList(app.SO1.userOrders);
		orderid =12389;
		deleteOrderCheck = app.SO1.deleteOrder(orderid);
	}

	@Then("the Order is not found mesaage")
	public void theOrderIsNotFoundMesaage() {
	    assertFalse(deleteOrderCheck);
	}

}
