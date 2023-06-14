package com.example.familyfinancebe.finance.service;

import com.example.familyfinancebe.finance.dto.IncomeDTO;
import com.example.familyfinancebe.finance.model.Income;

public interface IncomeService {

    public Income createIncome(IncomeDTO incomeDto);
}
