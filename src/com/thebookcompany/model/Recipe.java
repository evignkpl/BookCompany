package com.thebookcompany.model;

import lombok.Data;

import java.util.List;
@Data

public class Recipe extends Entity {
    private int prepTime;
    private List<Ingredient> listOfIngredients;
}
