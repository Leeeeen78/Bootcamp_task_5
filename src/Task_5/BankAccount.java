package Task_5;

public class BankAccount {
    private double balance;

    public BankAccount() {
    }

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double deposit(double amount) {
        this.balance += amount;
        return this.balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {

        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("There is not enough funds.");
            return;
        } else {
            this.balance -= amount;
        }
    }

    public void printBalance() {

        System.out.println("Account this.balance: " + this.balance);
    }

    public void transferMoney(double amount, BankAccount transfer) {
        if (amount < this.balance) {
            this.withdraw(amount);
            transfer.deposit(amount);
        } else {
            System.out.printf("Transfer cancelled. You are trying to transfer", amount, this.balance);
        }
    }
}

