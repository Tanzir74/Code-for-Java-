package com.company;
class fact
{
    public int factorial(int n){

        if (n == 0)
            return 1;
        else
            return(n * factorial(n-1));

    }
}

class fact2 extends fact {
    @Override
    public int factorial(int n){
    int i,fact=1;
    for(i=1;i<=n;i++)
    {
        fact=fact*i;
    }
        System.out.println("Factorial of "+n+" is: "+fact);
        return n ;
    }
}

public class Lab4_Q2 {
    public static void main(String[] args) {
        fact re= new fact();
        System.out.println(re.factorial(4));
        fact2 ge= new fact2();
        ge.factorial(2);
    }
}
