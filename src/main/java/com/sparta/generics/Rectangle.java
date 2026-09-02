package com.sparta.generics;

//  Cannot use type-specific methods with generics; must cast first.

//  Generics require object types, not primitives.

public class Rectangle<T> {

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


}
