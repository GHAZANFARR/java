import java.util.Arrays;
import java.util.Scanner;
class Functions{

    public static String firstCaps(String name){
        if (name == null || name.isEmpty()) {
            return name;
        }
        return name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
    }
}

public class PasswordsLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String names = greetings(scanner);
        String capName = Functions.firstCaps(names);
        boolean gender = gender(scanner);
        String passwordUser = Arrays.toString(passwordInput(scanner, capName, gender));

        System.out.println("enter you password: ");
        char[] passwordTrial = passwordInput(scanner, capName, gender);
        Arrays.fill(passwordTrial, '0');
        trialLoop(scanner, Arrays.toString(passwordTrial));
    }

    public static String greetings(Scanner scanner){
        System.out.println("Welcome to the Password Loop");

        System.out.println("what is your good name?: ");
        return scanner.nextLine();
    }

    public static char[] passwordInput(Scanner scanner, String capName, boolean gender){

        if (gender) {
            System.out.println("Welcome Mr. " + capName);
        } else {
            System.out.println("Welcome Miss. " + capName);
        }
        System.out.println("Please set your password: ");

        return scanner.nextLine().toCharArray();
    }


    public static boolean gender(Scanner scanner) {

        System.out.println("what is your gender: (M/F)");
        String gender = scanner.nextLine();
        return gender.equalsIgnoreCase("M");
    }

    public static void trialLoop(Scanner scanner, String passwordTrial) {

        while(true) {
            System.out.println("Enter your password to access further: ");
            char[] attempt = scanner.nextLine().toCharArray();
            if (!Arrays.equals(attempt, passwordTrial.toCharArray())) {
                System.out.println("<<WRONG PASSWORD>>");
                continue;
            }
            System.out.println("Access granted!");
            Arrays.fill(attempt, '0');  // Cleanup
            break;
        }
    }
}