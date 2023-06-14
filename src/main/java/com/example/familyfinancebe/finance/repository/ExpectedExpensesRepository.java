package com.example.familyfinancebe.finance.repository;

import com.example.familyfinancebe.finance.model.ExpectedExpenses;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.*;

public interface ExpectedExpensesRepository extends JpaRepository<ExpectedExpenses, UUID> {
}