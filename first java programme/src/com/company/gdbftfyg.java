package com.company;

public class gdbftfyg {
    public static void main(String[] args) {

        int num = 11;
        int prime = 0;

        for(int j = num; j<num; j++){

            int count = 0;
            for(int i=2; i<=j/2; i++){

                if(j%i==0){
                    count++;
                }
            }

            if(count==0){

                prime = j;
                break;

            }

        }

        System.out.println(prime);

    }

}