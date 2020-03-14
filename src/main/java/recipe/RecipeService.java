package recipe;

import ingredients.Ingredients;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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
        return recipes.stream().filter(recipe -> recipe.getDuration() <= duration).collect(Collectors.toList());
    }

    @Override
    public List<Recipe> getRecipeByTitle(String title) {
        List<Recipe> temp = recipes;
        return recipes.stream().filter(recipe -> recipe.getTitle().equals(title)).collect(Collectors.toList());

    }

    @Override
    public List<Recipe> getRecipeByAuthor(String author) {
        List<Recipe> temp = recipes;
        return recipes.stream().filter(recipe -> recipe.getAuthor().equals(author)).collect(Collectors.toList());
    }

    @Override
    public Recipe updateRecipeById(UUID id, Recipe recipe) {
        return null;
    }

    @Override
    public Recipe deleteRecipeById(UUID id) {
        return null;
    }
}
