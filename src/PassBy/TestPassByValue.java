package PassBy;

public class TestPassByValue {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        System.out.println(add(x,y)); //while passing value a copy goes
    }

    public static int add(int a, int b){
        return a + b;
    }
}
