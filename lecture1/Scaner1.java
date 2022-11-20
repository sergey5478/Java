package lecture1;
import java.util.Scanner;
/**
 * ВВод со строки и ответ
 */
public class Scaner1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Name: ");
        String name = iScanner.nextLine();
        System.out.printf("Hello, %s!", name);
        iScanner.close();
    }
}
