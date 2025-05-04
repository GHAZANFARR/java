import java.util.Scanner;

public class prac {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome To The Program");
        System.out.println("Enter your first number: ");
        int first = scanner.nextInt();
        System.out.println("Enter your second number: ");
        int second = scanner.nextInt();

    }

    public static int loop(int first, int second) {
        int greater = Math.max(first, second);

        while(true) {
            if (greater % first == 0 && greater % second == 0) {
                return greater;
            }
        }
    }
}
