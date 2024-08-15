package najah.edu.handmad_Sweet;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import MyAPP_Sweet_mgt2024.MyApp;
import MyAPP_Sweet_mgt2024.recipes;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserAddRecipe_step {
	
	MyApp app;
	boolean checkLoggedInUser;
	boolean checkaddRecipes;
	
	
	
	public UserAddRecipe_step(MyApp app) {
		
		this.app = app;
	}

	@Given("the User is LoggedZ in the system")
	public void theUserIsLoggedZInTheSystem() {
		
		checkLoggedInUser=app.CheckUserLOgIn();
	    
	}

	@When("the User click on post a recipes with recipe name {string} and discription {string}")
	public void theUserClickOnPostARecipesWithRecipeNameAndDiscription(String recipeName, String discription) {
		recipeName ="recip2";
		discription="labalaal";
		checkaddRecipes=app.shaheen.addrecipes(recipeName,discription);
		
	}

	@Then("the recipe should be added th the recipe list")
	public void theRecipeShouldBeAddedThTheRecipeList() {
	    assertTrue(checkLoggedInUser);
	    assertTrue(checkaddRecipes);
	}

	@When("the User click on post a recipes with invalid recipe name {string} and discription {string}")
	public void theUserClickOnPostARecipesWithInvalidRecipeNameAndDiscription(String recipeName, String discription) {
		recipeName ="";
		discription="labalaal";
		checkaddRecipes=app.shaheen.addrecipes(recipeName,discription);
		
		
	}

	@Then("the recipe not added because invalid name")
	public void theRecipeNotAddedBecauseInvalidName() {
		assertTrue(checkLoggedInUser);
	    assertFalse(checkaddRecipes);
	}

	@When("the User click on post a recipes with  recipe name {string} and invalid discription {string}")
	public void theUserClickOnPostARecipesWithRecipeNameAndInvalidDiscription(String recipeName, String discription) {
		recipeName ="recip2";
		discription=null;
		checkaddRecipes=app.shaheen.addrecipes(recipeName,discription);
	}

	@Then("the recipe not added because invalid discription")
	public void theRecipeNotAddedBecauseInvalidDiscription() {
		assertTrue(checkLoggedInUser);
	    assertFalse(checkaddRecipes);
	}

}
