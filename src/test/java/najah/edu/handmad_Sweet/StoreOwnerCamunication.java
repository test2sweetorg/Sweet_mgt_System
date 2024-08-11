package najah.edu.handmad_Sweet;

import static org.junit.Assert.assertTrue;

import MyAPP_Sweet_mgt2024.MyApp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StoreOwnerCamunication {
	
	MyApp app;
	
	
	
	public StoreOwnerCamunication(MyApp app) {
		
		this.app = app;
	}

	@Given("Store Owner is loggedO in the system")
	public void storeOwnerIsLoggedOInTheSystem() {
	    app.loginAsStoreOwner();
	}

	@When("Store Owner selects a user {string} to communicate with and send message {string}")
	public void storeOwnerSelectsAUserToCommunicateWithAndSendMessage(String userName, String message) {
		userName="shaheen";
		message="hello there";
		app.adduserList(app.Users);
	   app.SO1.sendmassegeToUser(userName, message );
	   
	}

	@Then("the user should receive the message and its stored in communication history")
	public void theUserShouldReceiveTheMessageAndItsStoredInCommunicationHistory() {
	    assertTrue(app.SO1.massegeSentToUser);
	}

	@When("Store Owner selects a supllier {string} to communicate with and send message {string}")
	public void storeOwnerSelectsASupllierToCommunicateWithAndSendMessage(String supplierName, String message) {
		supplierName ="kaser";
		message="hello there";
		app.addSupplierList(app.SupplierList);
		app.SO1.sendmessageToSupplier(supplierName,message);
		
	}

	@Then("the supllier should receive the message and its stored in communication history")
	public void theSupllierShouldReceiveTheMessageAndItsStoredInCommunicationHistory() {
	    assertTrue(app.SO1.massegeSentToSupplier);
	}

	@When("Store Owner selects a see communication history option")
	public void storeOwnerSelectsASeeCommunicationHistoryOption() {
	    app.SO1.showMessagesStoreOwner();
	}

	@Then("Store Owner should see a list of all previous messages sent and received")
	public void storeOwnerShouldSeeAListOfAllPreviousMessagesSentAndReceived() {
	   assertTrue(app.SO1.veiwMassegesHistory);
	}

	
	
	
}
