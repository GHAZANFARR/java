import java.util.Arrays;
import java.util.Scanner;

public class TwoDifferentArrays{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = arrayInp(1);
        int[] array2 = arrayInp(2);

        sortArr(array1);
        sortArr(array2);

        System.out.println("first sorted array: " + Arrays.toString(array1));
        System.out.println("second sorted array: " + Arrays.toString(array2));

        int array3size = (array1.length) + (array2.length);

        int[] array3 = new int[array3size];

        for(int i = 0; i < array1.length ; i++) {
            array3[i] = array1[i];
        }

        for(int i = 0; i < array1.length ; i++) {
            array3[array1.length + i] = array2[i];
        }

        System.out.println("third array: " + Arrays.toString(array3));

        sortArr(array3);

        System.out.println("third sorted array: " + Arrays.toString(array3));

    }

    public static int[] arrayInp(int arrayNum) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the array size: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.println("enter the num: ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void sortArr(int[] arr) {

        Arrays.sort(arr);
    }
}