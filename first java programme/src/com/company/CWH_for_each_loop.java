package com.company;

import javax.swing.text.Element;

public class CWH_for_each_loop {
    public static void main(String[] args)
    {
       /* int [] marks = { 98,76,66,45,33,45,6,7};
 for(int i=0; i<marks.length; i++)
 {
     System.out.println(marks[i]);
 }

        */
        //displaying the array with for-each loop
        int [] marks = { 98,76,66,45,33,45,6,7};
        for (int element : marks)
            System.out.println(element  );

    }

}
