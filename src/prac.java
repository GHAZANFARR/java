import java.util.Scanner;

public class prac {
    public static void main(String[] args) {
        int i = 1;
        int N = input();
        int sum = 1;

        while (i <= N) {
            sum *= i;
            i++;
        }
        System.out.println("sum is: " + sum);
    }

    public static int input(){
        System.out.println("enter your number: ");
        Scanner scanner = new Scanner(System.in);
        int inp = scanner.nextInt();
        return inp;
    }
}
