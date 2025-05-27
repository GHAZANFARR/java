import java.util.Scanner;

public class EvenOddOOPS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the number: ");
        int num = scanner.nextInt();

        oddEven(num);
    }

    public static void oddEven(int num) {

        String oddEve = (num%2) == 0 ? "even" : "odd";
        System.out.println(num + " is " + oddEve);
    }
}

