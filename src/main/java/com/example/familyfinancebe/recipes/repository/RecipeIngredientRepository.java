package com.example.familyfinancebe.recipes.repository;

import com.example.familyfinancebe.recipes.model.RecipeIngredient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RecipeIngredientRepository extends JpaRepository<RecipeIngredient, UUID> {
}
