package com.company;

import java.io.File;

public class file_handeling {
    public static void main(String[] args) {
        File dir = new File("C:/Users/tanzi/OneDrive/Desktop/person");
        dir.mkdir();
       /* File dirlocation = dir.getAbsoluteFile();
        System.out.println(dirlocation);
        System.out.println(dir.getName());
        if (dir.delete())
        {
            System.out.println("folder is deleted ");
        }

        */
        File file1= new File("C:/Users/tanzi/OneDrive/Desktop/person/student.txt");
        File file2 = new File("C:/Users/tanzi/OneDrive/Desktop/person/student2.txt");
        try{
            file1.createNewFile();
            file2.createNewFile();

        }catch(Exception e){
            System.out.println(e);
        }


    }
}
