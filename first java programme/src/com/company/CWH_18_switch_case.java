package com.company;

import java.util.Scanner;

import static java.lang.System.*;

public class CWH_18_switch_case {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(in);
        out.println("enter your age");
        int age= sc.nextInt();
        switch (age) {
            case 18 -> {
                out.println("you are going well");
            }
            case 23 -> {
                out.println("fytghsc jm");
            }
            case 67 -> {
                out.println("you are old ");
            }
            default -> {
                out.println("enjoy your life");
            }
        }
    }

}
