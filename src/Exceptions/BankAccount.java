package Exceptions;

public class BankAccount {
    private int accountNumber;
    private double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance(){
        System.out.printf("Current balance: %,.2f$\n", balance);
        return balance;
    }
    public void deposit(double amount){
        balance += amount;
        System.out.printf("A deposit of %,.2f$ was made\n", amount);
    }
    public void withdraw(double amount) {
        try{
            if (amount > balance)
                throw new InsufficientFundsException("Withdrawal refusal! amount higher than the balance.");
            balance -= amount;
            System.out.printf("You withdrew %,.2f$ from the account!\n", amount);
        }
        catch (InsufficientFundsException e){
            System.out.println("Action cannot be made: "+e.getMessage());
        }
    }

}
