package org.way2it.oop.homework4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Pillow> pillows = new HashSet<>();

        Pillow pillow1 = new Pillow("red", 50);
        Pillow pillow2 = new Pillow("green", 45);
        Pillow pillow3 = new Pillow("blue", 55);
        Pillow pillow4 = new Pillow("white", 50);

        pillows.add(pillow1);
        pillows.add(pillow2);
        pillows.add(pillow3);
        pillows.add(pillow4);

        System.out.println(pillows);

        Set<Pillow> pillowsTree = new TreeSet<>(pillows);
        System.out.println(pillowsTree);
    }
}
