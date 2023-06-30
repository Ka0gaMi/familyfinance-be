package com.example.familyfinancebe.finance.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.UUID;

@Entity
@Table(name = "finance")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Finance {
    @Id
    @JdbcTypeCode(SqlTypes.CHAR)
    private UUID id;

    @Column
    private String date;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private Type type;

    @Column
    private Double expectedExpensesAmount;

    @Column
    private Double actualExpensesAmount;

}
