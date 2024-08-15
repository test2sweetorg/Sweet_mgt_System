package najah.edu.handmad_Sweet;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import MyAPP_Sweet_mgt2024.MyApp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class recipes_management_step {
	
	
	MyApp app;
	boolean checkmanageRecipes;
	boolean checkaccepteRecipes;
	boolean checkdeleteRecipe;
	
	
	
	
	public recipes_management_step(MyApp app) {
		
		this.app = app;
	}

	@Given("Admin is loggedKK in the system")
	public void adminIsLoggedKKInTheSystem() {
	    app.loginAsAdmin();
	}

	@When("Admin click on manage recipe")
	public void adminClickOnManageRecipe() {
		checkmanageRecipes= app.systemAdmin.checkManageRecipes();
	}

	@When("choose accept a recipe {string}")
	public void chooseAcceptARecipe(String recipeName) {
		app.addrecipe(app.recipess);
		recipeName = "dessert";
		checkaccepteRecipes = app.systemAdmin.accepteRecipe(recipeName);
		
	    
	}

	@Then("the recipe should be accepted")
	public void theRecipeShouldBeAccepted() {
	    assertTrue(checkmanageRecipes);
	    assertTrue(checkaccepteRecipes);
	}

	@When("choose accept a not valid name recipe {string}")
	public void chooseAcceptANotValidNameRecipe(String recipeName) {
		app.addrecipe(app.recipess);
		recipeName = "";
		checkaccepteRecipes = app.systemAdmin.accepteRecipe(recipeName);
	}

	@Then("the recipe  accepte failed")
	public void theRecipeAccepteFailed() {
		assertTrue(checkmanageRecipes);
	    assertFalse(checkaccepteRecipes);
	}

	@When("choose delete a recipe with name {string}")
	public void chooseDeleteARecipeWithName(String recipeName) {
		
		app.addrecipe(app.recipess);
		recipeName = "meat";
		checkdeleteRecipe = app.systemAdmin.deleteRecipe(recipeName);
	}

	@Then("the recipe should be deleted")
	public void theRecipeShouldBeDeleted() {
		assertTrue(checkmanageRecipes);
		assertTrue(checkdeleteRecipe);
	}

	@When("choose delete a recipe with invaild name {string}")
	public void chooseDeleteARecipeWithInvaildName(String recipeName) {
		
		app.addrecipe(app.recipess);
		recipeName = "bla bla";
		checkdeleteRecipe = app.systemAdmin.deleteRecipe(recipeName);
	}

	@Then("the recip delete failed")
	public void theRecipDeleteFailed() {
		assertTrue(checkmanageRecipes);
		assertFalse(checkdeleteRecipe);
	}

}
