public class EscapeSequence {
    public static void main (String[] args){
        String Seq = "this is the example of escape Sequence";
        System.out.println(Seq);

        String tab = "this is the example of \tTAB escape Sequence"; //adds tab space in place of '\t'
        System.out.println(tab);

        String back = "this is the example of \bbackspace escape Sequence"; //adds back space in place of '\b'
        System.out.println(back);

        String New = "this is the example of \nnew line escape Sequence"; //adds new line in place of '\n'
        System.out.println(New);

        String singleQuote = "this is the example of 'single quote' escape Sequence"; //adds ' in place of \'
        System.out.println(singleQuote);

        String doubleQuote = "this is the example of \"double Quote escape Sequence\""; //adds double quote in place of \"
        System.out.println(doubleQuote);

        String backslash = "this is the example of \\backslash escape Sequence\\"; //adds \\ in place of \\
        System.out.println(backslash);
    }
}