import java.util.*;

public class Practice {
    public static void main(String[] args) {
        List<String> listInterface = new ArrayList<>();
        listInterface.add("john");
        listInterface.add("shawn");
        listInterface.add("ron");

        System.out.println(listInterface);


        Queue<String> queueInterface = new LinkedList<>();

        queueInterface.add("sup");
        queueInterface.add("yup");
        queueInterface.add("nope");

        System.out.println(queueInterface);

        Set<String> name = new LinkedHashSet<>();
        Set<String> name1 = new TreeSet<>();
        Set<String> name2 = new HashSet<>();

        name.add("wassup s eqw ");
        name.add("alice");
        name1.add("wassup");
        name1.add("alice");
        name2.add("wassup");
        name2.add("alice");
        System.out.println(name);
        System.out.println(name1);
        System.out.println(name2);
    }
}
