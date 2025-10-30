# OOPS Java Programs 

This repository contains Java programs based on Object-Oriented Programming concepts.  
Each folder (`Exercise 1`, `Exercise 2`, etc.) includes solutions to basic Java problems done using Eclipse IDE.

## Folder Structure

- `Exercise 1`  
  - Question 1: Ticket Price Calculator 
  - Question 2: Electricity Usage Tracker  
  - Question 3: ATM Simulation  
  - Question 4: Number Guessing Game  

- `Exercise 2`
  - Question 6: Search a number in an array and count its occurrences  
  - Question 7: Display numbers that are multiples of both 3 and 9
 
- `Exercise 3`  
  - Question 2: Create a program to get a string from user and change all occurrences of its first char to `$`, except the first char itself.  
  - Question 6: Given a string, display the run length encoded string for the given string.

- `Exercise 4`  
  - Question 2: Create a `FoodOrder` class with order ID, food item name, price, and quantity, and include a constructor to initialize these details. Add a method to       calculate the total bill as `(price × quantity) + ₹50` for delivery charges. Take input for two different orders, create two `FoodOrder` objects, and display the total bill for each order.

- `Exercise 5`
  - **Bank ATM Application using Inheritance and Method Overriding**  
  - Base class: `CashTree`  
  - Subclasses: `SBI_Bank`, `HDFC_Bank`  
  - Features:  
    - View Balance  
    - Withdraw (with service charge)  
    - Deposit (with interest)  
  - Demonstrates the use of constructors, method overriding, and polymorphism.
   
- `Exercise 6`
  - **Mobile Recharge Application using Abstract Class and Interface**  
  - Interface: `RechargeActions` → methods: `doRecharge()`, `checkBalance()`, `viewCustomerDetails()`  
  - Abstract Class: `Customer` → attributes: `customerId`, `customerName`, `mobileBalance`  
  - Concrete Class: `RechargeSystem` → inherits `Customer` and implements `RechargeActions`  
  - Main Class: `MobileRechargeApp` → menu-driven program to perform recharge operations  
  - Features:  
    - Do Recharge  
    - Check Balance  
    - View Customer Details  
    - Exit
      
-  `Exercise 7`  
- **Exception Handling in Java**  
  - Demonstrates user-defined exceptions:  
    - `LengthException` – when the name length exceeds 7 characters  
    - `FailedException` – when the student’s average marks are less than 50  
    - `NotFirstClassException` – when the average is below 75  
  - **Main Class:** `StudentExceptionApp`  
  - Uses `try`, `catch`, `throw`, and `finally` blocks to manage errors effectively.  
  - Demonstrates exception hierarchy and custom exception handling.  

-  `Exercise 8`  
- **Multithreading in Java**  
  - **Question 1:** Using `Runnable` interface → print multiples of 5 and even numbers concurrently.  
  - **Question 2:** Using `Thread` class → print multiples of 5 and even numbers concurrently.  
  - **Question 3:** Using multiple threads → one prints odd numbers, another prints multiples of 3.  
  - Demonstrates:  
    - Thread creation using both `Thread` class and `Runnable` interface  
    - Parallel execution using `start()` method  
    - Controlled delays using `Thread.sleep()`  

-  `Exercise 9` 
- **File Handling in Java**  
  - **Compulsory Question:** Menu-driven File Manager  
    - Create, rename, and delete files  
    - Create new directories  
    - Display file paths and directory contents  
  - **Question 2:** Write and read student details from a file using  
    `FileWriter`, `BufferedWriter`, `FileReader`, and `BufferedReader`.  
  - Demonstrates file I/O operations, exception handling, and stream management in Java.  

-  `Exercise 10`
- **Graphical User Interface (GUI) using Java Swing API**  
  - **Question 1:** Simple Calculator App  
    - Performs addition, subtraction, multiplication, and division  
    - Uses Swing components like `JFrame`, `JTextField`, and `JButton`  
    - Handles user events through `ActionListener`  
  - **Compulsory Question:** Student Registration Form  
    - **Frame 1:** Input form (Name, Register No, Gender, Department, Languages Known)  
    - **Frame 2:** Displays the entered details  
  - Demonstrates Swing components, layouts, and event-driven programming concepts.  


## Tools Used
- Language: Java  
- IDE: Eclipse  
- GitHub: For version control and submissions  

## Purpose
This repo is maintained for academic use, for submitting Java lab exercises.

---

> More exercises will be added as the semester progresses.
