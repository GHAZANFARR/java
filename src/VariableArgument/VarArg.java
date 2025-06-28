package VariableArgument;

import java.util.Scanner;

public class VarArg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(sum(4,2));
        System.out.println(sumloop(new int[] {4, 5}));
        System.out.println(sum(1,4,56,3,2,3,4,1));
    }


    public static int sum(int... a){
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }

    public static int sumloop(int[] a){
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }

    public static int sum(int a, int b){
        return a + b;
    }
}
