package Bank;

public class User {
    private String name;
    private String accountNumber;
    private double balance;

    public User(String name, String accountNumber){
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount){
        if (this.balance > 0 && amount < this.balance){
            this.balance -= amount;
        }else {
            System.err.println("Insufficient Balance");
        }
    }
}
