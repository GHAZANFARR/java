import java.util.Scanner;

public class prac {

    public static void main(String[] args) {
        int a = 1;
        int b = input();
        while (a <=10) {

            int c = a*b;
            System.out.println(a + " x " + b + " = " + c);
            a++;
        }
    }

    public static int input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number you want table of: ");
        int number = scanner.nextInt();
        return number;
    }


}
