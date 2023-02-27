/**
 * 1) Подсчитать количество вхождения каждого слова
 *         Пример:
 *         Россия идет вперед всей планеты. Планета — это не Россия.
 *         toLoverCase().
 */

package org.example.Seminar5.hw5;
import java.util.HashMap;
import java.util.Map;

public class Zadanie1 {
    public static void main(String[] args) {
        Map<String, Integer> mapCh = new HashMap<>();
        String text = ("Россия идет вперед всей планеты. Планета — это не Россия.").toLowerCase();
        StringBuilder s = new StringBuilder(text);
        for (int i = 0; i < s.length(); i++) {
            String str = String.valueOf(s.charAt(i));
                if (str.equals(".") || str.equals("—")){
                        s.deleteCharAt(i);
                }
        }
            String[]newStr = s.toString().split(" ");
            for (int i = 0; i < newStr.length; i++) {
                if (mapCh.containsKey(newStr[i])) {
                    mapCh.put(newStr[i], mapCh.get(newStr[i]) + 1);
                } else {
                    mapCh.put(newStr[i], 1);
                }
            }
            for (var entry : mapCh.entrySet()) {
                if (!entry.getKey().equals("")){
                    System.out.println("Слово " + "'" + entry.getKey()
                            + "'" + " встретилось: " + entry.getValue() + " раз(а)");
                }
            }
    }
}


