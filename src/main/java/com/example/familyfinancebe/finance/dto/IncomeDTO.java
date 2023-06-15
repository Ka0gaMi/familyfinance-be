package com.example.familyfinancebe.finance.dto;

import lombok.Getter;

@Getter
public class IncomeDTO {
    private String id;

    private String date;

    private String name;

    private Double amount;

    private String notes;

    private Integer expectedDay;

    private Boolean isGot;
}
