package Seminar6;

import java.util.*;
/**
 * 1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
Распечатайте содержимое данного множества.
2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
Распечатайте содержимое данного множества.
3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
Распечатайте содержимое данного множества.

 */
public class task1 {

    public static void main(String[] args) {
        Integer [] arr  = new Integer [] {1, 2, 3, 2, 5, 4, 6, 3};
        Set<Integer> set1 = new HashSet<>(Arrays.asList(arr));
        System.out.println(set1);//[1, 2, 3, 4, 5, 6]
        Integer [] arr2  = new Integer [] {1, 2, 3, 2, 5, 4, 6, 3};
        Set<Integer> set3 = new LinkedHashSet<>(Arrays.asList(arr2));
        System.out.println(set3);//[1, 2, 3, 5, 4, 6]
        Integer [] arr5  = new Integer [] {1, 2, 3, 2, 5, 4, 6, 3};
        Set<Integer> set5 = new TreeSet<>(Arrays.asList(arr5));
        System.out.println(set5);//[1, 2, 3, 4, 5, 6]
    }
}