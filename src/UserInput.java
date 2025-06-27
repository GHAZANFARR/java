import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) { //sout
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your name: ");
        String name = input.nextLine(); //here  if we need a line or string, its next line.. if we just need the int in the whole input.. we take nextint()
        System.out.println("Good morning " + name);
        System.out.println(name + ", also tell me your age");
        int age  = input.nextInt();
        System.out.println(name + " you are " + age + " years old");
    }
}