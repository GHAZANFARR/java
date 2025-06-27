import java.util.Scanner;

public class Fabbioani {
    public static void main(String[] args) {
        int x = input();
        int a = 0;
        int b = 1;
        int c;

        while(a <= x) {
            System.out.print(a + ",");
            c = (a + b);
            a = b;
            b = c;
        }
    }
    public static int input() {
        System.out.println("enter your number: ");
        Scanner scanner = new Scanner(System.in);
        int inp = scanner.nextInt();
        return inp;
    }
}