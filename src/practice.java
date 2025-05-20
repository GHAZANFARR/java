import java.util.Scanner;

public class practice {
    public static void main(String[] args) {

        int[][] matrix = input();

        System.out.println("the matrix is: ");
        print(matrix);

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
}
