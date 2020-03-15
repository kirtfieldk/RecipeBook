package com.reciplease.recipe.recipe;

import com.reciplease.recipe.ingredients.Ingredients;
import com.reciplease.recipe.recipe.steps.Step;

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
    public Recipe addStepToRecipe(UUID id, Step step);
    public Recipe deleteSTepToRecipe(UUID idRecipe, UUID idStep );
}
