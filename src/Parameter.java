import java.util.Scanner;

public class Parameter {
    static int a;
    static int b;

    public static void main(String[] args) {
        greeting();
        System.out.println();

        input(); //calls the value back
        int result = sum(); // storing the called value in result
        System.out.println("the sum is " + result);
    }

    public static void greeting() {
        System.out.println("welcome user");
    }

    public static int[] input() {
        System.out.println("Enter your first number: ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        System.out.println("Enter your second number: ");
        b = scanner.nextInt();
        return new int[]{a,b}; //returns a new array back
    }

    public static int sum() {
        return a + b;
    }
}