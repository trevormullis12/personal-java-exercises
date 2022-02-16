package com.company;

public class Warmup {
    public static int areaOrPerimeter(int a, int b) {
        if(a==b) return a*b;
        return a*2 + b*2;
    }
    public static void main(String[] args) {
        System.out.println(areaOrPerimeter(6, 10));
        System.out.println(areaOrPerimeter(3, 3));
    }
}
