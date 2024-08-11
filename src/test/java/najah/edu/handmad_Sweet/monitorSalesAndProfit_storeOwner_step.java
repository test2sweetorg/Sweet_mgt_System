package najah.edu.handmad_Sweet;

import static org.junit.Assert.assertTrue;

import MyAPP_Sweet_mgt2024.MyApp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class monitorSalesAndProfit_storeOwner_step {
	
	MyApp app;
	int year,month,day = 0;
	
	
	
	public monitorSalesAndProfit_storeOwner_step(MyApp app) {
		
		this.app = app;
	}
	
	

	@Given("Store owner is loggedT into the system")
	public void storeOwnerIsLoggedTIntoTheSystem() {
	    app.loginAsStoreOwner();
	}

	@When("Store owner selects the Monitor Sales and Profits option")
	public void storeOwnerSelectsTheMonitorSalesAndProfitsOption() {
	    app.SO1.monitorSelesCheck();
	    
	}

	@When("Store owner selects the Daily report type")
	public void storeOwnerSelectsTheDailyReportType() {
	    app.SO1.moitordailyProfitCheck();
	    app.SO1.printDailyprofit(year , month , day);
	    
	}

	@Then("Store owner should see the total sales and profits for the current day")
	public void storeOwnerShouldSeeTheTotalSalesAndProfitsForTheCurrentDay() {
	    assertTrue(app.SO1.checkMonitorProfit && app.SO1.checkMonitorProfit_daliy);
	    
	}

	@When("Store owner selects the Monthly report type")
	public void storeOwnerSelectsTheMonthlyReportType() {
	    
		app.SO1.moitorMonthlyProfitCheck();
		app.SO1.printMonthlyprofit(year,month);
		
	}

	@Then("Store owner should see the total sales and profits for the current month")
	public void storeOwnerShouldSeeTheTotalSalesAndProfitsForTheCurrentMonth() {
	    assertTrue(app.SO1.checkMonitorProfit &&app.SO1.checkMonitorProfit_monthly);
	}

	@When("Store owner selects the Yearly report type")
	public void storeOwnerSelectsTheYearlyReportType() {
	    
		app.SO1.moitorYearlyProfitCheck();
		app.SO1.printYearlyprofit(year);
	}

	@Then("Store owner should see the total sales and profits for the current year")
	public void storeOwnerShouldSeeTheTotalSalesAndProfitsForTheCurrentYear() {
	    assertTrue(app.SO1.checkMonitorProfit && app.SO1.checkMonitorProfit_Yearly);
	    
	}

}
