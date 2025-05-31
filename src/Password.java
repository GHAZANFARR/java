import java.util.Arrays;
import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        input(scanner);
    }

    public static void input(Scanner scanner){

        System.out.println("welcome to the program");
        System.out.print("enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Mr. " + name + " you will need to enter your password to continue");
        System.out.print("enter your password: ");
        char[] passwordChar = scanner.nextLine().toCharArray();
        /*char[] save the password as character array .toCharArray turn input to values of character array*/

        String password = new String(passwordChar);
        /*to bypass the string pool to keep the data leak less likely*/

        Arrays.fill(passwordChar, '0');
        /*extra security as this chance the array values to 0*/

        System.out.println("your password is " + password.length() + " letters long");
    }
}
