package Seminar6_1;
import java.util.*;
/*Продумайте структуру класса кот. Какие поля и методы будут актуальны для приложения
 * кпторое является:
 * а)информационной системой ветериннарной клиники
 * б)архивом выставки котов
 * в)информационной системой театра кошек Ю. Д. Куклачёва 
 * Можно записать в текстовом виде, не обязательно реализовывать в java */ 
public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик");        
        cat1.invite();
        cat1.setAge(10);        
        System.out.println(cat1.getName());
        System.out.println(cat1.getAge());
        
    }
}
