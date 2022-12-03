package Seminar4;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/*
 * Написать программу, определяющую правильность расстановки скобок в выражении.
a+(d*3) - истина
\[a+(1*3) - ложь
\[6+(3*3)] - истина
{a}\[+\]{(d*3)} - истина
<{a}+{(d*3)}> - истина
{a+]}{(d*3)} - ложь
 */
public class Home3 {
    public static void main(String[] args) {
        System.out.println(isValidBrackets("<{a}+{(d*3)}>"));
    }
    private static boolean isValidBrackets(String input) {
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put(')', '(');
        brackets.put('}', '{');
        brackets.put(']', '[');
        brackets.put('>', '<');
        
        Deque<Character> stack = new LinkedList<>();
            for (char c : input.toCharArray()) {
                if (brackets.containsValue(c)) {                    
                    stack.push(c);
                } else if (brackets.containsKey(c)) {                    
                    if (stack.isEmpty() || stack.pop() != brackets.get(c)) {
                        return false;
                    }
                }
            }            
            return stack.isEmpty();
    }
}
