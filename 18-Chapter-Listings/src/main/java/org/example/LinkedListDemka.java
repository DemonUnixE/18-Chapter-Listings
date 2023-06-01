package org.example;

import java.util.LinkedList;

public class LinkedListDemka {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();

        ll.add("D");
//        ll.add("A");
        ll.add("B");
        ll.add("F");
        ll.add("C");
        ll.addLast("Z");
        ll.addFirst("A");
        ll.add(1, "A2");
        System.out.println("Исходное содержимое связного списка ll : " + ll);


        ll.remove("F");
        ll.remove(2);
        System.out.println("Содержимое связного списка 11 " + ll + "после удаления элементов : " + ll);
        ll.removeFirst();
        ll.removeLast();
        System.out.println(
                "Содержимое связного списка 11 после удаления " +
                        "первого и последнего элементов : " + ll);


        String val = ll.get(2);
        ll.set(2, val + " Изменено");
        System.out.println (
        "Содержимое связного списка 11 после изменения : "+ ll) ;

    }
}