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
        for (int i=1; i <= first; i++){
            System.out.println(first + "x" + i + "=" + (first * i));
        }
    }
}
