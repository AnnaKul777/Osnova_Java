/**
 * 3. Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
 *         Найти названия книг, в которых простое количество страниц,
 *         фамилия автора содержит «А» и год издания после 2010 г, включительно.
 */

package org.example.seminar3.hm3.Zadanie3;

import org.example.seminar3.hm3.Zadanie2.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Books books = new Books("Темная вода", "Жиголов", 3500, 1991, 2000);
        Books books2 = new Books("Алый рассвет", "Алферов", 2700, 2010, 3109);
        Books books3 = new Books("Яблочное лето", "Майлов", 7800, 1999, 5000);
        Books books4 = new Books("Следовать за тенью", "Aпричнин", 4500, 2017, 2332);
        Books books5 = new Books("Ночное шоу", "Стрейкин", 1500, 2018, 1700);
        Books books6 = new Books("Элемент воды", "Арсенева", 5000, 2011, 1787);
        Books books7 = new Books("Экслюзивное интервью", "Урсолова", 2700, 2020, 3700);
        Books books8 = new Books("Свободное плечо", "Антонов", 3000, 2011, 443);

        List<Books> booksList = new ArrayList<>();
        booksList.add(books);
        booksList.add(books2);
        booksList.add(books3);
        booksList.add(books4);
        booksList.add(books5);
        booksList.add(books6);
        booksList.add(books7);
        booksList.add(books8);

//        System.out.println(booksList);
        String searhfioBook = "А";
        List<Books> fioList = new ArrayList<>();
        for (int i = 0; i < booksList.size(); i++) {
            if (booksList.get(i).getFio().contains(searhfioBook) && booksList.get(i).getYears() > 2009){
                fioList.add(booksList.get(i));
            }
        }
        System.out.println("Названия книг, в которых простое количество страниц," +
                "фамилия автора содержит «А» и год издания после 2010 г включительно: ");

        for (int i = 0; i < fioList.size(); i++) {
            int counter = 0;
            for (int j = 1; j <= fioList.get(i).getPage(); j++) {
                if (fioList.get(i).getPage() % j == 0) {
                    counter++;
                }
            }
            if (counter == 2) {
                System.out.println(fioList.get(i).getName());
            }
        }
    }
}
