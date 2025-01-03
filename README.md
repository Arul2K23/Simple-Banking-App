# Simple-Banking-App

This is a simple console-based banking application built in Java. It provides the following features:

# Features:
## Home Screen:

Displays a welcome message and options for existing and new customers.
## Customer Options:

###### Existing Customer: Check account balance, deposit, withdraw, or close the account.
###### New Customer: Create a new account with a unique account number.
## Banking Operations:

###### Deposit: Add money to the account.
###### Withdraw: Withdraw money while ensuring sufficient balance.
###### Check Balance: View current account balance.
###### Loan Offers: Options for Personal Loan, Home Loan, Gold Loan, and Agricultural Loan.
###### Close Account : Closes the existing Bank account details
###### Developer Mode: Simulates developer tools like software updates, diagnostics, and shutting down the app.
###### Error Handling: Ensures smooth handling of invalid inputs and unexpected issues.

###### Cross-Platform Console Clearing:

Uses ANSI escape codes for Unix-based systems and cls command for Windows.
## Technical Details:
###### Data Storage: Account balances are managed using a HashMap with account numbers as keys.
###### Random Account Numbers: Ensures unique account numbers.
###### Custom Console Utilities: Includes functions like clearConsole and blinker for better user experience.
## How to Run:
Compile the code using javac Banking.java.
Run the application using java Banking.
For developer mode, pass any argument while running the program, e.g., java Banking dev.

## Note:
This project is a learning exercise aimed at demonstrating core Java concepts such as exception handling, multithreading, and console-based user interaction. It is not intended for production use.

