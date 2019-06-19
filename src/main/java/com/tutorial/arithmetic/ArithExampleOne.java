package com.tutorial.arithmetic;

import java.time.Instant;

public class ArithExampleOne {

    /**
     * 快速计算(a^p)%m的值
     * <P>秦九韶算法</P>
     * <url>http://acm.pku.edu.cn/JudgeOnline/problem?id=3070</url>
     * @param a
     * @param p
     * @param m
     * @return
     */
    public static int fastM(int a,int p,int m){
        if(p == 0) return 1;
        int r = a%m;
        int k = 1;
        while (p>1){
            if((p & 1)!=0){
                k=(k*r)%m;
            }
            r=(r*r) % m;
            p = p >> 1;
        }

        return (r*k) % m;
    }
    public static void main(String[] args) {

        System.out.println("" + (2<<2) );   //乘2
        System.out.println("2^n == 2<<(n-1) 结果：" + Math.pow(2,4) + "=" + (2<<(4-1)));

        System.out.println("99 取余：" + (99 % 2) + "99 取并：" + (99 & (2-1)) );//按位取并，作用上相当于取模mod或者取余%。


        System.out.println("-------------------Math.pow(10,20)%3---------------------");
        long s=System.currentTimeMillis();
        System.out.println(Math.pow(2,20) + "Math.pow: " + Math.pow(2,20)%3);

        long e=System.currentTimeMillis();
        System.out.println(e-s);

        System.out.println("-------------------ArithExampleOne.fastM---------------------");
        s=System.currentTimeMillis();
        System.out.println("fastM result: " + ArithExampleOne.fastM(2,20,3));
        e=System.currentTimeMillis();
        System.out.println(e-s);


    }
}
