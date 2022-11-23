/*Вывести все простые числа от 1 до 1000 */
package Seminar1;

public class Home2 {
    public static void main(String[] args) {          
        int [] input = new int [1000];     
        boolean b = true;
        String array = "" ;
        for (int P = 2; P <= input.length; P++) {
            for (int i = 2; i < P; i++) {
                if (P % i == 0) {b = false;break;} 
            }            
            if (b) array += P + " "; else b = true;            
        }
        System.out.println(array);
    }
}
