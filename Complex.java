package com.company;

import java.io.PrintStream;
import java.util.Scanner;

public class Complex {

    public static PrintStream out = System.out;
    public static Scanner in = new Scanner(System.in);

    double a, b;


    public Complex(double a, double b) {
        this.a = 0;
        this.b = 0;
    }

    public static boolean flag = true;

    public static void main(String[] args){
        double a = in.nextDouble();
        double b = in.nextDouble();
        int pow = in.nextInt();

        Complex z = new Complex(a, b);
        Complex y = new Complex(2, 9);

        out.println(Complex.add(z, y));
        out.println(Complex.substract(z, y));
        out.println(Complex.divide(z, y));
        out.println(Complex.power(z, pow));
    }

    public static Complex add(Complex z, Complex y) {
        return new Complex( z.getA() + y.getA(), z.getB() + y.getB());
    }

    public static Complex substract(Complex z, Complex y) {
        return new Complex( z.getA() - y.getA(), z.getB() - y.getB());
    }

    public static Complex divide(Complex z, Complex y) {
        return new Complex( z.getA() * y.getA(), z.getB() * y.getB());
    }

    public static Complex power(Complex z, int pow) {
        switch ((pow-1) % 4) {
            case 0:
                return z;
                break;
            case 1:
                return new Complex(1, 0);
                break;
            case 2:
                return new Complex(z.getA() * -1, z.getB() * -1);
                break;
            case 3:
                return new Complex(-1, 0);
                break;
        }
    }


    public double getB(){
        return this.b;
    }

    public double getA(){
        return this.a;
    }

}
