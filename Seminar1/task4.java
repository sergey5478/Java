package Seminar1;

import java.util.Random;

public class task4 {
    public static void main(String[] args) {
        int [] array = new int[15];
        for(int i = 0; i < array.length; i++){
            array[i] = new Random().nextInt(0,2);
            System.out.print(array[i] + " ");
        }
        int count = 0;
        int Maxcount = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 1) count++;
            else {
                if(Maxcount < count);{Maxcount = count; }count = 0;
            }
        }
        System.out.printf("\n" + Maxcount);
    }
}
