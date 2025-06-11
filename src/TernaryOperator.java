import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the first number: ");
        int first = scanner.nextInt();
        System.out.println("enter the first number: ");
        int second = scanner.nextInt();

        maxMin(first, second);
    }

    public static void maxMin(int first, int second) {

        //suggesting to use math library
        int     maxMin = first < second ? first : second;
        System.out.println(maxMin + " is the minimum number of the two");
    }
}