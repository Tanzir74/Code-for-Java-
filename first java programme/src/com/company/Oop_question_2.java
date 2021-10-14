package com.company;

public class Oop_question_2 {
    public static int Cutting_required(int number) {

        int hrizntalcut = number / 2;

        return ((hrizntalcut + 1) * (number - hrizntalcut + 1));

    }

    public static void main(String[] args)
    {
        System.out.println(Cutting_required(3));
    }
}