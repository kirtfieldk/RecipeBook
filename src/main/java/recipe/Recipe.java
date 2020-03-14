package recipe;

import com.fasterxml.jackson.annotation.JsonProperty;
import ingredients.Ingredients;

import java.util.List;
import java.util.UUID;

public class Recipe {
    private final UUID id;
    private final String title;
    private final List<Ingredients> ingredients;
    private final double duration;
    private final String author;



    public Recipe(
            @JsonProperty("id") UUID id,
            @JsonProperty("title") String title,
            @JsonProperty("ingredients") List<Ingredients> ingredients,
            @JsonProperty("duration") double duration,
            @JsonProperty("author") String author){
        this.title = title;
        this.id = id;
        this.ingredients = ingredients;
        this.duration = duration;
        this.author = author;
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }


    public List<Ingredients> getIngredients() {
        return ingredients;
    }

    public double getDuration() {
        return duration;
    }

}
