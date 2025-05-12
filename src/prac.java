import java.util.Scanner;

public class prac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the array size: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("enter the numbers of array: ");
            array[i] = scanner.nextInt();
        }
        System.out.println("enter the number you want to check: ");
        int input = scanner.nextInt();

        int occ = occ(array, input);

        System.out.println("the number of occourances of " + occ + " are: ");
    }

    public static int occ(int[] array, int input) {

        int occ = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == input) {
                occ++;
            }
        }

        return occ;
    }
}