package com.company;

import java.util.Random;
import java.util.Scanner;

public class Rock_paper_sr {
    public static void main(String[] args) {
         //0 for rock
        //1 for paper
        // 2 for scissor
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 0 for rock, 1 for paper and 2 for scissor ");
        System.out.println("Enter your choice: ");
        int input = sc.nextInt();
        Random random = new Random();
        int computerinput =random.nextInt(3) ;
        System.out.println("computer choice: "+ computerinput);
        if (input==computerinput)
        {
            System.out.println("Match draw");
        }
        else if (input==0&&computerinput==2||input==1&&computerinput==0||input==2&&computerinput==1)
        {
            System.out.println(" You win :) ");
        }
        else
        {
            System.out.println("computer win :( ");
        }

    }
}
