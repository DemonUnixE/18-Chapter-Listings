package org.example;

import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        al.add(1);
        al.add(9);
        al.add(5);
        al.add(4);
        System.out.println("Содержимое спиочного массива al: " + al);

        Integer[] ia = new Integer[al.size()];
        ia = al.toArray(ia);

        int sum = 0;

        for (int i : ia) sum += i;
        System.out.println("Сумма " + sum);
    }
}