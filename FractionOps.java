package com.practice;

import java.util.ArrayList;
import java.util.Scanner;

class Fraction {
    private long n;
    private long d;
    
    public Fraction(long n, long d){
        this.n = n;
        this.d = d;
    }
    
    public long[] add(long n1, long d1, long n2, long d2){
        long n = (n1*d2)+(n2*d1);
        long d = d1*d2;
        long a[] = reduceFraction(n,d);
        return a;
    }
    
    public long[] multiply(long n1, long d1, long n2, long d2){
         long n = n1*n2;
        long d = d1*d2;
        long a[] = reduceFraction(n,d);
        return a;
    }
    
    public void print(long n, long d){
        System.out.println(n+"/"+d);
    }
    
    static long[] reduceFraction(long x, long y)
    {
        long d;
        d = __gcd(x, y);

        x = x / d;
        y = y / d;

        
        return new long[]{x,y};
    }
 
    static long __gcd(long a, long b)
    {
        if (b == 0)
            return a;
        return __gcd(b, a % b);

    }
    public void opr(ArrayList<ArrayList<Integer>> l){
        for(ArrayList<Integer> x : l){
            int type = x.get(0);
            int num = x.get(1);
            int deno = x.get(2);
            long a[] = new long[2];
            
            switch(type){
                case 1 :
                    a = add(n,d,num,deno);
                    n = a[0];
                    d = a[1];
                    break;
                case 2: 
                    a = multiply(n,d,num,deno);
                    n = a[0];
                    d = a[1];
                    break;
            }
            print(n,d);
        }
    }
    
    

}

public class FractionOps {

    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int d1 = sc.nextInt();
        
        Fraction f = new Fraction(n1,d1);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> l = new ArrayList<ArrayList<Integer>>();
        for(int i =0 ;i < n; i++){
            ArrayList<Integer> a = new ArrayList<Integer>();
            a.add(sc.nextInt());
            a.add(sc.nextInt());
            a.add(sc.nextInt());
            l.add(a);
        }
        f.opr(l);
    

    }
}
