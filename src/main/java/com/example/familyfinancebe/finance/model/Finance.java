package com.example.familyfinancebe.finance.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "finance")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Finance {
    @Id
    private UUID id;

    @Column
    private String date;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private Type type;

    @OneToOne
    @JoinColumn(name = "expected_expenses_id")
    private ExpectedExpenses expectedExpenses;

    @OneToOne
    @JoinColumn(name = "actual_expenses_id")
    private ActualExpenses actualExpenses;

}
