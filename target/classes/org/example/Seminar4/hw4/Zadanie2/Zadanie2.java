/**
 * Учитывая строку s, содержащую только символы '(', ')', '{', и '}',
 * определите, допустима ли входная строка.'['']'
 * Входная строка действительна, если:
 * Открытые скобки должны быть закрыты однотипными скобками.
 * Открытые скобки должны быть закрыты в правильном порядке.
 * Каждой закрывающей скобке соответствует открытая скобка того же типа.
 */
package example.Seminar4.hw4.Zadanie2;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите символы, например: }, {, ], [, (, )");
        String valid = sc.nextLine();
        boolean check = isValid(valid);
        System.out.println(check);
    }
    public static boolean isValid(String s) {
        Stack<Character> myChar = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char h = s.charAt(i);
            if (h == '[' || h == '{' || h == '('){
                myChar.push(h);
            }
            else {
                if(myChar.empty() || Math.abs(myChar.pop() - h) > 2){
                    return false;
                }
            }
        }
        return myChar.empty();
    }
}
