/*Дан массив nums = [3,2,2,3] и число val = 3. 
Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива. 
Таким образом, первые несколько (или все) элементов массива должны быть отличны от 
заданного, а остальные - равны ему.
[3,7,2,4,9,1, 0]
 */
package Seminar1;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        int [] array = new int []{3,7,2,4,9,1,0};
        System.out.printf("input number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < array.length - 1; i++) {
            if(array[i] == num){
                int temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
                sc.close();
            }
        }
        for(int i:array){
            System.out.print(i + " ");
        }        
    }
}
