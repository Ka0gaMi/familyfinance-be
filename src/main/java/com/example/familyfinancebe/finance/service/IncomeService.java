package com.example.familyfinancebe.finance.service;

import com.example.familyfinancebe.finance.dto.IncomeDTO;
import com.example.familyfinancebe.finance.model.Income;

import java.util.List;

public interface IncomeService {

    void createIncome(IncomeDTO incomeDto);

    List<Income> getIncomeByDate(String date);
}
