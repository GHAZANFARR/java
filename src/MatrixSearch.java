import java.util.Scanner;

public class MatrixSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = input();

        System.out.println("the matrix is: ");
        print(matrix);

        System.out.println("enter the number you want to search: ");
        int num = scanner.nextInt();

        search(matrix, num);

    }

    public static int[][] input() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the 2D Array");

        System.out.println("enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.println("enter the number of columns: ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("enter the number: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    } //taking array input from user

    public static void print(int[][] matrix) {

        for (int[] row : matrix) {
            for (int value : row) {
                System.out.println(value + "\t");
            }
        }
    } //printing the matrix

    public static void search(int[][] matrix, int num) {

        boolean found = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == num){
                    System.out.println("num found at row: " + i + ", column: " + j);
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("your number is not in matrix");
        }
    } //searching the required number and printing it
}
