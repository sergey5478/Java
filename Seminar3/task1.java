/*
 * Заполнить список десятью случайными числами. Отсортировать список методом sort() и вывести его на экран.
 */
package Seminar3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class task1 {

    public static void main(String[] args) {
        Random rnd = new Random();
        //ArrayList <Integer> intArray = new ArrayList<>()
        ArrayList <Integer> intArray = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            intArray.add(rnd.nextInt(100));
        }
        printArray(intArray);
        Collections.sort(intArray);
        printArray(intArray);
    }
    public static void printArray(ArrayList<Integer> array){
        StringBuilder printSB = new StringBuilder();
        for(Integer number: array){
            printSB.append(number + ", ");
        }
        String output = printSB.substring(0,printSB.length()-2);
        System.out.println(output);
    }
}