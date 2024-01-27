package com.example.Expense.Tracker.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name="tbl_expenses")
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name ="expense_name")
    private String name;
    private String description;
    @Column(name ="expense_amount")
    private BigDecimal amount;
    private String category;
    private LocalDateTime date;
}
