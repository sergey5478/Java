package Seminar3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
 * Пусть дан произвольный список целых чисел, удалить из него четные числа
 */
public class Home1 {
    public static void main(String[] args) {
        int list [] = {7, 2, 8, 3, 10, 9};
        System.out.println("Дан список: " + Arrays.toString(list));
        List<Integer> filteredList  = new ArrayList<Integer>();
        for (Integer e : list) {
            if (e % 2 != 0) {
                filteredList.add(e);
            }
        }
        System.out.println("Получаем список без четных чисел: " + filteredList);
    }
}
