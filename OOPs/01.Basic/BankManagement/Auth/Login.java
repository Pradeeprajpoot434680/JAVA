package BankManagement.Auth;

import java.util.Scanner;
import BankManagement.Account.*;

public class Login {
    static Scanner sc = new Scanner(System.in);

    public void login() {
        System.out.println("Enter your email:");
        String email = sc.nextLine();
        System.out.println("Enter your password:");
        String password = sc.nextLine();

        AccountManager.allUsers.forEach(account -> {
            if (account.getEmail().equals(email) && account.getPassword().equals(password)) {
                account.setLoggedIn();
                System.out.println("Login successful!");
                return;
            }
        });

        System.out.println("Invalid credentials.");
    }
}
