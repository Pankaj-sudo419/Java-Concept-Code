package com.polymorphism;

public class MethodOverloading {
    public static  int sum(int a, int b){
        return a+b;
    }

    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static double sum(double a , double b){
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(sum(2,4));
        System.out.println(sum(1,2,3));
        System.out.println(sum(3.0,5.0));
    }
}
