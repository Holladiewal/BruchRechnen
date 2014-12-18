package com.BWINF2014.Bruchrechnen.util;

import java.lang.Math;


public class MathUtil {
    public static int Count(int a) {
        int b;
        if (a < 10) {return 1;}
        if (a < 1000) {return 2;}
        if (a < 10000) {return 3;}
        if (a < 100000) {return 4;}
        return -1;
    }
    public static double round(double Zahl, int Stellen) {
        int pow10 = (int) Math.pow(10,Stellen);
        return (Math.round(Zahl * pow10)/pow10);
    }
    public static double Random(int a, boolean Zero){
        if (Zero == true) {
            return Math.random()*a;

        }
        else {
            return Math.random()*(a-1)+1;
        }
    }
}
