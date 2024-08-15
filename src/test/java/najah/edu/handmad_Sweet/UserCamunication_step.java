package najah.edu.handmad_Sweet;

import static org.junit.Assert.assertTrue;

import MyAPP_Sweet_mgt2024.MyApp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserCamunication_step {
	
	
	MyApp app;
	boolean ckeckuserlogin;
	boolean viewMessageHistory;
	
	
	
	public UserCamunication_step(MyApp app) {
		
		this.app = app;
	}

	@Given("user is loggedO in the system")
	public void userIsLoggedOInTheSystem() {
		ckeckuserlogin=app.CheckUserLOgIn();
	}

	@When("user selects a StoreOwner {string} to communicate with and send message {string}")
	public void userSelectsAStoreOwnerToCommunicateWithAndSendMessage(String StoreOwnerName, String message) {
		StoreOwnerName="tariq";
		message="hello there";
		app.addStoreOwnerList(app.StoreOwnerList);
	   app.shaheen.sendmassegeToStoreOwner(StoreOwnerName, message );
		
	}

	@Then("the storeOwner should receive the message and its stored in communication history")
	public void theStoreOwnerShouldReceiveTheMessageAndItsStoredInCommunicationHistory() {
	    assertTrue(app.shaheen.massegeSentToStoreOwner);
	}

	@When("user selects a see communication history option")
	public void userSelectsASeeCommunicationHistoryOption() {
		app.shaheen.messages.add("fnwlekfnwke");
		viewMessageHistory=app.shaheen.showMessagesUser();
	}

	@Then("user should see a list of all previous messages sent and received")
	public void userShouldSeeAListOfAllPreviousMessagesSentAndReceived() {
	    assertTrue(viewMessageHistory);
	}

}
