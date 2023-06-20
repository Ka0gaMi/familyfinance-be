package com.example.familyfinancebe.finance.service;

import com.example.familyfinancebe.finance.dto.ExpectedExpensesDTO;
import com.example.familyfinancebe.finance.model.ExpectedExpenses;

public interface ExpectedExpensesService {

    ExpectedExpenses createExpectedExpenses(ExpectedExpensesDTO expectedExpensesDto);

    ExpectedExpenses updateExpectedExpenses(ExpectedExpensesDTO expectedExpensesDto);

    void deleteExpectedExpenses(String id);
}
