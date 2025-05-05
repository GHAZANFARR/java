import java.util.Scanner;

public class prac {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome To The Program");
        System.out.println("Enter your number: ");
        int first = scanner.nextInt();
        loop(first);
    }

    public static void loop(int first) {
        int i = first;

        while(i > 0) {
            System.out.println(i);
            i--;
            }
        }
    }
}
