package interview;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the num: ");
        int num = scanner.nextInt();
        boolean Evn;
        Evn = (num & 1) == 0;

        System.out.println(num + " is " + (Evn ? "even" : "false"));
    }
}
