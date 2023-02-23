/**
 * 2. Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
 *         Получить наименования товаров заданного сорта с наименьшей ценой.
 */
package org.example.seminar3.hm3.Zadanie2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("octopus", "Greece", 3.5, 700, "Высший");
        Product product2 = new Product("squid", "Italia", 4.0, 180, "1");
        Product product3 = new Product("fish", "Japan", 10.0, 300, "2");
        Product product4 = new Product("bed", "Ispania", 6.3, 500, "1");
        Product product5 = new Product("tomato", "Germany", 7.0, 500, "3");
        Product product6 = new Product("potato", "Russian", 20.0, 180, "1");

        List<Product> products = new ArrayList<>();
        products.add(product);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);

        System.out.println(products);
        String searchSort = "1";
        List<Product> productsList = new ArrayList<>();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getSort().equals(searchSort)) {
                productsList.add(products.get(i));
            }
        }
        String minProducts = "";
        int minPrice = productsList.get(0).getPrice();
        for (Product productNew : productsList) {
            if(productNew.getPrice() <= minPrice){
                minPrice = productNew.getPrice();
                minProducts = productNew.getName();
                System.out.println("Наименьшая цена: " + minPrice + " продукт - " + minProducts);
            }
        }
    }
}