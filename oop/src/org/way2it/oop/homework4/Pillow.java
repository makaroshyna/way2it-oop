package org.way2it.oop.homework4;

public class Pillow implements Comparable<Pillow> {
    private String color;
    private int length;

    public Pillow(String color, int length) {
        this.color = color;
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Pillow{" +
                "color='" + color + '\'' +
                ", length=" + length +
                '}';
    }

    @Override
    public int compareTo(Pillow pillow) {
        return this.color.compareTo(pillow.color);
    }
}