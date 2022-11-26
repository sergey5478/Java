package Seminar2;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.util.Scanner;
/**
 * К калькулятору из предыдущего дз добавить логирование.
 */
public class Home2 {
    static Scanner iScanner = new Scanner(System.in);
    public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        int result = calc(num1,num2,operation);
        System.out.printf(ANSI_PURPLE + "Результат операции: %s", result + ANSI_RESET);
    
}
    public static int getInt(){
        System.out.printf(ANSI_GREEN + "Введите число:" + ANSI_RESET);
        int num;
        if(iScanner.hasNextInt()){
            num = iScanner.nextInt();            
            Logger("Введено число  " + num);
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            Logger("Ошибка при вводе числа");
            iScanner.next();
            num = getInt();
        }
        return num;
    }
 
    public static char getOperation(){
        System.out.print(ANSI_BLUE + "Введите операцию(+,-,*,/):" + ANSI_RESET);
        char operation;
        if(iScanner.hasNext()){
            operation = iScanner.next().charAt(0);
            Logger("Выбрана операция  " + operation);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            Logger("Ошибка при выборе опреции");
            iScanner.next();
            operation = getOperation();
        }
        return operation;
    }
 
    public static int calc(int num1, int num2, char operation){
        int result;
        switch (operation){
            case '+':
                result = num1+num2;
                Logger("Получен результат " + result);
                break;
            case '-':
                result = num1-num2;
                Logger("Получен результат " + result);
                break;
            case '*':
                result = num1*num2;
                Logger("Получен результат " + result);
                break;
            case '/':
                result = num1/num2;
                Logger("Получен результат " + result);
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(num1, num2, getOperation());
                Logger("Операция не распознана. Повторите ввод.");
        }
        return result;
    }
    public static void Logger(String text) {
        try {
            FileWriter log = new FileWriter("logCalk.txt", true);
            log.write(LocalDateTime.now() + " " + text + "\n");
            log.flush();
            log.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
}