/*Написать программу, которая запросит пользователя ввести <Имя> в консоли. 
Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”
 */
package Seminar1;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        System.out.print("Input Name:");
        Scanner iScanner = new Scanner(System.in);
        String name = iScanner.nextLine();
        name = "Привет, " + name;
        System.out.println(name);
    }
}
