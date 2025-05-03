import java.util.Scanner;

public class  SumOfNum{
    public static void main(String[] args) {
        int a = input();
        int sum =0;

        while(a > 0){
            sum += a % 10;
            a/=10;
        }

        System.out.println(sum);
    }
    public static int input() {
        System.out.println("enter your number: ");
        Scanner scanner = new Scanner(System.in);
        int inp = scanner.nextInt();
        return inp;
    }
}
