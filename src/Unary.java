public class Unary {
    public static void main(String[] args) {
        int x = 5;
        int y = -x; // '-' returns the value as negative of int
        System.out.println(y);

        System.out.println("watching post increment");
        int p = 5;
        System.out.println(p++); //compiler will first note p then increment later after printing out the p
        System.out.println(p);

        System.out.println("watching pre increment");
        int u = 5;
        System.out.println(++u); //compiler will first note ++ then increment before printing out the u
        System.out.println(u);


        System.out.println("watching post decrement");
        int t = 5;
        System.out.println(t--); //compiler will first note t then decrement later after printing out the t
        System.out.println(t);

        System.out.println("watching pre decrement");
        int r = 5;
        System.out.println(--r); //compiler will first note -- then decrement before printing out the r
        System.out.println(r);
    }
}
