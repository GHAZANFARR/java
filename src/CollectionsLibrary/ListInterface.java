package CollectionsLibrary;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("alice");
        list.add("clock");
        list.add("glock");

        System.out.println(list.get(2));
    }
}
