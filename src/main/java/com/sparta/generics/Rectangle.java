package com.sparta.generics;



public class Rectangle<T extends Number> {

    private T length;
    private T width;

    public Rectangle(T length, T width) {
        this.length = length;
        this.width = width;
    }
    
    public T getLength() {
        return length;
    }

    public T getWidth() {
        return width;
    }

    public void setLength(T length) {
        this.length = length;
    }

    public void setWidth(T width) {
        this.width = width;
    }




}
