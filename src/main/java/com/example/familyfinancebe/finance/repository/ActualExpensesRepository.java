package com.example.familyfinancebe.finance.repository;

import com.example.familyfinancebe.finance.model.ActualExpenses;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ActualExpensesRepository extends JpaRepository<ActualExpenses, UUID> {
}