package com.example.Expense.Tracker.controller;

import com.example.Expense.Tracker.Entity.Expense;
import com.example.Expense.Tracker.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/expense-controller")
public class ExpenseController {
    @Autowired
    private ExpenseService expenseService;

    @GetMapping("/get/expenses")
    public List<Expense> getAllExpenses(){
        return expenseService.getAllExpenses();
    }
    @GetMapping("/expenses/{id}")
            public Expense getExpenseById(@PathVariable("id") Long id){
                return expenseService.getExpenseById(id);
            }

    // Delete an expense by ID
    @DeleteMapping("/expenses/{id}")
    public ResponseEntity<Void> deleteExpense(@PathVariable("id") Long id) {
        boolean deleted = expenseService.deleteExpense(id);
        if (deleted) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    // Create a new expense
    @PostMapping("/expenses")
    public ResponseEntity<Expense> createExpense(@RequestBody Expense newExpense) {
        Expense createdExpense = expenseService.createExpense(newExpense);
        System.out.println(createdExpense.getAmount());
        return new ResponseEntity<>(createdExpense, HttpStatus.CREATED);
    }
}
