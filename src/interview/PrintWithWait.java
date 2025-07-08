package interview;

public class PrintWithWait {
    public static void main(String[] args) throws InterruptedException {
        String print = "hello world";
        String newPrint = new StringBuilder(print).reverse().toString();
        Thread.sleep(2000);
        System.out.println(newPrint);
    }
}

