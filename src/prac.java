import java.util.Arrays;
import java.util.Scanner;

public class prac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("******Welcome to the reverse array generator******");

        int sizeArray;
        System.out.println("enter the size of the array: ");
        sizeArray = scanner.nextInt();

        int[] array = new int[sizeArray];
        for(int i=0; i < sizeArray; i++) {
            System.out.println("enter the number: ");
            array[i] = scanner.nextInt();
        }

        int[] reverseArray = reverseArray(array);
        System.out.println(Arrays.toString(reverseArray));
    }

    public static int[] reverseArray(int[] array) {

        int[] reverse = new int[array.length];
        int index = 0;
        for(int i = array.length - 1; i >= 0; i--) {
            reverse[index++] = array[i];
        }
        return reverse;
    }
}