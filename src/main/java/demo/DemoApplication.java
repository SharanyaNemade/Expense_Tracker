package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}



//	LOGIN:- 		http://localhost:8080/login
//  HOME:-   		http://localhost:8080/home
//	REGISTER :- 	http://localhost:8080/register
//	ADD EXPENSE :- 	http://localhost:8080/expenses/add
//	UPDATE:-    	http://localhost:8080/expenses/edit/1
//	Expense List :- http://localhost:8080/expenses