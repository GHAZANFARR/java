import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {


        int input = input();
        int fact = recursionFactorial(input);
        System.out.print("factorial is: " + fact);
    }

    public static int input() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the number: ");

        return scanner.nextInt();
    }

    public static int recursionFactorial(int input) {
        /*ALWAYS SET THE LIMIT OF RECURSION FIRST AND THEN RETURN THE CONDITION IN LAST*/

        if(input == 1) {
            return 1;
        }
        return input * recursionFactorial(input-1);
    }
}
