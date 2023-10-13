package com.example.familyfinancebe.recipes.repository;

import com.example.familyfinancebe.recipes.model.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IngredientRepository extends JpaRepository<Ingredient, UUID> {
}
