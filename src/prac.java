import java.util.Scanner;

public class prac {
    public static void main(String[] args) {
        System.out.println("enter the size of the array: ");

        Scanner scanner = new Scanner(System.in);
        int arrSize = scanner.nextInt();

        int[] array = new int[arrSize];

        for(int i = 0; i < array.length; i++) {
            System.out.println("enter the number: ");
            array[i] = scanner.nextInt();
        }
        System.out.println("enter the unwanted number: ");
        int unNum = scanner.nextInt();

        int occ = occ(array, unNum);
        System.out.println("number of reappear: ");

        int[] newArray = newArr(array, unNum, occ);
    }

    public static int occ(int[] array, int unNum) {

        int occ = 0;

        for (int i = 0; i < array.length ; i++) {
            if (array[i] == unNum) {
                occ++;
            }
        }

        return occ;
    }

    public static int[] newArr(int[] array, int unNum, int occ) {

        int[] newArray = new int[array.length-occ];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != unNum) {
                newArray[index++] =   array [i];
            }
        }

        return newArray;
    }
}