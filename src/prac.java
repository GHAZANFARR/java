import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class prac {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String a = "my";
        String b = "name";
        String c = "is";
        String d = "Ghazanfarr";

        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);

        list.sort(Collections.reverseOrder());

        System.out.println(list);
    }

}