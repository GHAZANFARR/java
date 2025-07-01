import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        int a = input1();
        int b = input2();
        int x = hCf(a,b);
        System.out.println("The HCF (GCD) of " + a + " and " + b + " is: " + x);
    }

    public static int input1() {
        System.out.println("enter your first number: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int input2() {
        System.out.println("enter your second number: ");
        Scanner scanner = new Scanner(System.in);
        int inp = scanner.nextInt();
        return inp;
    }

    public static int hCf(int a, int b) {
        int gcd = 1;
        int i = 2;
        int least = least(a, b);
        while(i <= least){
            if (a % i == 0 && b % i == 0) {
                gcd = i;
                break;
            }
            i++;
        }
        return gcd;
    }

    public static int least (int a, int b) {
        return Math.min(a, b);
    }
}