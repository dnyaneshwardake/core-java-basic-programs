package com.dnyanesh.fang.codes;

import java.util.HashSet;

public class Fraction {
    private int p;
    private int q;

    Fraction(int p, int q) {
        this.p = p;
        this.q = q;
    }
    
    public static int getGCD(int a, int b) {
        if (b == 0)
            return a;
        else 
            return getGCD(b, a % b);
    }
    
    public static Fraction reduce(Fraction f) {
        int c = getGCD(f.p, f.q);
        return new Fraction(f.p / c, f.q / c);
    }
    
    public static HashSet<Fraction> getAll(int m, int n) {
        HashSet<Fraction> res = new HashSet<Fraction>();
        for (int p = m; p <= n; p++)
            for (int q = 1; q < p; q++) {
                Fraction f = new Fraction(p,q);
                Fraction fr = reduce(f);
                if (!res.contains(fr))
                    res.add(fr);
            }
        return res;
    }

    public static void print(Fraction f) {
        System.out.println(f.p + "/" + f.q);
    }
    
    public static void main(String[] args) {
        HashSet<Fraction> res = getAll(2, 4);
        for (Fraction f : res)
            print(f);
    }

}