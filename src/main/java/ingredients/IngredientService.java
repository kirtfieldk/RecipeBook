package ingredients;

import recipe.Recipe;

public class IngredientService implements IngredientInterface {


    @Override
    public void addIngredientToRecipe(Recipe recipe, Ingredients ingredients) {
        recipe.getIngredients().add(ingredients);
    }

    @Override
    public Ingredients deleteIngredientFromRecipe(Recipe recipe, Ingredients ingredient) {
        return null;
    }
}
