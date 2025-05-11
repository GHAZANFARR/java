import java.util.Scanner;

public class prac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array= new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("enter the index: ");
            i = scanner.nextInt();
        }

        int total = sum(array);
        System.out.println("sum is: " + total);

        int average = total / size;
        System.out.println("average is: " + average);

    }

    public static int sum(int[] array) {

        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
}


}