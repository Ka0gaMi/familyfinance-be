package com.example.familyfinancebe.finance.repository;

import com.example.familyfinancebe.finance.model.Finance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface FinanceRepository extends JpaRepository<Finance, UUID> {

    List<Finance> getFinancesByDateOrderByType(String date);

    Finance getFinanceById(UUID id);
}