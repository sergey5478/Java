/*Находим произведение(факториал) и сумму чисел от 1 до N */
package Seminar1;
import java.util.Scanner;
public class Home1 {
    public static void main(String[] args) {
        System.out.printf("Введите число от 1 до N: ");
        Scanner iScanner = new Scanner(System.in);        
        int N = iScanner.nextInt();
        iScanner.close();
        int result = 1;
        for (int i = 1; i <= N; i++) {result = result * i;}
        System.out.printf("Произведение чисел = %s\n", result);
        result = 0;
        for (int i = 0; i <= N; i++) {result = result + i;}
        System.out.printf("Сумма чисел = %s\n", result);
    }        
}

