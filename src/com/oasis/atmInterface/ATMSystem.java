package com.oasis.atmInterface;

import java.util.Scanner;

public class ATMSystem {
    private static final String CORRECT_USER_ID = "123456";
    private static final String CORRECT_USER_PIN = "7890";
    
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Welcome to the ATM system!");
        System.out.print("Enter user ID: ");
        String userId = scanner.nextLine();
        
        System.out.print("Enter user PIN: ");
        String userPin = scanner.nextLine();
        
        if (authenticateUser(userId, userPin)) {
            System.out.println("Authentication successful!");
            showMenu();
        } else {
            System.out.println("Invalid user ID or PIN. Exiting...");
        }
    }
    
    private static boolean authenticateUser(String userId, String userPin) {
        return CORRECT_USER_ID.equals(userId) && CORRECT_USER_PIN.equals(userPin);
    }
    
    private static void showMenu() {
        boolean quit = false;
        
        while (!quit) {
            System.out.println("\nATM Menu:");
            System.out.println("1. View Transaction History");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transfer");
            System.out.println("5. Quit");
            
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    viewTransactionHistory();
                    break;
                case 2:
                    performWithdrawal();
                    break;
                case 3:
                    performDeposit();
                    break;
                case 4:
                    performTransfer();
                    break;
                case 5:
                    quit = true;
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
    
    private static void viewTransactionHistory() {
        System.out.println("Viewing transaction history...");
        // Implement the logic to display the transaction history
    }
    
    private static void performWithdrawal() {
        System.out.println("Performing withdrawal...");
        // Implement the logic for performing a withdrawal
    }
    
    private static void performDeposit() {
        System.out.println("Performing deposit...");
        // Implement the logic for performing a deposit
    }
    
    private static void performTransfer() {
        System.out.println("Performing transfer...");
        // Implement the logic for performing a transfer
    }
}