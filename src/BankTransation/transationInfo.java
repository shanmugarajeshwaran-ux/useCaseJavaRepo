package BankTransation;
import java.util.ArrayList;
import java.util.List;
 
public class transationInfo{
    private double balance;
    private List<String> transactionHistory;
 
    public transationInfo(double initialDeposit) {
        this.balance = initialDeposit;
        this.transactionHistory = new ArrayList<>();
        transactionHistory.add("Initial Deposit: $" + initialDeposit);
    }
 
 
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add("Deposited: $" + amount);
            System.out.println("Successfully deposited $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
 
       public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactionHistory.add("Withdrew: $" + amount);
            System.out.println("Successfully withdrew $" + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }
 
    public void checkBalance() {
        System.out.println("Current Balance: $" + balance);
        transactionHistory.add("Balance Inquiry: $" + balance);
    }
 
    public void showHistory() {
        System.out.println("\n--- Transaction History ---");
        for (String record : transactionHistory) {
            System.out.println(record);
        }
    }
 
    public static void main(String[] args) {
    	transationInfo myAccount = new transationInfo(500.00);
        
        myAccount.deposit(150.0);
        myAccount.withdraw(50.0);
        myAccount.checkBalance();
        
        myAccount.deposit(2000.0);
        myAccount.withdraw(100.0);
        myAccount.checkBalance();
        
        myAccount.showHistory();
    }
}