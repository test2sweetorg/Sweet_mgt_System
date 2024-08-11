package najah.edu.handmad_Sweet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import MyAPP_Sweet_mgt2024.MyApp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class monitaringProfit_step {
	
	MyApp app;
	boolean dailyProfitselect;
	boolean monthProfitSelect;
	boolean yearProfitSelect;
	
	
	public monitaringProfit_step(MyApp app) {
		
		this.app = app;
	}

	@Given("Admin is loggedW in the System")
	public void adminIsLoggedWInTheSystem() {
	    app.Admin_is_loggedin=true;
	}

	@When("I click on the Monitor profits button")
	public void iClickOnTheMonitorProfitsButton() {
	    app.systemAdmin.monitorProfit = true;
	}

	@When("I select the daily profit")
	public void iSelectTheDailyProfit() {
	    app.systemAdmin.daliyProfitSelect=true;
	    app.systemAdmin.printDalyProfit(2024,7,10);
	    
	}

	@Then("I should see the  profit of currnt day for each store")
	public void iShouldSeeTheProfitOfCurrntDayForEachStore() {
	    assertTrue(app.systemAdmin.daliyProfitSelect);
	    
	}

	@When("I select the month profit")
	public void iSelectTheMonthProfit() {
	    app.systemAdmin.monthProfitSelect=true;
	    app.systemAdmin.printMonthProfit(2024,8);
	    
	}

	@Then("I should see the  profit of currnt month for each store")
	public void iShouldSeeTheProfitOfCurrntMonthForEachStore() {
	    
		assertTrue(app.systemAdmin.monthProfitSelect);
	    
	}

	@When("I select the yearly profit")
	public void iSelectTheYearlyProfit() {
	    app.systemAdmin.yearProfitSelect=true;
	    app.systemAdmin.printYearProfit(2024);
	    
	}

	@Then("I should see the  profit of currnt yearly for each store")
	public void iShouldSeeTheProfitOfCurrntYearlyForEachStore() {
	    
	    assertTrue(app.systemAdmin.yearProfitSelect);
	    
	}

}
