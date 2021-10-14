package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class classwork2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("matrix.txt"));
        String firstFile = reader.readLine();
        String[] split = firstFile.split("firstFile.txt ");
        int firstX = Integer.parseInt(split[0]);
        int firstY = Integer.parseInt(split[0]);
        int[][] first = new int[firstX][firstY];
        for (int i = 0; i < firstX; i++) {
            String[] line;
            line = reader.readLine().split(" ");

            for (int j = 0; j < firstY; j++) {
                first[i][j] = Integer.parseInt(line[j]);
            }

        }
        reader.readLine();

        String secoundFile = reader.readLine();
        String[] split2 = secoundFile.split(" ");
        int secoundX = Integer.parseInt(split2[0]);
        int secoundY = Integer.parseInt(split2[0]);
        int[][] secound = new int[secoundX][secoundY];
        for (int i = 0; i < secoundX; i++) {
            String[] line;
            line = reader.readLine().split(" ");

            for (int j = 0; j < secoundY; j++) {
                secound[i][j] = Integer.parseInt(line[j]);
            }
        }
            multiply(first,secound );
            reader.close();

        }
        public static void multiply(int[][] first, int[][] second) {
            for (int i = 0; i < first.length; i++) {
                int total = 0;
                for (int j = 0; j < second[0].length; j++) {
                    int fnum = first[i][j];
                    int snum = second[j][i];
                    int product = fnum * snum;
                    total += product;
                }
                System.out.print(total + " ");
            }
        }

    }


