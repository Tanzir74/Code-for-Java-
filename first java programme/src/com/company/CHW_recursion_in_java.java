package com.company;

public class CHW_recursion_in_java {
/*    // factorial number
     static int factorial(int n)
    {
        if (n==0 || n==1)
        {
            return 1 ;
        }
        else
        {
            return  n*factorial(n-1);
        }
    }
    public static void main(String[] args) {
        int a =4 ;
        System.out.println("the value of factorial n is - " + factorial(a));

 */
    // fibonancy series
    static int n1= 0,n2=1,n3=0 ;
    static void fibonancci(int count)
    {
        if (count>0)
        {
            n3=n1+n2 ;
            n1=n2 ;
            n2=n3 ;
            System.out.print(" "+n3);
            fibonancci(count-1);
        }
    }

    public static void main(String[] args) {
        int count= 10 ;
        System.out.print(n1+" "+n2);
        fibonancci(count-2);
    }
}
