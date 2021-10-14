package com.company;
public class Oop_question_3 {
    public static int missingNumber(int[] arr) {
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;
        int rs = 0;
        for (int i = 0; i < arr.length; i++) {
            rs += arr[i];
        }
        int missingNumber = sum - rs;
        return missingNumber;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,9};
        System.out.println("Missing number: " + missingNumber(arr));

    }
}
