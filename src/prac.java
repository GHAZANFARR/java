import java.util.Scanner;

public class prac {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome To The Program");
        System.out.println("Enter your number: ");
        int N = scanner.nextInt();
        loop(N);
    }

    public static int loop(int N) {
        int i = 1;
        int factorial = 1;

        while(i<=N) {
            factorial = factorial * i;
            i++;
        }
        return factorial;
    }
}
