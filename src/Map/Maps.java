package Map;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<String, Integer> income = new HashMap<>();

        income.put("Ashfaq", 3000000);
        income.put("Ghazanfarr", 3000000);

        System.out.println(income.get("Ashfaq"));

        income.put("Ashfaq", 3500000);
        income.remove("Ghazanfarr");

        for(Map.Entry<String, Integer> entry : income.entrySet()) {
            System.out.println(entry.getKey() + " is earning" + entry.getValue() + ".");
        }
    }
}
