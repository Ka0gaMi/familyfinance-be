package com.example.familyfinancebe.finance.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.YearMonth;
import java.util.UUID;

@Entity
@Table(name = "actual_expenses")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ActualExpenses {
    @Id
    private UUID id;

    @Column
    private Double amount;
}
