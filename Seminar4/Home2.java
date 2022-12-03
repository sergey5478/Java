package Seminar4;
import java.util.LinkedList;
import java.util.Queue;
/*
 * Реализуйте очередь с помощью LinkedList со следующими методами:
 * enqueue() - помещает элемент в конец очереди, 
 * dequeue() - возвращает первый элемент из очереди и удаляет его, 
 * first() - возвращает первый элемент из очереди, не удаляя.
 */
public class Home2 {   
    static Queue<String> queue = new LinkedList<>(); 
    public static void main(String[] args) {                
        enQueue("Vasia");enQueue("Olia");enQueue("Nastia");enQueue("Ura");
        Print1();

        deQueue();        
        Print1();

        First();        
    }
    public static void enQueue(String element) {
        queue.add(element);      
    }
    public static void deQueue() {
        queue.remove();
    }
    public static void First() {
        System.out.println(queue.peek());
    }
    public static void Print1() {
        System.out.println(queue);
    }
}