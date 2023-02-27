package org.example.samoobuch;
import java.util.Scanner;
import static java.lang.String.valueOf;

//public class MyClass {
//    public static void main(String[] args) throws Exception {
//        String name = "Anna";
//        int age = 25;
//        double score = 15.9;
//        char group = 'A';
//        boolean atHome = true;
//        int a = 42, b = 11;
//        int x = 42;
//        String y = "Значение переменной x равно ";
//        int z = 58;
//        System.out.println(x);              // 42
//        System.out.println(x + z);          // 100
//        System.out.println("x = " + 42);    // x = 42
//        System.out.println(y + x);          // Значение переменной x равно 42
//        System.out.println(y + x + z);      // Значение переменной x равно 4258
//        System.out.println(y + (x + z));    // Значение переменной x равно 100
//        System.out.println(a + "" + b);
//        }
//    }

// однострочный комментарий
///* это многострочный комментарий */
///* Это многострочный комментарий.
//// Это однострочный комментарий внутри многострочного.
//Не знаю, зачем это нужно, но вдруг пригодится? */
///**
// * Это документационный комментарий
// */

//public class MyClass{
//    public static void main(String[] args){
//        int a = 100, b = 200, c = 300;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.print(a + " " + b + " " + c);
//
//
//    }
//}
//public class MyClass{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
//        System.out.println("Привет," + name);
//
//    }
//}
//public class MyClass{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String years = sc.next();
//        String mes = sc.next();
//        String day = sc.next();
//        System.out.println(day + ":" + mes + ":" + years);
//    }
//}
//public class MyClass{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt(); x = x%86400;
//        int hH = x/36000; x -= hH*36000;
//        int h = x/3600; x -= h*3600;
//        int m = x/600; x -= m*600;
//        int mM = x/60; x -= mM*60;
//        int s = x/10;
//        int sS = x%10;
//        System.out.println("" + hH + h + ":" + m + mM + ":" + s + sS);
//    }
//}
public class MyClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String text = str1 + " " + str2;
        System.out.println(text);
        System.out.println(text.length());

    }
}
