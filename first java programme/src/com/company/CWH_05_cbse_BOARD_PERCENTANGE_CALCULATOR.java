package com.company;

import java.util.Scanner;

public class CWH_05_cbse_BOARD_PERCENTANGE_CALCULATOR {
    public static void main(String[] args) {
        System.out.println("Enter the marks ");
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
        int f=sc.nextInt();
        int sum=a+b+c+d+e+f ;
        System.out.println("total marks -" +sum);
        float percentage= sum/6 ;
        System.out.println("percentage of the total number -");
        System.out.println(percentage + "%");

    }
}
