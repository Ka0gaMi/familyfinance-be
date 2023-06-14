package com.example.familyfinancebe.finance.dto;

import lombok.Getter;

@Getter
public class FinanceDTO {
    private String id;

    private String date;

    private TypeDTO type;

    private ExpectedExpensesDTO expectedExpenses;

    private ActualExpensesDTO actualExpenses;

    private IncomeDTO income;
}
