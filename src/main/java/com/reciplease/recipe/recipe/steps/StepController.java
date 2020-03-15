package com.reciplease.recipe.recipe.steps;

import com.reciplease.recipe.recipe.Recipe;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("api/v1/recipe")
public class StepController {
    StepService stepService = new StepService();
    @PutMapping(path = "{id}")
    public Recipe addStepToRecipe(@PathVariable("id") UUID id, Step step){
        return stepService.addStepToRecipe(id, step);
    }

}
