public class TypeConversion {
    public static void main(String[] args) {
        Float myNum = 5f; //forced int into flot with 'f'
        System.out.println(myNum); //example of implicit conversion or widening or putting smaller value in bigger place or COERCION

        int myInt = (int) 5.67f; //forced the float value in int with (int)
        System.out.println(myInt); //example of explicit conversion, or narrowing or putting bigger value in smaller container or CASTING

    }
}
