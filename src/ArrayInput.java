import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the length of array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int length = array.length;// Gets the number of elements in the array
        int[] copiedArray = Arrays.copyOf(array, array.length); // Copies the entire array
        Arrays.sort(array); // Sorts the array in ascending order
        int index = Arrays.binarySearch(array, 3); // Searches for the value 3

        int[][] matrix = new int[3][3]; // A 3x3 matrix

        int[][] matrix2 = {   // Initializing a 2D array
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int element = matrix[1][2]; // Accesses the element at row 1, column 2
    }
}