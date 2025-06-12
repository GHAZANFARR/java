import java.util.Scanner;

class Bank{

    float UpperLimit;
    float balance;
    String userName;
    String password;
    int accountNumber;
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

    public String getUserName(){
        return this.userName;
    }

    public int getAccountNumber(Scanner scanner){
        System.out.println("enter the account number(XXXX-XXXX-XXXX-XXXX): ");
        return scanner.nextInt();
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
           try{
               System.err.println("ERROR: Name Field is Empty");
               throw new IllegalArgumentException("username cannot be empty");
           } catch (IllegalArgumentException e) {
               throw new RuntimeException(e.getCause());
           }
        }
        return username.substring(0,1).toUpperCase() + username.substring(1).toLowerCase();
    }

}
