/**
 * 2) Дана последовательность из N целых чисел.
 * Верно ли, что последовательность является возрастающей.
 */

package org.example.Seminar2.hw2;

import java.util.Scanner;

public class Zadanie2 {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = checkingSize();
        System.out.println("Введите числа по порядку: ");
        int num1 = sc.nextInt();
        boolean check = true;
        int count = 0;
        for (int i = 0; check == true && i < size - 1; i++) {
            int num2 = sc.nextInt();
            if (num1 == num2) {
                count += 1;
            }
            check = checkingNum(num1, num2, count, size);
            if (check == false) {
                System.out.println("Последовательность НЕ возрастающая!");
            }
        }
        if (check == true) {
            System.out.println("Последовательность является возрастающей!");
        }
    }

    public static int checkingSize() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер последовательности чисел: ");
        int sizeCheck = sc.nextInt();
        if (sizeCheck <= 0) {
            System.out.println("Введите число больше 0!");
            return checkingSize();
        } else {
            return sizeCheck;
        }
    }

    public static boolean checkingNum(int num1, int num2, int same, int size) {
        if (same == size - 1) {
            return false;
        }
        if (num1 > num2) {
            return false;
        } else {
            return true;
        }
    }
}

