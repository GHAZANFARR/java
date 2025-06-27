import java.util.Scanner;

public class Dice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("welcome to the dice");
        System.out.println("do you want to roll the dice?: (Y/N)");
        String task = scanner.nextLine();
        boolean command = task.equalsIgnoreCase("Y");
        if (command){
            diceRoll();
        }else System.out.println("bye");
    }

    public static void diceRoll() {
        int result = (int)(Math.random() * 6);
        System.out.println(result);
    }
}