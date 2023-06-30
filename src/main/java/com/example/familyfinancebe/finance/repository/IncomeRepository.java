package com.example.familyfinancebe.finance.repository;

import com.example.familyfinancebe.finance.model.Income;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface IncomeRepository extends JpaRepository<Income, UUID> {
    @Query(value = "SELECT * FROM income WHERE date = ?1 ORDER BY `index`", nativeQuery = true)
    List<Income> getIncomeByDate(String date);

    Income getIncomeById(UUID id);
}