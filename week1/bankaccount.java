package week1;
import java.util.Scanner;

public class bankaccount {
    private int accountNumber;
    private int balance;

    Scanner sc = new Scanner(System.in);

    // Getter for account number
    public int getAccountNumber() {
        return accountNumber;
    }

    // Setter for account number
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter for balance
    public int getBalance() {
        System.out.println("Current Balance: " + balance);
        return balance;
    }

    // Deposit method to update balance (restricted setter)
    public void deposit() {
        System.out.print("Enter amount to deposit: ");
        int depositAmount = sc.nextInt();
        if (depositAmount > 0) {
            balance += depositAmount;
            System.out.println("Deposited: " + depositAmount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public static void main(String[] args) {
        bankaccount b = new bankaccount();

        // Optional: set account number
        // b.setAccountNumber(123456);

        // Deposit money
        b.deposit();

        // Show updated balance
        b.getBalance();
    }
}
