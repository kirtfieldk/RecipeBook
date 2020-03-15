package com.reciplease.recipe.recipe;

import com.reciplease.recipe.exception.ApiException;
import com.reciplease.recipe.ingredients.Ingredients;
import com.reciplease.recipe.recipe.steps.Step;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
@Service
public class RecipeService implements RecipeInterface {
    private static List<Recipe> recipes = new ArrayList<Recipe>();
    @Override
    public void addRecipe(Recipe recipe){
        recipes.add(recipe);
    }
    @Override
    public List<Recipe> getAllRecipes(){
        return recipes;
    }
    @Override
    public Recipe getRecipeById(UUID id) {
        List<Recipe> temp = recipes;
        temp.stream().filter(recipe -> recipe.getId().equals(id));
        if (!temp.isEmpty()) return temp.get(0);
        return null;
    }

    @Override
    public List<Recipe> getRecipeByIngredient(Ingredients ingredient) {
        List<Recipe> temp = recipes;
        return null;
    }

    @Override
    public List<Recipe> getRecipeByDuration(double duration) {
        List<Recipe> temp = recipes;
        return temp.stream().filter(recipe -> recipe.getDuration() <= duration).collect(Collectors.toList());
    }

    @Override
    public List<Recipe> getRecipeByTitle(String title) {
        List<Recipe> temp = recipes;
        return temp.stream().filter(recipe -> recipe.getTitle().equalsIgnoreCase(title)).collect(Collectors.toList());
    }

    @Override
    public List<Recipe> getRecipeByAuthor(String author) {
        List<Recipe> temp = recipes;
        return temp.stream().filter(recipe -> recipe.getAuthor().equalsIgnoreCase(author)).collect(Collectors.toList());
    }

    @Override
    public Recipe updateRecipeById(UUID id, Recipe recipe) {
        List<Recipe> temp = recipes;

        return null;
    }

    @Override
    public Recipe deleteRecipeById(UUID id) {
        List<Recipe> temp = recipes;
        temp.stream().filter(recipe -> recipe.getId() == id).collect(Collectors.toList());
        if (!temp.isEmpty()){
            recipes.remove(temp.get(0));
            return temp.get(0);
        }else
            throw new ApiException("Recipe Not Found");
    }

    @Override
    public Recipe addStepToRecipe(UUID id, Step step){
        List<Recipe> temp = recipes;
        temp.stream().forEach(recipe -> {
            if(recipe.getId() == id){
                recipe.getSteps().set(step.getStep(), step);
            }
        });
        return temp.get(0);

    }

    @Override
    public Recipe deleteSTepToRecipe(UUID idRecipe, UUID idStep ){
        List<Recipe> temp = recipes;
        temp.stream().filter(recipe -> recipe.getId() == idRecipe);
        if(!temp.isEmpty()){
            temp.get(0).getSteps().stream().forEach(stepRecipe -> {
                if(stepRecipe.getId() == idStep){
                    temp.get(0).getSteps().remove(stepRecipe);
                }
            });
        }
        return null;
    }
}
