package MyAPP_Sweet_mgt2024;

public class recipes {
	
	private String recipeName;
	private String recipeDiscription;
	private boolean recipeStatus;
	public recipes(String recipeName, String recipeDiscription) {
		
		this.recipeName = recipeName;
		this.recipeDiscription = recipeDiscription;
		this.recipeStatus = false;
	}
	public String getRecipeName() {
		return recipeName;
	}
	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}
	public String getRecipeDiscription() {
		return recipeDiscription;
	}
	public void setRecipeDiscription(String recipeDiscription) {
		this.recipeDiscription = recipeDiscription;
	}
	public boolean isRecipeStatus() {
		return recipeStatus;
	}
	public void setRecipeStatus(boolean recipeStatus) {
		this.recipeStatus = recipeStatus;
	}
	
	

}
