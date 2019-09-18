package com.company;
import java.lang.Object;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Fraction fa = new Fraction(1, 2);
        Fraction fb = new Fraction(3, 0);
        fb.subtract(fa);
        fb.debug();
        fb.multiply(fa);
        fb.debug();
        Fraction fadd = fb.add(fa);
        fadd.debug();
        Fraction fdiv = fb.divide(fa);
        fdiv.debug();
        fb.debug();
        Fraction fred = fb.reduce();
        fb.debug();
        fred.debug();
        Object y = new Integer(10);

        Object x = new Fraction(6, 4);
        System.out.print(fb.equals(x));
    }
}
