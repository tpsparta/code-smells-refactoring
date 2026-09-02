package com.sparta.generics;

public class genericsApp {
    public static void main(String[] args) {
        Rectangle<Integer> rectangle = new Rectangle<>(2, 2);
        rectangle.getLength();
        rectangle.getWidth();
        System.out.println("Area: " + rectangle.getLength() * rectangle.getWidth());
    }
}
