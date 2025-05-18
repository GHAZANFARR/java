import java.util.Arrays;
import java.util.Scanner;

public class prac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = arrayInp(1);
        int[] array2 = arrayInp(2);

        sortArr(array1);
        sortArr(array2);
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