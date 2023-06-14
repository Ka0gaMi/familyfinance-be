package com.example.familyfinancebe.finance.repository;

import com.example.familyfinancebe.finance.model.Income;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IncomeRepository extends JpaRepository<Income, UUID> {
}