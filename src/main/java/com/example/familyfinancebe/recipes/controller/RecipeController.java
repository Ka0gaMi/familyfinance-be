package com.example.familyfinancebe.recipes.controller;

import com.example.familyfinancebe.recipes.service.RecipeIngredientService;
import com.example.familyfinancebe.recipes.service.RecipeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/recipes")
@CrossOrigin(origins = "*")
public class RecipeController {
    private final RecipeIngredientService recipeIngredientService;

    private final RecipeService recipeService;

    public RecipeController(RecipeIngredientService recipeIngredientService, RecipeService recipeService) {
        this.recipeIngredientService = recipeIngredientService;
        this.recipeService = recipeService;
    }

    @GetMapping("/get_recipes")
    public ResponseEntity<?> getRecipes() {
        try {
            return ResponseEntity.ok(recipeService.getRecipes());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(Map.of("error", e.getMessage()));
        }
    }
}
