package com.company;

import java.io.File;
import java.util.Scanner;

public class File_handleing_reading {
    public static void main(String[] args) {
        try {
            File file = new File("C:/Users/tanzi/OneDrive/Desktop/person/student.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                String id = sc.next();
                String name = sc.next();
                System.out.println("ID:" + id + "Name" + name);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
