package com.company;

import java.util.Scanner;
class Cgpa
{
    public double count(double n)
    {
        System.out.println("enter your CGPA-");
        Scanner sc= new Scanner(System.in) ;
                n= sc.nextDouble();
        if (n==3)
        {
            System.out.println("You have got only 15% waiver on your tuition fees ");
        }
        else if (n<=3.5)
        {
            System.out.println("You have got  30% waiver on your tuition fees ");
        }
        else if (n<=3.70)
        {
            System.out.println("You have got  50% waiver on your tuition fees ");
        }
        else if (n<=4)
        {
            System.out.println("You have got  80% waiver on your tuition fees ");
        }
        else
        {
            System.out.println("You haven't got any waiver in this semester");
        }
        return n ;
    }
}
class tuition_fee extends Cgpa
{
    @Override
    public double count (double sum )
    {
        System.out.println("Enter your amount for this semester");
        Scanner scc= new Scanner(System.in);
                sum = scc.nextInt();

return sum ;
    }


}

public class Lab4_Q3 {
    public static void main(String[] args)
    {


    }
}
