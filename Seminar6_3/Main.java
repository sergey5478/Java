package Seminar6_3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*1. Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>.
 * Поместите в него некоторое количество объектов. 
 * 2. Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество. 
 * Убедитесь, что все они сохранились во множество. 
 * 3. Создайте метод public boolean equals(Object o) Пропишите в нём логику сравнения котов
 *  по параметрам, хранимым в полях. То есть, метод должен возвращать true, только 
 * если значения во всех полях сравниваемых объектов равны. 
 * 4. Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились. */
public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик");
        cat1.invite();
        cat1.setAge(10);
        cat1.setPassport(123456);
        cat1.setDoctor(new Doctor("Вася"));
        Cat cat2 = new Cat("Васька");
        cat2.invite();
        cat2.setAge(10);
        Cat cat3 = new Cat("Петр");
        cat3.invite();
        cat3.setAge(10);
        Set<Cat> cats = new HashSet<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        
        List<Cat> res = new ArrayList<>();
        for (Cat cat : cats) {
            if (cat.getAge() >= 10) {
                res.add(cat);                
            }            
        }
        System.out.println(res);
    }
}
