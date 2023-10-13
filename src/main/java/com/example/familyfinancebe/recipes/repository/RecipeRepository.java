package com.example.familyfinancebe.recipes.repository;

import com.example.familyfinancebe.recipes.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface RecipeRepository extends JpaRepository<Recipe, UUID> {

    @Query("SELECT r FROM Recipe r ORDER BY r.id")
    List<Recipe> getRecipesOrdered();
}
