public class Swap {
    public static void main(String[] args) {
        int firstNum = 25;
        int secondNum = 50;

        int ghost = firstNum;
        firstNum = secondNum;
        secondNum = ghost;

        System.out.println("first number is: " + firstNum);
        System.out.println("second number is: " + secondNum);
    }
}