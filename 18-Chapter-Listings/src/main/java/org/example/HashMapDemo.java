package org.example;

import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<String, Double> hm = new HashMap<String, Double>();
        hm.put("Джoн Доу", 3434.34);
        hm.put("Toм Смит ", 44.45);
        hm.put("Джейн Бейкер ", 1378.00);
        hm.put("Toд Холл", 99.22);
        hm.put("Paльф Смит", -19.07);

        Set<Map.Entry<String, Double>> set = hm.entrySet();
        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + " : ");
            System.out.println(me.getValue());
        }
        System.out.println();
        double balance = hm.get("Джoн Доу");
        hm.put("Джoн Доу", balance + 1000);
        System.out.println("Hoвый остаток на счете Джона Доу : " + hm.get("Джoн Доу"));
    }
}