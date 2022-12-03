package Seminar4;

import java.util.LinkedList;

/**
 * Пусть дан LinkedList с несколькими элементами. 
 * Реализуйте метод, который вернет “перевернутый” список.
 */
public class Home1 {

    public static void main(String[] args) {
        // Прервое решение))))):
        // LinkedList<Integer> list1 = new LinkedList<>();
        //     Integer a1 = 1;Integer a2 = 2;Integer a3 = 3;Integer a4 = 4;Integer a5 = 5;
        //     list1.add(a1);list1.add(a2);list1.add(a3);list1.add(a4);list1.add(a5);
        //     System.out.print("Создал список: " + list1);
        //     list1.addFirst(a1);list1.removeLast();
        //     list1.addFirst(a2);list1.removeLast();
        //     list1.addFirst(a3);list1.removeLast();
        //     list1.addFirst(a4);list1.removeLast();
        //     list1.addFirst(a5);list1.removeLast();
        //     System.out.print("\nПеревернул список: " + list1);

        // Второе решение:
        LinkedList<Integer> list1 = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            list1.add(i);
        }
        System.out.println("Создал список: " + list1);
        LinkedList<Integer> list2 = new LinkedList<>();        
        for (Integer e:list1) {
            list2.addFirst(e);
        } 
        System.out.println("Перевернул список: " + list2);       
    }
}