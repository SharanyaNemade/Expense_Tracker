package com.example.demo.services;


import com.example.demo.entity.Expense;
import com.example.demo.entity.User;
import com.example.demo.repositories.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ExpenseServiceImpl implements ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

    @Override
    public Expense addExpense(Expense expense) {
        return expenseRepository.save(expense);
    }

    @Override
    public Expense updateExpense(Expense expense) {
        return expenseRepository.save(expense);
    }

    @Override
    public List<Expense> getExpenses(User user) {
        return expenseRepository.findByUser(user);
    }

    @Override
    public Expense getExpenseById(Long id) {
        return expenseRepository.findById(id).orElse(null);
    }
}
