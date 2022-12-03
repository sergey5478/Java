package Seminar4;

import java.util.LinkedList;
import java.util.Scanner;

/*
 * Реализовать консольное приложение, которое:
1. Принимает от пользователя строку вида
text~num
1. Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
2. Если введено print~num, выводит строку из позиции num в связном списке и 
удаляет её из списка.
 */
public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input string:  ");
        String line1 = sc.nextLine();
        sc.close();
        LinkedList<String> linkl = new LinkedList<>();
        String[] arr1 = line1.split("~");

        int ind = Integer.parseInt(arr1[1]);
        for (int i = 0; i < ind + 1; i++) {
            linkl.add("line " + i);
        }
        if (arr1[0].equals("print")) {
            System.out.println(linkl.remove(ind));
        }
        else{
            linkl.add(ind, arr1[0]);
        }
        System.out.println(linkl);
    }
}
