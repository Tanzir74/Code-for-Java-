package com.company;

import javax.swing.*;
import java.util.Scanner;

public class CWH_19_practice_on_conditional_and_switch_case
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        //Write a program to find out whether a student is pass or fail; if it requires total 40% and at least 33% in each subject to pass. Assume 3 subjects and take marks as an input from the user.

        System.out.print("enter sub1-");
        int sub1= sc.nextInt();
        System.out.print("enter sub2-");
        int sub2= sc.nextInt();
        System.out.print("enter sub3-");
        int sub3= sc.nextInt();
        int avarage =(sub1+sub2+sub3)/3;
        System.out.println(avarage);
        if(avarage<= 33 && avarage>= 40 )
            System.out.println("you are pass");
        else if(40<avarage)
            System.out.println("you are doing well");
        else
            System.out.println("you failed ");

//Calculate income tax paid by an employee to the government as per the slabs mentioned below:
       System.out.println("enter your ammount(ammount mast be in lakhs)");
        float ammount= sc.nextFloat();
        if (2.5f <= ammount && ammount < 5.0f)
            System.out.println("your tax-5%");
        else if(5.0f<= ammount && ammount<10.0f )
            System.out.println("your tax-20%");
        else if(ammount>=10.0f)
        System.out.println("your tax-30%");
        else
            System.out.println("there was no tax");

        //Write a Java program to find out the day of the week given the number [1 for Monday, 2 for Tuesday … and so on!]
        int day=sc.nextInt();
        switch(day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednessday");
                break;
            case 5:
                System.out.println("Thusday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Sutarday");
                break;
            default:
                System.out.println("noyhing ");
        }

        //Write a Java program to find whether a year entered by the user is a leap year or not.

        System.out.println("enter your year-");
        int year= sc.nextInt();  
        if (year%4==0 && year%100==0 && year%400==0) 
            System.out.println("yeas");
            else
            System.out.println("no");


        //Write a program to find out the type of website from the URL:

        String website = sc.nextLine() ;
        if(website.endsWith(".org"))
            System.out.println("organijational");
       if(website.endsWith(".com"))
           System.out.println("comarsial");
       if(website.endsWith(".in"))
           System.out.println("industrial");

    }
}
