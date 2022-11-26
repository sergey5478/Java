package Seminar2;

import java.util.Scanner;

/**
 * Дано четное число N (>0) и символы c1 и c2. Написать метод, 
 * который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, 
 * начиная с c1.
 */
public class task1 {

    public static void main(String[] args) {
        Character c1 = 'a';
        Character c2 = 'b';
        Scanner sc = new Scanner(System.in);
        System.out.print("add number: ");
        int n = sc.nextInt();
        sc.close();
        StringBuilder bilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                bilder.append(c1);
            }
            else{
                bilder.append(c2);
            }
        }
        System.out.println(bilder);        
    }
}