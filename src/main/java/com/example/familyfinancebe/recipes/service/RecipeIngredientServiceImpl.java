package com.example.familyfinancebe.recipes.service;

import com.example.familyfinancebe.recipes.model.RecipeIngredient;
import com.example.familyfinancebe.recipes.repository.RecipeIngredientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeIngredientServiceImpl implements RecipeIngredientService{

    private final RecipeIngredientRepository recipeIngredientRepository;

    public RecipeIngredientServiceImpl(RecipeIngredientRepository recipeIngredientRepository) {
        this.recipeIngredientRepository = recipeIngredientRepository;
    }

    @Override
    public List<RecipeIngredient> getRecipesIngredients() {
        return recipeIngredientRepository.findAll();
    }
}
