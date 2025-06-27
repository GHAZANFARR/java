import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        boolean isMale = false;
        String name = "Neeraj";

        Scanner input = new Scanner(System.in);
        System.out.println("are you a male?: ");
        String userInput = input.nextLine();

        if (userInput.equalsIgnoreCase("yes")) {
            isMale = true;
        } else if (userInput.equalsIgnoreCase("no")) {
            isMale = false;
        } else {
            System.out.println("not a valid input");
            input.close();
            return; //exit program if input isnt valid
        }

        if(isMale) {
            System.out.println("Mr. " + name);
        } else {
            System.out.println("Mrs. " + name);
        }
    }
}