package com.company;

public class Oop_question_6 {
    static  double sin (double x)
    {
        double b =  Math.asin(x);

        return b ;
    }
    static double cosine (double y)
    {

        double a = Math.acos(y);
        return a ;
    }

    public static void main(String[] args) {
        double i= sin  (1) ;
        double j= cosine(1) ;
        System.out.println(i);
        System.out.println(j);

    }
}

