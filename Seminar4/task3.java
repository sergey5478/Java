package Seminar4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/*
 * Реализовать консольное приложение, которое:
1. Принимает от пользователя и “запоминает” строки.
2. Если введено print, выводит строки так, чтобы последняя введенная была 
первой в списке, а первая - последней.
3. Если введено revert, удаляет предыдущую введенную строку из памяти.
 */
public class task3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Deque<String> array1 = new ArrayDeque<>();
        while (true) {
            System.out.println("Введите строку \n");
            String line1 = sc.nextLine();
            if (line1.equals("")) {
                break;
            }
            else if(line1.equals("print")){
                while(!array1.isEmpty()) {
                    System.out.print(array1.removeLast() + " ");
                }
            }
            else if(line1.equals("revert")){
                array1.removeLast();
            }
            else{
                array1.add(line1);
            }
        }
        System.out.print(array1);
    }
}
