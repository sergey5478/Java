package lecture1;

import java.io.*;

public class File {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("file.txt", false)){
            fw.write("line 1");
            fw.append("\n");
            fw.append("3");
            fw.append("\n");
            fw.write("line 3");
            fw.flush();
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }     
    }
}
