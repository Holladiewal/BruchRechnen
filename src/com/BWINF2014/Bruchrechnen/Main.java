package com.BWINF2014.Bruchrechnen;

import java.util.Scanner;
import java.lang.Math;
import com.BWINF2014.Bruchrechnen.util.*;

public class Main {

    public static void main(String[] args) {
        int a; //a div b
        int b;
        int p;//p div q
        int q;

        @SuppressWarnings("UnusedDeclaration")
        String[] Aufgaben = new String[256];
        String[] Loesungen = new String[256];

        Scanner s = new Scanner(System.in);
        System.out.println("Leicht(1), Mittel(2) oder Schwer(3)?");
        switch (s.nextInt()) {
            //TODO Add Mittel und Schwer
            case 1: {
                boolean found;
                System.out.println("Bitte Anzahl der Aufgaben eingeben");
                for (int i = 1; i == s.nextInt(); i++) {
                    found = false;
                    while (!found) {
                       /*random[1] = (int) (Math.random() * 98 + 1);
                       random[2] = (int) (Math.random() * 98 + 1);*/
                        a = (int) MathUtil.Random(99,false);
                        b = (int) MathUtil.Random(99,false);
                        if (a < b) {
                            int aTmp = a;
                            while (!(b % aTmp == 0)) {
                                aTmp--;
                            }
                            p = a / aTmp;
                            q = b / aTmp;

                            //Unused int pCount;


                            if ((MathUtil.Count(p) + MathUtil.Count(q)) <= 10) {
                                found = true;
                                Aufgaben[i] = (a + "/" + b);
                                Loesungen[i] = (p + "/" + q);


                            }

                        } else {
                            int bTmp = b;
                            while (!(a % bTmp == 0)) {
                                bTmp--;
                            }
                            p = a / bTmp;
                            q = b / bTmp;

                            if ((MathUtil.Count(p) + MathUtil.Count(q)) <= 10) {
                                found = true;
                            }
                        }


                    }
                }

            }
        }
    }

}
