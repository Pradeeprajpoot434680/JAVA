package BankManagement;

import BankManagement.Auth.Signup;
import BankManagement.Auth.Login;
import BankManagement.Account.*;

import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Signup signup = new Signup();
        Login login = new Login();
        AccountManager accountManager = new AccountManager();

        while (true) {
            System.out.println("\n--- Bank Management System ---");
            System.out.println("1. Sign Up");
            System.out.println("2. Login");
            System.out.println("3. Deposit Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Withdraw Money");
            System.out.println("6. Logout");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = sc.nextInt();
            sc.nextLine();  // To consume the newline character

            switch (choice) {
                case 1:
                    signup.createAccount();
                    break;
                case 2:
                    login.login();
                    break;
                case 3:
                    System.out.print("Enter email to deposit money: ");
                    String depositEmail = sc.nextLine();
                    accountManager.depositeMoney(depositEmail);
                    break;
                case 4:
                    System.out.print("Enter email to check balance: ");
                    String balanceEmail = sc.nextLine();
                    accountManager.checkBalance(balanceEmail);
                    break;
                case 5:
                    System.out.print("Enter email to withdraw money: ");
                    String withdrawEmail = sc.nextLine();
                    accountManager.withdrawMoney(withdrawEmail);
                    break;
                case 6:
                    System.out.println("Logging out...");
                    break;
                case 7:
                    System.out.println("Exiting the system. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
