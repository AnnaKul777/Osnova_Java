package org.example.seminar3.hm3.Zadanie2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    String name;
    String country;
    Double weight;
    Integer price;
    String sort;

}
