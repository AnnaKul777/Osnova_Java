/**
 * 3) Дан массив целых чисел. Заменить отрицательные элементы на сумму
 * индексов двузначных элементов массива.
 */

package org.example.Seminar2.hw2;

import java.util.Arrays;
import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int size = checkingSize();
        int array[] = new int[size];
        System.out.println("Введите числа по порядку: ");
        for (int i = 0; i < size; i++) {
            int num = sc.nextInt();
            array[i] = num;
            if ((array[i] > 9 && array[i] < 100) || (array[i] < - 9 && array[i] > - 100)) {
                sum += i;
            }
        }
        System.out.println("Массив до замены элементов: " + Arrays.toString(array));

        for (int j = 0; j < size ; j++) {
            if(array[j] < 0) {
              array[j] = sum;
            }
        }
        System.out.println("Массив после замены элементов: " + Arrays.toString(array));
    }

    public static int checkingSize() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int sizeCheck = sc.nextInt();
        if (sizeCheck <= 0) {
            System.out.println("Введите число больше 0!");
            return checkingSize();
        } else {
            return sizeCheck;
        }
    }
}
