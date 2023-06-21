package com.example.familyfinancebe.finance.dto;

import lombok.Getter;

@Getter
public class FinanceDTO {
    private String id;

    private String date;

    private TypeDTO type;

    private Double expectedExpensesAmount;

    private Double actualExpensesAmount;

    private IncomeDTO income;
}
