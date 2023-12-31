package com.example.familyfinancebe.finance.service;

import com.example.familyfinancebe.finance.dto.IncomeDTO;
import com.example.familyfinancebe.finance.model.Income;

import java.util.List;

public interface IncomeService {

    void createIncome(IncomeDTO incomeDto);

    List<Income> getIncomes();

    List<Income> getDefaultIncome(String date);

    void updateIncome(IncomeDTO incomeDto);

    void deleteIncome(String id);

    List<Income> getDefaultIncomes();
}
