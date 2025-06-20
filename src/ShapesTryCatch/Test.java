package ShapesTryCatch;

public class Test {
    public static void main(String[] args) {
        Calculations calculations = new Calculations();

        try{
            calculations.Calculate();
            System.err.println("error in execution");
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
