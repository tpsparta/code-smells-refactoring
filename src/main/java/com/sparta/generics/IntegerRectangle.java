package com.sparta.generics;

//  Cannot use type-specific methods with generics; must cast first.

//  Generics require object types, not primitives.

public class IntegerRectangle {

    private Integer length;
    private Integer width;

    public IntegerRectangle(Integer length, Integer width) {
        this.length = length;
        this.width = width;
    }
    
    public Integer getLength() {
        return length;
    }

    public Integer getWidth() {
        return width;
    }


}
