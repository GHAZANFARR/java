import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int b = num();
        int c = 1;
        while (b > 0) {
            c *= b;
            b--;
        }
        System.out.println("factorial is: " + c);
    }

    public static int num() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your number: ");
        int a = scanner.nextInt();
        return a;
    }

}
