import java.util.Scanner;

public class prac {
    public static void main(String[] args) {
        int i = 1;
        int N = input();
        int sum = 0;

        while (N != 0) {
            int f = N % 10;
            sum += f;
            N /= 10;
        }
        System.out.println("sum od all digit of num is: " + sum);
    }

    public static int input(){
        System.out.println("enter your number: ");
        Scanner scanner = new Scanner(System.in);
        int inp = scanner.nextInt();
        return inp;
    }
}
