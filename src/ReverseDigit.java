
import java.util.Scanner;

public class ReverseDigit {
    public static void main(String[] args) {
        int b = num();
        int dis;
        int newNum= 0;
        while (b > 0) {
            dis = b % 10;
            newNum = newNum * 10 + dis;
            b /= 10;
        }
        System.out.println("reverse num of input is: " + newNum);
    }

    public static int num() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your number: ");
        int a = scanner.nextInt();
        return a;
    }

}
