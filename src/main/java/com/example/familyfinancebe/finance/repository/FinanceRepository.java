package com.example.familyfinancebe.finance.repository;

import com.example.familyfinancebe.finance.model.Finance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface FinanceRepository extends JpaRepository<Finance, UUID> {

    @Query(value = "SELECT t.* FROM `familyfinance-db`.finance t JOIN `familyfinance-db`.types t2 ON t.type_id = t2.id" +
            " ORDER BY t.type_id", nativeQuery = true)
    List<Finance> getFinancesOrdered();

    @Query(value = "SELECT t.* FROM `familyfinance-db`.finance t JOIN `familyfinance-db`.types t2 ON t.type_id = t2.id" +
            " WHERE t.date = 'default' ORDER BY t.type_id", nativeQuery = true)
    List<Finance> getDefaultsOrdered();

    Finance getFinanceById(UUID id);
}