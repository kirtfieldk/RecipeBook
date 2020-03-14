package ingredients;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Ingredients {
    private final String title;
    private final UUID id;
    private final double amount;

    public Ingredients(@JsonProperty("id") UUID id,
                       @JsonProperty("title") String title,
                       @JsonProperty("amount") double amount){
        this.id = id;
        this.title = title;
        this.amount= amount;
    }

    public String getTitle() {
        return title;
    }

    public UUID getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }
}
