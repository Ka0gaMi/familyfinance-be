package com.example.familyfinancebe.finance.service;

import com.example.familyfinancebe.finance.dto.FinanceDTO;
import com.example.familyfinancebe.finance.model.*;

import java.util.List;

public interface FinanceService {

    List<Finance> getFinanceByDate(String date);

    void addFinance(FinanceDTO financeDto, Type type, ExpectedExpenses expectedExpenses,
                    ActualExpenses actualExpenses);

    void updateFinance(FinanceDTO financeDto, Type type, ExpectedExpenses expectedExpenses,
                       ActualExpenses actualExpenses);

    void deleteFinance(String id);
}
