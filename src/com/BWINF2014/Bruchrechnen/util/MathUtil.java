package com.BWINF2014.Bruchrechnen.util;

import java.lang.Math;


public class MathUtil {
    public static int Count(double Zahl) {
        int b = (int) Zahl;
        if (Math.abs(b) < 10) return 1;
        if (Math.abs(b) < 100) return 2;
        if (Math.abs(b) < 1000) return 3;
        if (Math.abs(b) < 10000) return 4;
        if (Math.abs(b) < 100000) return 5;
        if (Math.abs(b) < 1000000) return 6;
        if (Math.abs(b) < 10000000) return 7;
        if (Math.abs(b) < 100000000) return 8;
        if (Math.abs(b) < 1000000000) return 9;
        if (Math.abs(b) < 10000000000f) return 10;
        return -1;
    }
    public static double round(double Zahl, int Stellen) {
        int pow10 = (int) Math.pow(10,Stellen);
        return (Math.round(Zahl * pow10)/pow10);
    }
    public static double Random(int a, boolean Zero){
        if (Zero) {
            return Math.random()*a;
        }
        else {
            return Math.random()*(a-1)+1;
        }
    }
}
