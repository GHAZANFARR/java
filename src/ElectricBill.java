import java.util.Scanner;

public class ElectricBill {
    public static void main(String[] args) { //100= 4, 100-200 = 6, 200-400= 8, 400+ = 13/-
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the units: ");
        float units = scanner.nextInt();
        scanner.nextLine();
        float cost = 0;

        if(units > 400) {
            float rem = units - 400;
            cost = (float) ((100*4.2) + (100*6) + (200*8) + (rem*13));
        }else if(units > 200) {
            float rem = units - 200;
            cost = (float) ((100*4.2) + (100*6) + (rem*8));
        }else if(units > 100) {
            float rem = units - 100;
            cost = (float) ((100*4.2) + (rem*6));
        }else if (units < 100) {
            cost = (float) (units*4.2);
        }

        System.out.println(cost);
    }
}