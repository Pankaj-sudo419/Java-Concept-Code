package com.abstraction;

public class AbstractionExampleImplementation {
    public static void main(String[] args) {
        Implementation implementation = new Implementation();
        System.out.println(implementation.area("Rectangle",2,4));
        System.out.println(implementation.perimeter(2,4));
    }
}

class Implementation  implements  AbstractionsExample{
    @Override
    public int area(String shape, int length, int breath) {
        System.out.println("shape is :" + shape);
        return length*breath;
    }

    @Override
    public int perimeter(int length, int breath) {
        return 2*(length+breath);
    }
}
