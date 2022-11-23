package Seminar1;
import java.util.Scanner;
public class Home3 {
    static Scanner iScanner = new Scanner(System.in);
    public static void main(String[] args) {        
    
        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        int result = calc(num1,num2,operation);
        System.out.printf("Результат операции: %s", result);
    
}
    public static int getInt(){
        System.out.printf("Введите число:");
        int num;
        if(iScanner.hasNextInt()){
            num = iScanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            iScanner.next();
            num = getInt();
        }
        return num;
    }
 
    public static char getOperation(){
        System.out.print("Введите операцию(+,-,*,/):");
        char operation;
        if(iScanner.hasNext()){
            operation = iScanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
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
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(num1, num2, getOperation());
        }
        return result;
    }
}
    

