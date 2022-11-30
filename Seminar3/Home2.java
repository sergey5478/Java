package Seminar3;

import java.util.ArrayList;
/*
 * Задан целочисленный список ArrayList. Найти минимальное, 
 * максимальное и среднее из этого списка
 */
public class Home2 {
    
    public static void main(String[] args) {
        int n = 5;
        int result = 0;               
        ArrayList<Integer> list = new ArrayList<>();
               
        for (int i = 1; i <= n; i++)
            list.add(i);
        
        System.out.println("Есть список: " + list);
        for (int i : list) 
            result += i;             
        
        int min = list.get(0);
        int max = list.get(0);

            for (Integer i: list) {
                if(i < min) 
                    min = i;
                if(i > max) 
                    max = i;
            }
        System.out.println("Среднеарифметическое число: " + result / n);
        System.out.println("минимальное число: " + min);
        System.out.println("максимальное число: " + max);
    }
}
