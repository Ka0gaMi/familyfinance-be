package com.example.familyfinancebe.finance.service;

import com.example.familyfinancebe.finance.dto.ExpectedExpensesDTO;
import com.example.familyfinancebe.finance.model.ExpectedExpenses;
import com.example.familyfinancebe.finance.model.Type;

public interface ExpectedExpensesService {

    public ExpectedExpenses createExpectedExpenses(ExpectedExpensesDTO expectedExpensesDto);
}
