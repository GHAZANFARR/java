import java.util.Scanner;

public class BitwiseOddEven {
    public static void main(String[] args) {
        int x = num();
        boolean isOdd = (x & 1) == 1;

        if(isOdd) {
            System.out.println("your num is odd");
        } else {
            System.out.println("your num is even");
        }

    }
    public static int num() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int a = scanner.nextInt();
        scanner.close();
        return a;
    }

}
