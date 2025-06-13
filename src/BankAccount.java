import java.util.Scanner;

class Bank{

    float UpperLimit;
    float balance;
    String userName;
    String password;
    String accountNumber;
    float requiredMoney;

    public void withdrawal(){
        balance -= requiredMoney;
        if (balance < 0){
            balance = 0;
        }
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
        if (!formatUserName.isEmpty()) {
            System.out.println("Welcome to the BANK, " + formatUserName + ".");
        }
        bank.getAccountNumber(scanner);
        String accountInt = bank.getAccountNumber();

        String AccNumFormat = formattedAccNum(accountInt);

        int operation;
        do{
           operation = operations(scanner);
           opeProcess(operation, bank, scanner);
        }while(operation != 5);
    }

    public static String nameMod(String username) {
        if (username == null || username.isEmpty()) {
            try {
                System.err.println("ERROR: Name Field is Empty");
                throw new IllegalArgumentException("username cannot be empty");
            } catch (IllegalArgumentException e) {
                throw new RuntimeException(e.getCause());
            }
        }
        return username.substring(0, 1).toUpperCase() + username.substring(1).toLowerCase();
    }

    public static String formattedAccNum(String accountInt) {

        String accountNumInt = String.valueOf(accountInt);
        if (accountNumInt == null || accountNumInt.isEmpty()) {
            try {
                System.err.println("Error: INVALID Account number");
                throw new IllegalArgumentException("Invalid Account Number");
            } catch (IllegalArgumentException e) {
                throw new RuntimeException(e.getCause());
            }
        }
        String rawInput = String.valueOf(accountInt);

        rawInput = String.format("%16s", rawInput).replace(' ', '0');

        return rawInput.substring(0, 4) + "-" +
                rawInput.substring(4, 8) + "-" +
                rawInput.substring(8, 12) + "-" +
                rawInput.substring(12, 16);
    }

    public static int operations(Scanner scanner){
        System.out.println("what operation you want to access (select the number of the operation): ");
        System.out.println("1-withdrawal");
        System.out.println("2-deposit");
        System.out.println("3-loan laundering");
        System.out.println("4-loan payment");
        System.out.println("5-exit");
        int operation = scanner.nextInt();

        if (operation < 0 || operation > 5) {
            try {
                System.err.println("INVALID Operation");
                throw new IllegalArgumentException("You have to recheck the list and enter correct input");
            } catch (IllegalArgumentException e) {
                throw new RuntimeException(e);
            }
        }
        return operation;
    }

    public static void opeProcess(int operation, Bank bank, Scanner scanner){
        switch (operation){
            case 1:
                System.out.println("enter the money you want to withdraw: ₹");
                bank.requiredMoney = scanner.nextFloat();
                bank.withdrawal();
                System.out.println("please collect your money from cashing counter with this receipt");
                break;
            case 2:

        }
    }
}
