package recipe;

import ingredients.Ingredients;
import recipe.Recipe;

import java.util.List;
import java.util.UUID;

public interface RecipeInterface {
    public void addRecipe(Recipe recipe);
    public Recipe getRecipeById(UUID id);
    public List<Recipe> getAllRecipes();
    public List<Recipe> getRecipeByIngredient(Ingredients ingredient);
    public List<Recipe>  getRecipeByDuration(double duration);
    public List<Recipe> getRecipeByTitle(String title);
    public List<Recipe> getRecipeByAuthor(String author);
    public Recipe updateRecipeById(UUID id, Recipe recipe);
    public Recipe deleteRecipeById(UUID id);
}
