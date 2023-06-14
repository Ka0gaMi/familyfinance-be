package com.example.familyfinancebe.finance.repository;

import com.example.familyfinancebe.finance.model.Finance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface FinanceRepository extends JpaRepository<Finance, UUID> {

    List<Finance> findByDate(String date);
}