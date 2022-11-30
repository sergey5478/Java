package Seminar3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/*
 * Заполнить список названиями планет Солнечной системы в произвольном 
 * порядке с повторениями. Вывести название каждой планеты и количество его 
 * повторений в списке.
 * Потом наоборот выводит по 1
 */
public class task2 {
    public static void main(String[] args) {
        String [] planets = {"Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун", "Плутон"};
        Random rnd = new Random();
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < 15 ; i++) {
            result.add(planets[rnd.nextInt(0,planets.length-1)]);
            
        }
        System.out.println(result);
        // Set<String> mySet = new HashSet<String>(result); другой способ
        // System.out.println(mySet);
                
        Set<String> mySet = new HashSet<String>(result);
        for(String s: mySet){
            System.out.println(s + " " + Collections.frequency(result,s));
        }
        Collections.sort(result);
        for (int i = 0; i < result.size()-1; i++) {
            if(result.get(i) == result.get(i+1)){
                result.remove(result.get(i));i--;
            }
        }
        System.out.println(result);
    }
}

