package CollectionsLibrary;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {
    public static void main(String[] args) {
        Set<String> name0 = new HashSet<>();
        Set<String> name1 = new LinkedHashSet<>(); //keep insertion order
        Set<String> name2 = new TreeSet<>(); //auto- sorted

        name0.add("wassup s eqw ");
        name0.add("alice");
        name1.add("wassup");
        name1.add("alice");
        name2.add("wassup");
        name2.add("alice");

        System.out.println(name0);
        System.out.println(name1);
        System.out.println(name2);
    }
}
