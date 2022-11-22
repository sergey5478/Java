
/* 
 Настроить проект, вывести в консоль “Hello world!”.
 Вывести в консоль системные дату и время.
*/
package Seminar1;

import java.time.LocalDateTime;

/**
 * task1
 */
public class task1 {

    public static void main(String[] args) {
        System.out.println("Hello word");
        LocalDateTime nowTime = LocalDateTime.now();
        System.out.println(nowTime);
    }
}
