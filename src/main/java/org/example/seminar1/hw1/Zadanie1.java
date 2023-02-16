package org.example.seminar1.hw1;
import java.util.*;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String[] newStr = str.split(" ");

        int count = 0;
        for (int i = 0; i < newStr.length; i++) {
            if (!newStr[i].equals("")) {
                count++;
            }
        }

        String[] changeSrt = new String[count];
        int index = 0;
        for (int i = newStr.length - 1; i >= 0; i--) {
            if (!newStr[i].equals("")) {
                changeSrt[index] = newStr[i];
                changeSrt[index] = changeSrt[index].replaceAll("\\s","");
                index++;
            }
        }

        System.out.print('"');
        for (int j = 0; j < changeSrt.length; j++) {
            if (j < changeSrt.length - 1) {
                System.out.print(changeSrt[j] + " ");
            } else {
                System.out.print(changeSrt[j]);
            }
        }
        System.out.print('"');

    }
}

