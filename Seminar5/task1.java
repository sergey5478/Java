package Seminar5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
123456 Иванов
321456 Васильев
234561 Петрова
234432 Иванов
654321 Петрова
345678 Иванов
Вывести данные по сотрудникам с фамилией Иванов.
 */
public class task1 {

    public static void main(String[] args) {
        Map<Integer, String> list1 = new HashMap<>();
        String encoding = System.getProperty("console.encoding", "cp866");
        Scanner iScanner = new Scanner(System.in, encoding);
        for (int i = 0; i < 3; i++) {
            System.out.print("Введите паспорт и фамилию: ");
            String s = iScanner.nextLine();
            String [] sMas = s.split(" ");
            list1.put(Integer.parseInt(sMas[0]),sMas[1]);
        }
        for (var el: list1.entrySet()) {
            System.out.print(el.getKey() + " " + el.getValue() + "\n");
        }
        System.out.println();
        for(var el: list1.entrySet()){
            if (el.getValue().equals("Иванов")) {
                System.out.print(el.getKey() + " " + el.getValue() + "\n");
            }
        }
        iScanner.close();
    }
}