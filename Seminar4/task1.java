package Seminar4;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/**
 * время срабатывания программы
 */
public class task1 {

    public static void main(String[] args) {
        // Deque<Integer> dq = new ArrayDeque<>();
        ArrayList<Integer> dq = new ArrayList<>();
        LinkedList<Integer> linkl = new LinkedList<>();
        LocalTime timeStart = LocalTime.now();

        for (int i = 0; i < 1000000; i++) {
            dq.add(i);
        }
        LocalTime timeStop = LocalTime.now();
        Duration diff = Duration.between(timeStart, timeStop);
        // System.out.println("Time Deque:  " + diff);
        System.out.println("Time ArrayList:  " + diff);

        timeStart = LocalTime.now();

        for (int i = 0; i < 1000000; i++) {
            linkl.add(i);
        }
        timeStop = LocalTime.now();
        diff = Duration.between(timeStart, timeStop);
        System.out.println("Time LinkedList:  " + diff);

        
    }
}