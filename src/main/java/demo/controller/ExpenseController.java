package com.example.demo.controller;

import com.example.demo.entity.Expense;
import com.example.demo.services.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@Controller
@RequestMapping("/expenses")
public class ExpenseController {

    @Autowired
    private ExpenseService expenseService;

    
    
    
    // Show all expenses
    @GetMapping
    public String listExpenses(Model model){
        List<Expense> expenses = expenseService.getExpenses(null); // Simple, no user filtering
        model.addAttribute("expenses", expenses);
        return "expense-list"; // Shows expense-list.html
    }

    
    
    
    // Show Add Expense form
    @GetMapping("/add")
    public String addForm(Model model) {
        model.addAttribute("expense", new Expense()); // empty object for form binding
        return "expense-add"; // Shows expense-add.html
    }

    
    
    
    // Handle Add Expense submission
    @PostMapping("/add")
    public String addExpense(@ModelAttribute Expense expense) {
        expenseService.addExpense(expense);
        return "redirect:/expenses";
    }

    
    
    // Show Edit Expense form
    @GetMapping("/edit/{id}")
    public String editForm(@PathVariable Long id, Model model){
        Expense expense = expenseService.getExpenseById(id);
        if(expense == null){
            return "redirect:/expenses";
        }
        model.addAttribute("expense", expense);
        return "expense-update"; // Shows expense-update.html
    }
    
    
    

    // Handle Update Expense submission
    @PostMapping("/update")
    public String updateExpense(@ModelAttribute Expense expense){
        expenseService.updateExpense(expense);
        return "redirect:/expenses"; // Back to updated list
    }
}
