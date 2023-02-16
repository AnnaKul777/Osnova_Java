/* 2) Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел,
после которых следует отрицательное число.
Пример: 1 2 1 2 -1 1 3 1 3 -1 0
2 -1 переход - 2 в сумму
3 -1 переход 3 в сумму
суммарно выведет 5 */

package org.example.seminar1.hw1;

import java.util.*;

public class Zadanie2 {
    public static void main(String[] args){
        int [] array = {1, 2, 1, 2, -1, 1, 3, 1, 3, -1, 0};
        System.out.println(Arrays.toString(array));
        int sum = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > 0 && array[i+1] < 0){
                sum += array[i];

            }

        }
        System.out.println("Ответ равен: " + sum);

    }

}
