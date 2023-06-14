package com.example.familyfinancebe.finance.repository;

import com.example.familyfinancebe.finance.model.Type;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TypeRepository extends JpaRepository<Type, UUID> {
    Type findByName(String name);
}