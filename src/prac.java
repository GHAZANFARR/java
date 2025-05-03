import java.util.Scanner;

public class prac {
    public static void main(String[] args) {
        int i = 1;
        int N = input();
        int sum = 0;
        while(i <= N) {
            if (i % 2 != 0){
                sum += 1;
            }
            i++;
        }
        System.out.println("The sum of odd numbers from 1 to " + N + " is: " + sum);
    }

    public static int input(){
        System.out.println("enter your number: ");
        Scanner scanner = new Scanner(System.in);
        int inp = scanner.nextInt();
        return inp;
    }
}
