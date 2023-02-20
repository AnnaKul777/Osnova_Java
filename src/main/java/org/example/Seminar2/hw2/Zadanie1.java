/**
 * 1) Дана последовательность N целых чисел. Найти сумму простых чисел.
 */

package org.example.Seminar2.hw2;
import java.util.Scanner;
public class Zadanie1 {

    public static void main(String[] args) {
        int sum = 0;
        int size = checkingSize();
        System.out.println("Введите числа по порядку: ");
        for (int i = 0; i < size; i++) {
            int num = checkingNum();
            int count = 0;
            for (int j = 1; j <= num; j++) {
                if (num % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                sum += num;
            }
        }
        System.out.println("Сумма простых чисел равна: " + sum);
    }
    public static int checkingSize() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер последовательности чисел: ");
        int sizeCheck = sc.nextInt();
        if (sizeCheck <= 0) {
            System.out.println("Введите число больше 0!");
            return checkingSize();
        }
        else {
            return sizeCheck;
        }
    }
    public static int checkingNum () {
        Scanner sc = new Scanner(System.in);
        int numCheck = sc.nextInt();
        if (numCheck <= 0) {
            System.out.println("Введите число больше 0!");
            return checkingNum();
        }
        else {
            return numCheck;
        }
    }
}