import java.util.Scanner;

public class Starloop {
    static int userInp;

    public static void main(String[] args) {

        System.out.println("Welcome to the star triangle generator");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        userInp = scanner.nextInt();
        scanner.nextLine();

        System.out.print("what kind of loop do you want? (reverse/basic): ");
        String triangle = scanner.nextLine();

        if (triangle.equalsIgnoreCase("basic")) {
            basicLoop();
        } else if (triangle.equalsIgnoreCase("reverse")) {
            reverseLoop();
        } else {
            System.out.println("you didn't entered a valid triangle type");
            scanner.close();
            return;
        }
    }



    public static void basicLoop() {
        int rows = 0;
        while (rows < userInp) {
            System.out.print("*");
            int i = 0;
            while (i < rows) {          //loop within loop
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
    }


    public static void reverseLoop() {
        int rows = userInp;
        while (rows > 0) {
            System.out.print("*");
            int i = 0;
            while (i < rows) {                //remains same as it have to print same stuff afterall
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows--;
        }
    }
}
