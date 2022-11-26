package Seminar2;

import java.io.FileWriter;
import java.time.LocalDateTime;
import java.util.Arrays;
/*
 * Реализуйте алгоритм сортировки пузырьком числового массива, 
 * результат после каждой итерации запишите в лог-файл.
 */
public class Home1 {
    public static void main(String[] args) {
        int [] arrayNew = {1,3,5,2,9};
        SortedArray(arrayNew);
    }
    public static void SortedArray(int [] array1) { 
        boolean Sorted1 = false;
        int temp1;
        while (!Sorted1) {
            Sorted1 = true;
            for (int i = 0; i < array1.length-1; i++) {
                if (array1[i] > array1[i+1]) {
                    Sorted1 = false;
                    temp1 = array1[i];
                    array1[i] = array1[i+1];
                    array1[i+1] = temp1;
                    WriteArrayDoIt(array1);
                    Logger("Произведено действие" + i);
                }
            }
        }
        System.out.println(Arrays.toString (array1));
    }
    public static void Logger(String text) {
        try {
            FileWriter log = new FileWriter("log3.txt", true);
            log.write(LocalDateTime.now() + " " + text + "\n");
            log.flush();
            log.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    public static void WriteArrayDoIt(int [] array){
        try {
            FileWriter  fw = new FileWriter("file3.txt", true);
            for (int f : array) {
                fw.write(f + "");                
            }
            fw.write("\n");
            fw.flush();
            fw.close();
        }
        catch (Exception e){
            System.out.println("Ошибка записи файла");
        }
    }
}
