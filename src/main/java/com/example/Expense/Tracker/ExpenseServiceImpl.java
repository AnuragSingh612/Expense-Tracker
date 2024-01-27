package com.example.Expense.Tracker;

import com.example.Expense.Tracker.Entity.Expense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseServiceImpl implements ExpenseService{
    @Autowired
    private ExpenseRepository expenseRepo;

    @Override
    public List<Expense> getAllExpenses(){
        return expenseRepo.findAll();
    }

    @Override
    public Expense getExpenseById(Long id) {
        return expenseRepo.getById(id);
    }

    @Override
    public boolean deleteExpense(Long id) {
        return false;
    }

    @Override
    public Expense createExpense(Expense newExpense) {
        return expenseRepo.save(newExpense);
    }
}
