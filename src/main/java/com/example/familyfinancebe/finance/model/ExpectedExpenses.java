package com.example.familyfinancebe.finance.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "expected_expenses")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ExpectedExpenses {
    @Id
    private UUID id;

    @Column
    private Double amount;
}
