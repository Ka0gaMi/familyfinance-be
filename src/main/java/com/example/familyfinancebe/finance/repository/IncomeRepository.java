package com.example.familyfinancebe.finance.repository;

import com.example.familyfinancebe.finance.model.Income;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface IncomeRepository extends JpaRepository<Income, UUID> {
    @Query(value = "SELECT * FROM income ORDER BY `index`", nativeQuery = true)
    List<Income> getIncomes();

    @Query(value = "SELECT * FROM income WHERE date = 'default' ORDER BY `index`", nativeQuery = true)
    List<Income> getDefaultsOrdered();

    Income getIncomeById(UUID id);
}