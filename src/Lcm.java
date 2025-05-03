import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        int a = input1();
        int b = input2();
        int fac = lcm(a,b);
        System.out.println("The LCM of " + a + " and " + b + " is: " + fac);
    }

    public static int input1() {
        System.out.println("enter your first number: ");
        Scanner scanner = new Scanner(System.in);
        int inp = scanner.nextInt();
        return inp;
    }

    public static int input2() {
        System.out.println("enter your second number: ");
        Scanner scanner = new Scanner(System.in);
        int inp = scanner.nextInt();
        return inp;
    }

    public static int lcm(int a, int b) {
        int n = 1;
        while (true) {
            int factor = a * n;
            if (factor % b == 0) {
                return factor;
            }
            n++;
        }
    }
}
