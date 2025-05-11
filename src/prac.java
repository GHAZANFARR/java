import java.util.Scanner;

public class prac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the required size of array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("enter the number in array: ");
            System.out.println();
            array[i] = scanner.nextInt();
        }

        int total = sum(array);
        System.out.println("total is: " + total);

        System.out.println("average of the array is: " + (total / size));

    }

    public static int sum(int[] array) {
        int sum = 0;
        for(int num : array) {
            sum += num;
        }
        return sum;
    }
}
