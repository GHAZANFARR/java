import java.util.Scanner;

public class Primenum {
    public static void main(String[] args) {
        int i = 2;
        int a = input();
        boolean isPrime = true;

        while (i <= a) {
            if (a % i == 0) {
                isPrime = false;
                break;
            }
            i++;
        }
        if(isPrime){
            System.out.println("it is not prime");
        }else{
            System.out.println("it is prime");
        }
    }
    public static int input() {
        System.out.println("enter your number: ");
        Scanner scanner = new Scanner(System.in);
        int inp = scanner.nextInt();
        return inp;
    }
}