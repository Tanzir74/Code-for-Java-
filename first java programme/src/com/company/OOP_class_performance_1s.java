package com.company;

public class OOP_class_performance_1s {
   static int odd(int x) {
        int y ;
        y = x / 2;

        return y;

    }

    public static void main(String[] args) {
        boolean flag=false ;
        int c=odd(7);
        if (c==0||c==1)
        {
            System.out.println("its not a prime number ");
        }
        else
        {
            for (int i=2; i<c;i++)
            {
                if (c%i==0)
                {
                  flag =true ;
                    break ;
                }
            }
        }
        if (!flag)
        {
            System.out.println(" Yes, it's  a prime number !");
        }
        else
            System.out.println(" It's not a prime number !");

    }
}


