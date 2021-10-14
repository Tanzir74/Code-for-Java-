package com.company;

import java.text.Format;
import java.util.Formatter;
import java.util.Scanner;

public class fileHandeling_using_formatar_file_writing {
    public static void main(String[] args) {
        String id, name;
        try {
            Formatter formatar = new Formatter("C:/Users/tanzi/OneDrive/Desktop/person/student.txt");
            Scanner sc = new Scanner(System.in);
            System.out.println("enter how many student you want to add:");
            int stNum = sc.nextInt();
            for (int i = 1; i <= stNum; i++) {
                System.out.println("enter student name:");
                name = sc.next();
                System.out.println("Enter student ID: ");
                id = sc.next();
                formatar.format("Name-%s Id-%s ",name,id);
            }
            formatar.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
