package ingredients;

import recipe.Recipe;

public interface IngredientInterface {

    public void addIngredientToRecipe(Recipe recipe, Ingredients ingredients);
    public Ingredients deleteIngredientFromRecipe(Recipe recipe,Ingredients ingredient);

}
