public class Overloading {

    public int sum(int a, int b){
        return a + b;
    }

    public int sum(int a, int b, int c, int d){ // Same name can work will there is even slight diff
        return a + b + c + d;
    }

    public static void main(String[] args) {
        Overloading overloading = new Overloading();

        int sum = overloading.sum(4,5);
        int sum1 = overloading.sum(1,2,3,4);
    }
}
