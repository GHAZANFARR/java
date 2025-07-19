package interview;
public class SwapWithoutTemp {
    public static void main(String[] args) {

        int first = 10;
        int second = 5;

     first = first + second;
     second = first - second;
     first = first - second;

     System.out.println("a is : " + first + ". b is: " + second);
    }
}
