package org.example;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

class AlgorithmsDemo {
    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(-8);
        ll.add(20);
        ll.add(-20);
        ll.add(8);
        Comparator<Integer> r = Collections.reverseOrder();

        ll.sort(r);
        System.out.print("Cпиcoк отсортирован в обра тном порядке : ");
        for (int i : ll)
            System.out.print(i + " ");
        System.out.println();
        Collections.shuffle(ll);
        System.out.print(" Cпиcoк перетасован : ");
        for (int i : ll)
            System.out.print(i + " ");
        System.out.println();
        Collections.shuffle(ll);
        System.out.print(" Cпиcoк перетасован : ");
        for (int i : ll)
            System.out.print(i + " ");
        System.out.println();
        System.out.println(" Mинимyм : " + Collections.min(ll));
        System.out.println("Maкcимyм : " + Collections.max(ll));

    }
}
