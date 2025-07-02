package CollectionsLibrary;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInterface {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("alice");
        queue.offer("goal");
        queue.add("it");

        System.out.println(queue);
    }
}
