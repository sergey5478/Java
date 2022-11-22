/*Написать программу, которая запросит пользователя ввести <Имя> в консоли. 
Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”
 */
package Seminar1;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Name: ");
        String name = iScanner.nextLine();
        name = "Привет, " + name;
        System.out.println(name);
        iScanner.close();
    }
}
