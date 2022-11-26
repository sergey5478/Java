package Seminar2;

import java.io.FileWriter;
import java.io.IOException;
public class task3 {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("file1.txt", false)){
            String txt = "TEST ";
            StringBuilder str = new StringBuilder();
            for (int index = 0; index < 100; index++) {
                str.append(txt);
            }
            fw.write(String.valueOf(str));
            fw.flush();
        }
        catch(IOException ex){
            System.out.println(ex);
        }
    }
}
