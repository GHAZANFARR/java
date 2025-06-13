import java.util.Scanner;

class Bank{

    float UpperLimit;
    float balance;
    String userName;
    String password;
    String accountNumber;
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

    public void getAccountNumber(Scanner scanner){
        System.out.println("enter the account number(XXXX-XXXX-XXXX-XXXX): ");
        this.accountNumber = String.valueOf(scanner.nextLine());
    }

    public String getAccountNumber(){
        return this.accountNumber;
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
        bank.getAccountNumber(scanner);
        String accountInt = bank.getAccountNumber();

        String AccNumFormat = formattedAccNum(accountInt);

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

    public static String formattedAccNum(String accountInt){

        String accountNumInt = String.valueOf(accountInt);
        if (accountNumInt == null || accountNumInt.isEmpty()){
            try {
                System.err.println("Error: INVALID Account number");
                throw new IllegalArgumentException("Invalid Account Number");
            }catch (IllegalArgumentException e){
                throw new RuntimeException(e.getCause());
            }
        }
        String rawInput = String.valueOf(accountInt);

        rawInput = String.format("%16s", rawInput).replace(' ', '0');

        return rawInput.substring(0,4) + "-" +
                rawInput.substring(4,8) + "-" +
                rawInput.substring(8,12) + "-" +
                rawInput.substring(12,16);
    }
}
