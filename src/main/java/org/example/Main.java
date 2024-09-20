package org.example;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        //Print the factorial of 5
        out.println(fac(5));

        //Print each element of the array from the back side to first
        int[] t = new int[]{1, 2, 3, 4, 5};
        resortArray(t,t.length - 1);

        //Print natural numbers to v by recursion numbers
        naturalNumaTo(100);

    }

    // Calculate a factorial number by the recursion function
    public static int fac(int n){
        if(n==0) return 1;
        else return fac(n - 1) * n;
    }
    //Print items of the array from the back side by recursion
    public static void  resortArray(int[] v, int n) {
        out.println(v[n]);
        if (n == 0) out.println(v[n]);
        else resortArray(v, n - 1);
    }
    public static void naturalNumaTo(int v){
        //Natural numbers grater 10 doesn't divide on numbers 7, 3, 5 without remains
        boolean b = ( v % 7 != 0 & v % 3 != 0 &  v % 5 != 0);
        //Natural numbers grater 10 doesn't divide on numbers 2 without remains
        boolean c  =( v % 2 != 0);
        if (v == 0) out.println("end");
        else {
            naturalNumaTo(v - 1);
            if (b & c) out.println(v);
            else if (v == 1 | v == 3 | v== 5 | v== 7) out.println(v);
        }
      }
    }
