package org.example;

import java.awt.*;
import java.util.LinkedList;

public class Address {
    private String name;
    private String street;
    private String city;
    private String state;
    private String code;

    Address(String n, String s, String c, String st, String cd) {
        name = n;
        street = s;
        city = c;
        state = st;
        code = cd;
    }

    public String ToString() {
        return name + "/n" + street + "/n" + city + " " + state + " " + code;
    }
}

