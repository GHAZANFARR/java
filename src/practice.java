import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("the limit of array: ");
        int limit = scanner.nextInt();
        int[] array = new int[limit];

        for (int i = 0; i < limit; i++) {
            System.out.print("enter the number: ");
            array[i] = scanner.nextInt();
        }

        boolean repeat = false;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < args.length; j++) {
                if (array[i] == array[j]) {
                    repeat = true;
                    break;
                }
            }
        }


        if (repeat) {
            System.out.println("there was repeatation");
        }else System.out.println("there was no repetation");
    }
}

