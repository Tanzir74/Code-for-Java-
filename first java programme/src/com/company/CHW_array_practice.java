package com.company;


public class CHW_array_practice {
    public static void main(String[] args) {
        // Create an array of 5 floats and calculate their sum.
       /* int leanth ;
        Scanner sc =new Scanner(System.in) ;
        leanth= sc.nextInt()  ;
        float [] array = new float[leanth] ;
        for (int counter=0; counter< leanth;counter ++)
        {
            System.out.println(+counter+1);
            array[counter]= sc.nextInt();
        }
        float sum=0 ;
        for (float element: array)
        {
            sum=sum+element ;
        }
        System.out.println("the value of sum is " + sum);

        */
        //Write a program to find out whether a given integer is present in an array or not.

       /* int [ ]  marks = {1,2,3,4,5,5,6,6,7,8,8,9 } ;
        Scanner sc= new Scanner(System.in) ;

                int num = sc.nextInt() ;
        boolean isarray = false ;
        for (int element:marks){
            if (num==element){
                isarray=true ;
                break ;
            }
        }
        if (isarray){
            System.out.println("present");
        }
        else {
            System.out.println("not present");
        }

        */

        // Calculate the average marks from an array containing marks of all students in physics using a for-each loop.

      /*
        int leanth;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of this array");
        leanth = sc.nextInt();
        float[] array = new float[leanth];
        System.out.println("enter array number-");
        for (int a = 0; a < leanth; a++) {
            System.out.println(+a + 1);
            array[a] = sc.nextInt();

        }
        float sum = 0;
        for (float element : array)
        {
            sum = sum + element;
        }
        System.out.println("the evarage marks of this array is-"+sum/array.length );



       */
        //Create a Java program to add two matrices of size 2x3.
/*
      int [][] mat1={ {1,2,3},{ 4,5,6} };
        int [][] mat2={ {2,6,13}, {3,7,1} };
        int [][] result={ {0,0,0}, {0,0,0} };
        for (int i=0 ; i<mat1.length;i++)
        {
            for (int j=0 ; j<mat1[i].length ; j++)
            {
                result[i][j]= mat1[i][j] +mat2[i][j] ;
            }

        }
        for (int i=0 ; i<mat1.length;i++)
        {
            for (int j=0 ; j<mat1[i].length ; j++)
            {
                System.out.print(result[i][j] + " ");
                result[i][j]= mat1[i][j] +mat2[i][j] ;
            }
            System.out.println("");

        }

 */

// Write a Java program to reverse an array.
      /*  int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        int l= arr.length ;
         int temp ;
         int n = Math.floorDiv(arr.length,2) ;
         for (int i = 0; i < n; i++) {
            temp = arr[i] ;
            arr[i]= arr[l-i-1];
            arr[l-i-1]= temp;

        }
         for ( int element: arr)
         {
             System.out.print(element +" ");
         }

       */
        // Write a Java program to find the maximum element in an array.
        /*
         int[] arr = new int[]{1, 2, 3, 4, 5,455 ,6};
        int max=0 ;
        for (int element: arr)
        {
            if (element>max)
            {
                max=element ;
            }
        }
        System.out.println(" the value of the maximum element is in the array-" +max );


          */
    //Write a Java program to find whether an array is sorted or not.

        boolean isSorted = true;
        int [] arr = {1, 12, 3, 4, 5, 34, 67};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The Array is sorted");
        }
        else{
            System.out.println("The Array is not sorted");
        }


    }
}
