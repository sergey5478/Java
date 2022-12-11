package Seminar6_2;

/*1. Реализуйте 1 из вариантов класса Cat из предыдущего задания, можно использовать 
 * не все придуманные поля и методы. Создайте несколько экземпляров этого класса, 
 * выведите их в консоль.
 * 2. Добейтесь того, чтобы при выводе в консоль объекта типа Cat, выводилась его кличка, 
 * цвет и возраст (или другие параметры на ваше усмотрение). */
public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик");
        cat1.invite();
        cat1.setAge(10);
        cat1.setPassport(123456);
        cat1.setDoctor(new Doctor("Вася"));

        System.out.println(cat1.getName());
        System.out.println(cat1);

    }
}
