package com.company;

public class Main {

    public static void main(String[] args) {

        //double r = Math.random();       //   [0.0,1.0)
        //double r = Math.random()*10;       //   [0.0, 10.0)
        //int r = (int)(Math.random()*10);    // [0,9]
        int r = (int)(Math.random()*10+21);    // [21,30]
        System.out.println(r);

    }
}
