package interview;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the string: ");
        String check = scanner.nextLine();

        String reverse = new StringBuilder(check).reverse().toString();

        System.out.println(Boolean.parseBoolean(check = reverse) ? "palindrome" : "not palindrome");
    }
}
