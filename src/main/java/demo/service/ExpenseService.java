package com.example.demo.services;



import com.example.demo.entity.Expense;
import com.example.demo.entity.User;
import java.util.List;

public interface ExpenseService {
    Expense addExpense(Expense expense);
    Expense updateExpense(Expense expense);
    List<Expense> getExpenses(User user);
    Expense getExpenseById(Long id);
}
