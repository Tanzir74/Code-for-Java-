package com.company;
public class question_2 {
    public static int nextPrime(int num) {
        num++;
        for (int i = 2; i < num; i++) {
            if(num%i == 0) {
                num++;
                i=2;
            } else {
                continue;
            }
        }
        return num;
    }
    public static void main(String args[]){
        int num = 11;
        System.out.println("Next prime number is: "+nextPrime(num));
    }
}

