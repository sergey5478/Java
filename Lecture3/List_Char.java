package Lecture3;
/*
 * Если добавляем List.of, то потом удалить list1.remove(1) неполучится
 */
import java.util.List;


public class List_Char {
    public static void main(String[] args) {
        Character value = null;
        List<Character> list1 = List.of('S', 'e', 'r', 'g', 'e', 'y');

        // List<Character> list1 = new ArrayList<Character>();
        // list1.add('S');   //если так сделать, то удаляется!)))
        // list1.add('b');
        // list1.add('d');

        System.out.println(list1);
        // list1.remove(1); // java.lang.UnsupportedOperationException
        List<Character> list2 = List.copyOf(list1);//копирует
        System.out.println(list2);
    }
}
