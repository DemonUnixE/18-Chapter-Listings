package org.example;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<String> adq = new ArrayDeque<String>();

//        adq.push("D");
        adq.push("A");
        adq.push("C");
        adq.push("B");
        adq.push("F");
        adq.push("D");
        System.out.print("Извлeчeниe из стека : ");
        while (adq.peek() != null)
            System.out.print(adq.pop() + " ");
        System.out.println();

    }
}
