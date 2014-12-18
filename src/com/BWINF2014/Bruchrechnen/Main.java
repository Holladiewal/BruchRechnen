package com.BWINF2014.Bruchrechnen;

import java.util.Scanner;
import com.BWINF2014.Bruchrechnen.util.*;

public class Main {

    public static void main(String[] args) {
        int a; //a div b
        int b;
        int p;//p div q
        int q;
        String[] Aufgaben = new String[256];
        String[] Loesungen = new String[256];

        Scanner s = new Scanner(System.in);
        System.out.println("Leicht(1), Mittel(2) oder Schwer(3)?");
        switch (s.nextInt()) {


            //region Leicht
            case 1: {
                boolean found;
                System.out.println("Bitte Anzahl der Aufgaben eingeben");
                int AufgCount = s.nextInt();
                for (int i = 1; i == AufgCount+1; i++) {
                    found = false;
                    while (!found) {
                       /*random[1] = (int) (Math.random() * 98 + 1);
                       random[2] = (int) (Math.random() * 98 + 1);*/
                        a = (int) MathUtil.Random(99, false);
                        b = (int) MathUtil.Random(99, false);
                        if (a < b) {
                            int aTmp = a;
                            while (!(b % aTmp == 0)) {
                                aTmp--;
                            }
                            p = a / aTmp;
                            q = b / aTmp;

                            //Unused int pCount;


                            if ((MathUtil.Count(p) + MathUtil.Count(q)) == 4 && (p+q) <= 10) {
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
                                Aufgaben[i] = (a + "/" + b);
                                Loesungen[i] = (p + "/" + q);
                            }
                        }


                    }
                    System.out.println("Aufgabe " + i + " = " + Aufgaben[i]);
                    System.out.println("Lösungen Aufgabe " + i + " = " + Loesungen[i]);
                }


            break;
            }
//endregion

            //region Mittel
            case 2: {
                boolean found;
                System.out.println("Bitte Anzahl der Aufgaben eingeben");
                int AufgCount = s.nextInt();
                for (int i = 1; i == AufgCount; i++) {
                    found = false;
                    while (!found) {

                        a = (int) MathUtil.Random(99, false);
                        b = (int) MathUtil.Random(99, false);

                        if (a < b) {
                            int aTmp = a;
                            while (!(b % aTmp == 0)) {
                                aTmp--;
                            }

                            p = a / aTmp;
                            q = b / aTmp;

                            if ((MathUtil.Count(p) + MathUtil.Count(q)) == 5 && ( (p+q) > 10) && (p+q <= 20)) {
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

                            if ((MathUtil.Count(p) + MathUtil.Count(q)) == 5 && ( (p+q) > 10) && (p+q <= 20)) {
                                found = true;
                                Aufgaben[i] = (a + "/" + b);
                                Loesungen[i] = (p + "/" + q);
                            }
                        }


                    }
                    System.out.println("Aufgabe " + i + " = " + Aufgaben[i]);
                    System.out.println("Lösungen Aufgabe " + i + " = " + Loesungen[i]);
                }

                break;
            }
//endregion

            //region Schwer
            case 3: {
                boolean found;
                System.out.println("Bitte Anzahl der Aufgaben eingeben");
                int AufgCount = s.nextInt();
                for (int i = 1; i == AufgCount; i++) {
                    found = false;
                    while (!found) {

                        a = (int) MathUtil.Random(99, false);
                        b = (int) MathUtil.Random(99, false);

                        if (a < b) {
                            int aTmp = a;
                            while (!(b % aTmp == 0)) {
                                aTmp--;
                            }

                            p = a / aTmp;
                            q = b / aTmp;

                            if ((MathUtil.Count(p) + MathUtil.Count(q)) == 5 && ( (p+q) > 20) && (p+q <= 30)) {
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

                            if ((MathUtil.Count(p) + MathUtil.Count(q)) == 5 && ( (p+q) > 20) && (p+q <= 30)) {
                                found = true;
                                Aufgaben[i] = (a + "/" + b);
                                Loesungen[i] = (p + "/" + q);
                            }
                        }


                    }
                    System.out.println("Aufgabe " + i + " = " + Aufgaben[i]);
                    System.out.println("Lösungen Aufgabe " + i + " = " + Loesungen[i]);
                }

                break;
            }
//endregion
        }

    }
}
