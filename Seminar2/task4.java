package Seminar2;

import java.io.File;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.util.ArrayList;

/*
 * Напишите метод, который вернет содержимое текущей папки в виде массива строк. 
 * Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
 * Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения,
 * оно должно записаться в лог-файл.
 */
public class task4 {
    public static void main(String[] args) {
        String path = "C:\\AAA\\Git репозитории\\Java_project\\Seminar2\\1";
        PrintArray(getFolderContent(path));
        WriteFolderContent(getFolderContent(path));
    }
    public static ArrayList<String> getFolderContent(String path){
        ArrayList<String> array = new ArrayList<>();
        try{
            File fl = new File(path);           
            for(File f: fl.listFiles()){
                array.add(f.getName());
            }
            return array;
        }
        catch(Exception e){
            Logger("Ошибка открытия файла");
            System.out.println("Ошибка открытия файла");
            // array.add("Error");
            return array;
        }
    }
    public static void PrintArray (ArrayList<String> array){
        for (String i : array) {
            System.out.println(i);
        }
    }
    public static void WriteFolderContent(ArrayList<String> array){
        try {
            FileWriter  fw = new FileWriter("content.txt", false);
            for (String f : array) {
                fw.write(f + "\n");                
            }
            fw.flush();
            fw.close();
        }
        catch (Exception e){
            Logger("Ошибка записи файла");
            System.out.println("Ошибка записи файла");
        }
    }
    public static void Logger(String text) {
        try {
            FileWriter log = new FileWriter("log.txt", true);
            log.write(LocalDateTime.now() + " " + text + "\n");
            log.flush();
            log.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
