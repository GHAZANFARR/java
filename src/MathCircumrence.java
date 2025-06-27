import java.util.Scanner;

public class MathCircumrence {
    public static void main(String[] args) {
        System.out.println("enter the radius: ");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextInt();

        double circumfrence = 2 * Math.PI * radius;
        System.out.println(circumfrence);
    }
}