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

    private String getUserName(Scanner scanner){
        System.out.println("enter your name: ");
        return scanner.nextLine().
    }
}

public class BankAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


    }
}
