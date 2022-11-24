package lecture1;

import java.io.*;
public class File_read {

    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("file.txt");
        int c;        
        while ((c = fr.read()) != -1) {
            char ch = (char) c;
            if(ch == '\n'){
                System.out.print(ch);
            }else {
                System.out.println(ch);
            }            
        } 
        fr.close();       
    }
}