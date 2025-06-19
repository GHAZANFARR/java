public class CalcCulator {
    public static int add(int a, int b){
        return a + b;
    }

    public static int add(int a, int b, int c, int d){
        return a+b+c+d;
    }

    public double add(double a, double b){
        return a + b;
    }

    public static void main(String[] args) {
        CalcCulator calcCulator = new CalcCulator();

        System.out.println(calcCulator.add(24,23.5));
    }
}
