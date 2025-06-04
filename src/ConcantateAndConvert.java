import java.util.Scanner;

public class ConcantateAndConvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String concantate = greetingsInput(scanner);

        String result = convert(scanner, concantate);

        System.out.println(result);

    }

    public static String greetingsInput(Scanner scanner) {

        System.out.println("welcome");
        System.out.println("enter the first input: ");
        String input1 = scanner.nextLine();

        System.out.println("enter the second input: ");
        String input2 = scanner.nextLine();

        return input1 + " " + input2;
    }

    public static String convert(Scanner scanner, String concantate) {
        return  concantate.toUpperCase();
    }
}
