package com.thebookcompany.service;

import com.thebookcompany.model.Ingredient;
import com.thebookcompany.model.Recipe;
import com.thebookcompany.repositories.Repository;

import java.io.IOException;
import java.util.List;

public class IngredientService {
    Repository<Ingredient> loadIngredients() throws IOException;

    void ListOfIngredients(Repository<Ingredient> listOfIngredients);
    void LisOfVegieIngredients(Repository<Ingredient> listOfIngredients);
    void ListOfRecipesWithAvailiableIngredient(Repository<Ingredient> listOfIngredients, Repository<Recipe> listOfRecipes);
    void ListOfRecipesWithGivenIngredients(List<Ingredient> listOfIngredients, Repository<Recipe> listOfRecipes);
}





