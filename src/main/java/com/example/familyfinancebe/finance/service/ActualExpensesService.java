package com.example.familyfinancebe.finance.service;

import com.example.familyfinancebe.finance.dto.ActualExpensesDTO;
import com.example.familyfinancebe.finance.model.ActualExpenses;

public interface ActualExpensesService {

    ActualExpenses createActualExpenses(ActualExpensesDTO actualExpensesDto);

    ActualExpenses updateActualExpenses(ActualExpensesDTO actualExpensesDto);

    void deleteActualExpenses(String id);
}
