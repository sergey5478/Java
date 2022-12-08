package Seminar5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeMap;
/*
 * Пусть дан список сотрудников: Иванов Иван(и остальные, полный текст дз на платформе)
 * Написать программу, которая найдети выведет повторяющиеся имена с колличеством повторенний
 * Отсортировать по убыванию популярности.
 */
public class Home2 {
    public static void main(String[] args) {
        String[] string1 = {"Петров Иван", "Иванов Олег", "Сидоров Олег", 
                        "Слипин Иван", "Рогова Ася", "Ивов Олег"};
        ArrayList <String> list1 = new ArrayList<>(Arrays.asList(string1));        
        TreeMap <Integer, String> names = new TreeMap<>(Collections.reverseOrder());
        for (int i = 0; i < list1.size(); i++) {
            String[] array1 = list1.get(i).split(" ");            
            String name = array1[1];            
            int count = 0;
            for (int j = 0; j < list1.size(); j++) {
                String[] array2 = list1.get(j).split(" ");
                String name1 = array2[1];                
                if (name.equals(name1)) 
                    count ++;                
            }
            if (!names.containsValue(name)) 
                names.put(count, name);                            
        }
        System.out.println("В заданном списке сотрудников есть повторяющиеся имена:");
        for (var el : names.entrySet()) 
            System.out.print(el.getKey() + " " + "повтора " + el.getValue() + "\n");        
    }
}
