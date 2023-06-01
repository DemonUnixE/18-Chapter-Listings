package org.example;

import java.util.ArrayList;
import java.util.Spliterator;

public class DemoSprinter {
    public static void main(String[] args) {
        ArrayList<Double> vals = new ArrayList<>();

        vals.add(1.0);
        vals.add(2.0);
        vals.add(3.0);
        vals.add(4.0);
        vals.add(5.0);

        System.out.print( " Coдepжимoe списочного массива vals : \n ");
        Spliterator<Double> spliterator = vals.spliterator();
        while (spliterator.tryAdvance(System.out::println));

        ArrayList<Double> sqrs = new ArrayList<>();
        spliterator = sqrs.spliterator();
        spliterator.forEachRemaining((n) -> sqrs.add(Math.sqrt(n)));

        System.out.print("Coдepжимoeсписочного массива spliterator : \n");
        spliterator = sqrs.spliterator();
        spliterator.forEachRemaining ((n) -> System .out.println());
        System.out.println() ;
    }
}
