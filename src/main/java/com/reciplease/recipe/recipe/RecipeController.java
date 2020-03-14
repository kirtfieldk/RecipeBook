package com.reciplease.recipe.recipe;

import com.reciplease.recipe.ingredients.Ingredients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/recipe")
public class RecipeController {
    private final RecipeService recipeService;
    @Autowired
    public RecipeController(RecipeService rs){
        this.recipeService = rs;
    }
    @PostMapping
    public void addRecipe(@RequestBody Recipe recipe){
        recipeService.addRecipe(recipe);
    }
    @GetMapping
    public List<Recipe> getAllRecipes(){
        return recipeService.getAllRecipes();
    }
    @GetMapping(path = "{id}")
    public Recipe getRecipeById(@PathVariable("id") UUID id){
        return recipeService.getRecipeById(id);
    }
    @GetMapping(path = "search/ingredient/{ingredient}")
    public List<Recipe> getRecipeById(@PathVariable("ingredient") Ingredients ingredient){
        return recipeService.getRecipeByIngredient(ingredient);
    }

    @GetMapping(path = "search/author/{author}")
    public List<Recipe> getRecipeByAuthor(@PathVariable("author") String author){
        return recipeService.getRecipeByAuthor(author);
    }
    @GetMapping(path = "search/title/{title}")
    public List<Recipe> getRecipeByTitle(@PathVariable("title") String title){
        return recipeService.getRecipeByTitle(title);
    }
    @GetMapping(path = "search/duration/{time}")
    public List<Recipe> getRecipeByTitle(@PathVariable("time") double time){
        return recipeService.getRecipeByDuration(time);
    }
}
