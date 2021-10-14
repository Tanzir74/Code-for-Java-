package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Lab4_Q1 {
    public int add2(int a, int b)
    {
        return a+b;
    }
    public int add3(int d, int e,int f)
    {
        return d+e+f;
    }
    public int  add4 (int n)
    {
        System.out.println("Enter how many number you want  to sum -");
        Scanner sc=new Scanner(System.in);
        int size= sc.nextInt();
        int []ar = new int[size];
        int sum = 0;
        System.out.println("Enter the elements  one by one ");
        for(int i=0; i<size; i++){
            ar[i] = sc.nextInt();
            sum = sum + ar[i];
        }
        System.out.println("Input the number: "+ Arrays.toString(ar));
        return sum ;
    }
    public static void main(String[] args) {
        Lab4_Q1 obj= new Lab4_Q1() ;
        System.out.println(obj.add2(10,20));
        System.out.println(obj.add3(10,20,30));
        System.out.println(obj.add4(0));

    }
}
