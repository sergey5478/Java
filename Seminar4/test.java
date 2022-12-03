package Seminar4;

import java.util.LinkedList;
import java.util.Queue;

public class test {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Харьков");
        queue.offer("Киев");
        queue.offer("Кременчуг");
        queue.offer("Львов");
        System.out.println(queue);
        System.out.println(queue.peek());

        String town;
        while ((town = queue.poll()) != null) {
            System.out.println(town);
        }
    }
}
