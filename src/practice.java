import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int limit = scanner.nextInt();
        int[] array = new int[limit];

        // Fill the array with user input
        for (int i = 0; i < limit; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            array[i] = scanner.nextInt();
        }

        boolean repeat = false;

        // Fixed the loop conditions and comparison
        outerLoop: // Label for the outer loop
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {  // Fixed: using == for comparison, not =
                    repeat = true;
                    System.out.println("Duplicate found: " + array[i] +
                            " at positions " + i + " and " + j);
                    break outerLoop; // Exit both loops when duplicate is found
                }
            }
        }

        // Simplified the answer output
        System.out.println("Array contains duplicates: " + repeat);

        scanner.close();
    }
}