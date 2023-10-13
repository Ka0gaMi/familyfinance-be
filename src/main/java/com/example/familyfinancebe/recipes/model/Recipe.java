package com.example.familyfinancebe.recipes.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.List;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "recipe")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Recipe {
    @Id
    @JdbcTypeCode(SqlTypes.CHAR)
    private UUID id;

    @Column
    private String name;

    @Column
    private String instructions;

    @OneToMany
    @JoinColumn(name = "recipe_id")
    private List<RecipeIngredient> recipeIngredients;

}
