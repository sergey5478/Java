package Finish;

/*
1.Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы.
Реализовать в java.Создать множество ноутбуков.
2.Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации
 и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. 
 Например: “Введите цифру, соответствующую необходимому критерию:
 1 - ОЗУ      2 - Объем ЖД      3 - Операционная система     4 - Цвет
3.Далее нужно запросить минимальные значения для указанных критериев - 
сохранить параметры фильтрации можно также в Map.
4.Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
*/
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Notebook note1 = new Notebook("Первый");
        note1.invite();
        note1.setRam(1);
        note1.setSsd(100);
        note1.setColor("Green");
        note1.setSystem("Windows");

        Notebook note2 = new Notebook("Второй");
        note2.invite();
        note2.setRam(2);
        note2.setSsd(200);
        note2.setColor("Blue");
        note2.setSystem("Windows");

        Notebook note3 = new Notebook("Третий");
        note3.invite();
        note3.setRam(3);
        note3.setSsd(300);
        note3.setColor("Pink");
        note3.setSystem("Windows");

        Set<Notebook> notebooks = new HashSet<>();
        notebooks.add(note1);
        notebooks.add(note2);
        notebooks.add(note3);

        scanNotebook(notebooks);

        minNotebooks(notebooks);

    }

    public static void scanNotebook(Set<Notebook> notebooks) {
        String encoding = System.getProperty("console.encoding", "cp866");
        Scanner iScanner = new Scanner(System.in, encoding);
        System.out.print("Введите цифру, соответствующую необходимому критерию ОЗУ(до 3), Объем SSD(100 до 300):  ");
        Integer s = iScanner.nextInt();
        iScanner.nextLine();
        iScanner.close();
        if (s <= 10) {
            List<Notebook> res = new ArrayList<>();
            for (Notebook not : notebooks) {
                if (not.getRam() >= s) {
                    res.add(not);
                }
            }
            System.out.println("Список ноутбуков с заданной ОЗУ: " + res);
        } else if (s >= 100) {
            List<Notebook> res2 = new ArrayList<>();
            for (Notebook not : notebooks) {
                if (not.getSsd() >= s) {
                    res2.add(not);
                }
            }
            System.out.println("Список ноутбуков с заданным объемом SSD: " + res2);
        }

    }

    public static void minNotebooks(Set<Notebook> notebooks) {
        String encoding = System.getProperty("console.encoding", "cp866");
        Scanner iScanner = new Scanner(System.in, encoding);
        System.out.println("Введите минимальный ОЗУ(от 1 до 3) и SSD(100 до 300): ");
        String s = iScanner.nextLine();
        iScanner.nextLine();
        Map<Integer, String> list1 = new HashMap<>();
        String[] sMas = s.split(" ");
        list1.put(Integer.parseInt(sMas[0]), sMas[1]);

        for (var el : list1.entrySet()) {
            System.out.print("Минимальная ОЗУ: " + el.getKey() + " " + "Минимальный Ssd: " +
                    el.getValue() + "\n");
        }

        Set<Notebook> res3 = new HashSet<>();
        for (Notebook not : notebooks) {
            if (not.getSsd() == Integer.parseInt(sMas[1]) &&
                    not.getRam() == Integer.parseInt(sMas[0])) {
                res3.add(not);
            }
        }
        System.out.println(res3);
        iScanner.close();
    }
}