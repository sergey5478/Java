/*В консоли запросить имя пользователя. В зависимости от текущего времени, 
вывести приветствие вида
"Доброе утро, <Имя>!", если время от 05:00 до 11:59
"Добрый день, <Имя>!", если время от 12:00 до 17:59;
"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
"Доброй ночи, <Имя>!", если время от 23:00 до 4:59
 */
//LocalTime.now()сейчас       LocalTime.of(4,0,0) - ставим любое время
package Seminar1;
import java.util.Scanner;
import java.time.LocalTime;
public class task3 {
    public static void main(String[] args) {
        System.out.print("Input Name:");
        Scanner iScanner = new Scanner(System.in);
        String name = iScanner.nextLine();
        int nowTime = LocalTime.of(4,0,0).getHour();
                
        System.out.println(nowTime);
        if(nowTime >= 5 && nowTime < 12){System.out.printf("Доброе утро, %s", name);}
        if(nowTime >= 12 && nowTime < 18){System.out.printf("Доброе день, %s", name);}
        if(nowTime >= 18 && nowTime < 23){System.out.printf("Доброе вечер, %s", name);}
        if(nowTime >= 23 || nowTime <5){
            System.out.printf("Доброе ночь, %s", name);iScanner.close();}
    }
}
