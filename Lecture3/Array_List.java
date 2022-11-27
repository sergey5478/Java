package Lecture3;
/*
 * ArrayList list работает со всеми типами данных
 * ArrayList<Integer>list принимает только целые! с другими ошибка
 */
import java.util.ArrayList;
public class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
       //ArrayList list = new ArrayList(); общий вариант для всех типов
       list.add(2809);
        //list.add("2809");

       for (Object o : list) {
           System.out.println(o);
           //выведет ошибку
       }
    }
}
