package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Lab_6 {
    public static void main(String[] args) throws IOException {
        File lab6file = new File("E:\\Class\\5th seamister\\oop lab");
        lab6file.mkdir();



        String dirtname="E:\\Class\\5th seamister\\oop lab";
        String filename="output.txt";


        File file= new File(dirtname,filename);
        FileWriter fw=new FileWriter(file);

        int m, n, p, q, sum = 0, c, d, k;
        String s = null;
        Scanner in = new Scanner(System.in);

        m = 3;
        n = 3;
        int first[][] = new int[m][n];

        String dirname1="E:\\Class\\5th seamister\\oop lab";
        String filename1 = null;
        filename1 = "output1.txt";
        File file1= new File(dirname1,filename1);
        FileWriter fw1=new FileWriter(file1);
        for (c = 0; c < m; c++){
            for (d = 0; d < n; d++){
                first[c][d] = in.nextInt();
                fw1.write(first[c][d]+"\t");
            }
            fw1.write("\n");
        }
        fw1.close();
        p = 3;
        q = 3;
        if (n != p)
            System.out.println("The matrices can't be multiplied");
        else
        {
            int second[][] = new int[p][q];
            int multiply[][] = new int[m][q];
            System.out.println("Enter the elements of second matrix");
            String dirname2="E:\\Class\\5th seamister\\oop lab";
            String filename2 = null;
            filename2 = "output2.txt";
            File file2= new File(dirname2,filename2);
            FileWriter fw2=new FileWriter(file2);
            for (c = 0; c < p; c++){
                for (d = 0; d < q; d++){

                    second[c][d] = in.nextInt();
                    fw2.write(second[c][d]+"\t");
                }
                fw2.write("\n");
            }
            fw2.close();
            for (c = 0; c < m; c++) {
                for (d = 0; d < q; d++) {
                    for (k = 0; k < p; k++)
                        sum = sum + first[c][k]*second[k][d];
                    multiply[c][d] = sum;
                    sum = 0;
                }
            }
            System.out.println("Product of the matrices:");
            for (c = 0; c < m; c++) {
                for (d = 0; d < q; d++){


                    fw.write(multiply[c][d]+"\t");



                }
                fw.write("\n");
            }
            fw.close();
            try {
//constructor of the File class having file as an argument E:\\\\Class\\\\5th seamister\\\\\oop lab
                FileReader fr;
                fr = new FileReader("C:\\Users\\tanzi\\IdeaProjects\\first java programme\\src\\com\\company\\input.txt");
                System.out.println("file content: ");
                int r=0;
                while((r=fr.read())!=-1)
                {
                    System.out.print((char)r); //prints the content of the file
                }

            } catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
// Java program to demonstrate ArithmeticException




