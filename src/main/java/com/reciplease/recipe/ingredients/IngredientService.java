package com.reciplease.recipe.ingredients;

import com.reciplease.recipe.recipe.Recipe;
import org.springframework.stereotype.Service;

@Service
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
