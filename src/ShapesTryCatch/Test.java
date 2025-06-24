package ShapesTryCatch;

public class Test {
    public static void main(String[] args) {
        Calculations calculations = new Calculations();

        try{
            calculations.Calculate();
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
