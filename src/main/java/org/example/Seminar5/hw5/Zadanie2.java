/**
 * 2) Подсчитать количество искомого слова, через map
 * (наполнением значение, где искомое слово будет являться ключом)
 */
package org.example.Seminar5.hw5;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class Zadanie2 {
    public static void main(String[] args) {
        String text = "You will be beautiful, says the first fairy. You will be clever, says the second fairy. " +
                "You will be kind, says the third fairy. You will sing," +
                " says the fourth fairy. You will dance, says the fifth fairy." +
                " You will always be happy, says the sixth fairy".toLowerCase();
        StringBuilder str = new StringBuilder(text);
        for (int i = 0; i < str.length(); i++) {
            String el = String.valueOf(str.charAt(i));
            if (el.equals(".") || el.equals(",")) {
                str.deleteCharAt(i);
            }
        }

        String[] newStr = str.toString().split(" ");
        Map<String, Integer> mapCh = new HashMap<>();
        boolean check = true;

        while (check) {
            System.out.print("Введите искомое слово: ");
            Scanner sc = new Scanner(System.in);
            String slovo = sc.nextLine();
            int count = 0;
            for (int i = 0; i < newStr.length; i++) {
                if (newStr[i].equals(slovo)) {
                    if (mapCh.containsKey(slovo)) {
                        mapCh.put(newStr[i], mapCh.get(newStr[i]) + 1);
                    } else mapCh.put(newStr[i], 1);
                } else count++;
            }
            if (count == newStr.length) {
                System.out.println("Слова" + "'" + slovo + "'" + "нет в рассматривемом тексте");
            }
            check = checkEnd();
        }
        for (var entry : mapCh.entrySet()) {
            if (!entry.getKey().equals("")) {
                System.out.println("Слово " + "'" + entry.getKey() + "'" + " встретилось: " + entry.getValue() + " раз(а)");
            }
        }
    }
    public static boolean checkEnd() {
        System.out.print("Вы хотите попробовать найти ещё одно слово? Ответьте Да или Нет: ");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine().toLowerCase();
        if (text.equals("да")) {
            return true;
        } else if (text.equals("нет")) {
            return false;
        } else {
            System.out.println("Введено неверное значение");
            return checkEnd();
        }
    }
}
