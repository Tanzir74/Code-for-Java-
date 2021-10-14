package com.company;

import java.util.Scanner;

public class Oop_question_4 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sum-");
        float sum = sc.nextFloat();
        System.out.println("Enter difference -");
        float diff = sc.nextFloat();
        float x;
        float y;
        x = (sum + diff) / 2;
        y = (sum - diff) / 2;
        System.out.println(x);
        System.out.println(y);
    }
}
