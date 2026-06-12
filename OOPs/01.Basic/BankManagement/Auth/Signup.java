package BankManagement.Auth;

import BankManagement.Account.BankAccount;
import BankManagement.Account.*;
import java.util.Scanner;

public class Signup {
    static Scanner sc = new Scanner(System.in);

    public void createAccount() {
        System.out.println("Enter your email:");
        String email = sc.nextLine();
        System.out.println("Enter your password:");
        String password = sc.nextLine();
        System.out.println("Enter your name:");
        String name = sc.nextLine();

        BankAccount newAccount = new BankAccount(name, email, password);
        AccountManager.allUsers.add(newAccount);
        System.out.println("User account created successfully!");
    }
}
