package com.example.Expense.Tracker;

import com.example.Expense.Tracker.Entity.Expense;

import java.util.List;

public interface ExpenseService {
    List<Expense> getAllExpenses();

    Expense getExpenseById(Long id);

    boolean deleteExpense(Long id);

    Expense createExpense(Expense newExpense);
}
