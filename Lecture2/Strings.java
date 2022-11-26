package Lecture2;

/**
 * примеры работы со строкой
 */
public class Strings {

    public static void main(String[] args) {
        String[] name = { "C", "е", "р", "г", "е", "й" };
        String sk = "СЕРГЕЙ КА.";
        System.out.println(sk.toLowerCase()); // сергей ка.
        System.out.println(String.join("", name)); // Cергей
        System.out.println(String.join("", "C", "е", "р", "г", "е", "й"));
        // Cергей
        System.out.println(String.join(",", "C", "е", "р", "г", "е", "й"));
        // C,е,р,г,е,й
    }    
}