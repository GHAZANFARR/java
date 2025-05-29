import java.util.Scanner;

public class FibonacciSeriesRecursion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the limit: ");
        int limit = scanner.nextInt();

       for (int i = 1; i <= limit; i++) {
           System.out.println(series(i) + ", ");
       }
    }

    public static int series(int position) {

        if (position == 1) {
            return 0;
        }

        if (position == 2) {
            return 1;
        }
        return series(position - 1) + series(position - 2);
    }
}
