import java.util.Scanner;

class Bank{

    float UpperLimit;
    float balance;
    String userName;
    String password;
    float accountNumber;
    float requiredMoney;

    private float withdrawal(){
        balance -= requiredMoney;
        if (balance < 0){
            return balance = 0;
        }
        return balance;
    }

    public void getUserName(Scanner scanner){
        System.out.print("enter your name: ");
        this.userName = scanner.nextLine();
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public String getUserName(){
        return this.userName;
    }
}

public class BankAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        bank.getUserName(scanner);
        String username = bank.getUserName();
        String formatUserName = nameMod(username);
        if(!formatUserName.isEmpty()){
            System.out.println("Welcome to the BANK, " + formatUserName + ".");
        }
    }

    public static String nameMod(String username) {
        if(username == null || username.isEmpty()){
            System.err.println("ERROR: Name Field is Empty");
             throw new IllegalArgumentException("username cannot be empty");
        }
        return username.substring(0,1).toUpperCase() + username.substring(1).toLowerCase();
    }
}
