package org.example;

import java.awt.desktop.SystemSleepEvent;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String args[]) {
        ArrayList<String> al = new ArrayList<>();

        System.out.println("Начальный размер массива аl: " + al.size());
        al.add("D");
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("F");
        al.add(1, "A6");
        System.out.print("Размер массива al после ввода элемета: ");
        System.out.println(al.size());
        System.out.println("Coдepжимoe списочного массива al : " + al);


        al.remove(" F");
        al.remove(2);

        System.out.println(" Размер сnисочного массива al после удаления элементов : " + al.size());
        System.out.println("Coдepжимoe списочного массива a l : " + al);
    }
}
