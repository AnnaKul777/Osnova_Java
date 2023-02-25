/**
 * 1)Вывести список на экран в перевернутом виде (без массивов и ArrayList)
 * Пример:
 * 1 -> 2->3->4
 * Вывод:
 * 4->3->2->1
 */
package example.Seminar4.hw4.Zadanie1;

import java.util.LinkedList;
import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        LinkedList <Integer> mylist = new LinkedList<>();
        System.out.println("Введите длину списка: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println("Введите любые числа по порядку: ");
        for (int i = 0; i < size; i++) {
            mylist.add(sc.nextInt());
            }

        String result = mylist.toString().replace("[", "").replace("]", "").
                replace(",", " ->");
        System.out.println("Созданный список: " + result);
        LinkedList<Integer> newList = new LinkedList<>();
        int length = mylist.size();
        for (int j = 0; j < length; j++) {
            newList.push(mylist.get(j));
        }
        String result1 =newList.toString().replace("[", "").replace("]", "").
                replace(",", " ->");
        System.out.println("Перевернутый список: " + result1);
    }
}

