package com.reciplease.recipe.recipe.steps;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Step {
        private final UUID id;
        private final int step;
        private final String description;

        public Step(@JsonProperty("id") UUID id,
                    @JsonProperty("step") int step,
                    @JsonProperty("description") String description) {
            this.id = id;
            this.step = step;
            this.description = description;
        }

        public UUID getId() {
            return id;
        }

        public int getStep() {
            return step;
        }

        public String getDescription() {
            return description;
        }
    }


