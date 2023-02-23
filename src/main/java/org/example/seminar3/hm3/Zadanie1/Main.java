/**
 * 1. Дан массив записей: наименование товара, цена, сорт.
 *         Найти наибольшую цену товаров 1го или 2го сорта среди товаров,
 *         название которых содержит «высший».
 */

package org.example.seminar3.hm3.Zadanie1;

import org.example.seminar3.cw3.Zadanie1.Items;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        PriceProduct product = new PriceProduct("Яблоко", "Hig", 95);
        PriceProduct product2 = new PriceProduct("Груша", "1", 120);
        PriceProduct product3 = new PriceProduct("Апельсин", "Lo", 100);
        PriceProduct product4 = new PriceProduct("Высший сыр", "2", 83);
        PriceProduct product5 = new PriceProduct("Высший свити", "1", 180);
        PriceProduct product6 = new PriceProduct("банан", "2", 110);
        PriceProduct product7 = new PriceProduct("Высший арбуз", "1", 200);
        PriceProduct product8 = new PriceProduct("мандарин", "Lo", 70);

        List<PriceProduct> priceProducts = new ArrayList<>();
        priceProducts.add(product);
        priceProducts.add(product2);
        priceProducts.add(product3);
        priceProducts.add(product4);
        priceProducts.add(product5);
        priceProducts.add(product6);
        priceProducts.add(product7);
        priceProducts.add(product8);

        System.out.println(priceProducts);
        String searchName = "Высший";
        Integer maxPrice = 0;
        String maxProduct = "";
        for (int i = 0; i < priceProducts.size(); i++) {
            if ((priceProducts.get(i).getName().contains(searchName)) && (maxPrice < priceProducts.get(i).getPrice())
            && (priceProducts.get(i).getSort().equals("1")) || priceProducts.get(i).getSort().equals("2")) {
                maxPrice = priceProducts.get(i).getPrice();
                maxProduct = priceProducts.get(i).getName();
            }
        }
        System.out.println(" Наибольшая цена = " + maxPrice + "; продукт - " + maxProduct);
    }
}
