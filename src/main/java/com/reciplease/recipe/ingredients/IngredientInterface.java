package com.reciplease.recipe.ingredients;

import com.reciplease.recipe.recipe.Recipe;

public interface IngredientInterface {

    public void addIngredientToRecipe(Recipe recipe, Ingredients ingredients);
    public Ingredients deleteIngredientFromRecipe(Recipe recipe,Ingredients ingredient);

}
