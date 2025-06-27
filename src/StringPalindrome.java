import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("welcome to palindrome checker");

        String inp = input();
        boolean p = palindrome(inp);


    }

    public static String input() { //took string to save th input
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the String you need to check: ");
        return scanner.next();
    }

    public static boolean palindrome(String inp){ //strings work same as array, start from 0
        if(inp.length() <= 1) {
            return true;
        }
        int last = inp.length()-1;
        if (inp.charAt(0) != inp.charAt(last)){
            return false;
        }
        String newString = inp.substring(1, last); //first is the one to include and last is to exclude
        return palindrome(newString);
    }
}