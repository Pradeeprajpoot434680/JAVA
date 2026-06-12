package BankManagement.Account;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountManager {
    public static ArrayList<BankAccount> allUsers = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    // Deposit money
    public void depositeMoney(String email) {
        allUsers.forEach(account -> {
            if (account.getEmail().equals(email)) {
                if (!account.isLoggin()) {
                    System.out.println("You are not logged in.");
                    return;
                } else {
                    System.out.println("How much money do you want to deposit?");
                    double amount = sc.nextDouble();
                    if (amount <= 0) {
                        System.out.println("Invalid amount. Please try again.");
                        return;
                    }
                    account.setAmount(amount);
                    System.out.println("Amount deposited successfully!");
                }
            }
        });
    }

    // Check balance
    public void checkBalance(String email) {
        allUsers.forEach(account -> {
            if (account.getEmail().equals(email)) {
                if (!account.isLoggin()) {
                    System.out.println("You are not logged in.");
                    return;
                }
                System.out.println("Your current balance is: " + account.getAmount());
            }
        });
    }

    // Withdraw money
    public void withdrawMoney(String email) {
        allUsers.forEach(account -> {
            if (account.getEmail().equals(email)) {
                if (!account.isLoggin()) {
                    System.out.println("You are not logged in.");
                    return;
                } else {
                    System.out.println("Enter amount to withdraw:");
                    double amount = sc.nextDouble();
                    if (amount <= 0 || amount > account.getAmount()) {
                        System.out.println("Invalid amount. Please try again.");
                        return;
                    }
                    account.setAmount(-amount);
                    System.out.println("Amount withdrawn successfully!");
                }
            }
        });
    }
}
