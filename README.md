# Expense_Tracker




The Expense Tracker is a full-stack web application designed to help users efficiently manage and monitor their personal or household expenses. The system provides secure user authentication, intuitive interfaces for expense management, and easy navigation through various sections of the application.

The project covers the following modules:



🔹 Key Features & Modules

**1. User Authentication**

Login Page:
Allows registered users to log in using their email/username and password.

Implements session handling and basic security measures (e.g., password hashing, form validation).

Registration Page:
Enables new users to create an account by providing required details such as name, email, and password.
Includes validation for unique email and strong password policies.



**2. Expense Management**

Add New Expense:
Users can add an expense entry by specifying details like category (e.g., food, travel, utilities), amount, date, and notes.
Each expense is linked to the authenticated user’s profile.

Update Expense:
Users can update an existing expense entry if they made an error or need to adjust the details.
Includes validation to prevent inconsistent data.





**3. User Interface & Navigation**

Home Page:
Serves as the dashboard after login.
Displays an overview of total expenses, recent transactions, and categorized expense distribution (charts/graphs optional).

List Page:
Displays a detailed list of all expenses recorded by the user in tabular format.
Provides filters (by date, category) and sorting options for easier navigation.
Includes action buttons for edit (update) and delete functionality.





**🔹 Technical Highlights**

Frontend: Thymeleaf.
Backend: Spring Boot (handles authentication & expense operations).
Database: MySQL (stores user credentials and expenses).





**🔹 Use Case Flow**

User registers → logs in → redirected to Home Page.
User navigates to Add Expense to log transactions.
User reviews expenses on List Page with options to update or delete.
Home Page Dashboard updates in real-time to reflect expenses.







