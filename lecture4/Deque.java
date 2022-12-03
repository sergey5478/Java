package lecture4;

import java.util.ArrayDeque;

public class Deque {
    public static void main(String[] args) {
        java.util.Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1); deque.addLast(2);
        deque.removeLast(); deque.removeLast();
        deque.offerFirst(1); deque.offerLast(2);
        // deque.pollFirst(); deque.pollLast();
        deque.getFirst(); deque.getLast();
        deque.peekFirst(); deque.peekLast();
        System.out.println(deque);
    }

}
