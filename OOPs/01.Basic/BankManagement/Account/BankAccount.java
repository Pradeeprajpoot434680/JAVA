package BankManagement.Account;

public class BankAccount {
    private String username;
    private String email;
    private String password;
    private Double amount;
    private boolean isLoggin = false;

    public BankAccount(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.amount = Math.random() * 1000;  // Initial random balance
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return username;
    }

    public Double getAmount() {
        return amount;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserName(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setLoggedIn() {
        isLoggin = true;
    }

    public boolean isLoggin() {
        return isLoggin;
    }

    public void setAmount(Double amount) {
        this.amount += amount;
    }
}
