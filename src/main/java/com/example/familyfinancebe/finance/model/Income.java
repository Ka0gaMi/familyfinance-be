package com.example.familyfinancebe.finance.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "income")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Income {
    @Id
    private UUID id;

    @Column
    private String date;

    @Column
    private String name;

    @Column
    private Double amount;

    @Column
    private String notes;

    @Column
    private Integer expectedDay;

    @Column
    private Boolean isGot;
}
