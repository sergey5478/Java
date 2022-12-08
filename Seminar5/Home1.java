package Seminar5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * реализуйте структуру телефонной книги с помощью HashMap, учитывая что 1
 * человек может иметь несколько телефонов.
 */
public class Home1 {
    public static void main(String[] args) {
        Map<Integer, String> list1 = new HashMap<>();
        String encoding = System.getProperty("console.encoding", "cp866");
        Scanner iScanner = new Scanner(System.in, encoding);
        for (int i = 0; i < 2; i++) {
            System.out.print("Введите номер телефона и фамилию: ");
            String s = iScanner.nextLine();
            String [] sMas = s.split(" ");
            list1.put(Integer.parseInt(sMas[0]),sMas[1]);
        }
        for (var el: list1.entrySet()) {
            System.out.print(el.getKey() + " " + el.getValue() + "\n");
        }
        iScanner.close();
    }
}
