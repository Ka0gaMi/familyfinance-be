package com.example.familyfinancebe.recipes.service;

import com.example.familyfinancebe.recipes.model.Recipe;
import com.example.familyfinancebe.recipes.repository.RecipeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeServiceImpl implements RecipeService{
    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public List<Recipe> getRecipes() {
        return recipeRepository.getRecipesOrdered();
    }
}
