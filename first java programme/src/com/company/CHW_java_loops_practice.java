package com.company;
import java.util.Scanner;
public class CHW_java_loops_practice {
    public static void main(String[] args) {
        System.out.print("Enter : ");

        /*
          Write a program to print the following pattern
        ****
        ***
        **
        *


        Scanner sc= new Scanner(System.in) ;
        int n =sc.nextInt();
        for (int i = n; i > 0; i--) {
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }


        //Write a program to sum first n even numbers using a while loop.
        int sum= 0 ;
        Scanner sc= new Scanner(System.in) ;
        int n =sc.nextInt();
        for (int i=0; i<n ; i++)
        {
            sum= sum+ (2*i);
        }
            System.out.print("sum of even number: ");
            System.out.println(sum);

        // Write a program to print the multiplication table of a given number n.

        Scanner sc= new Scanner(System.in) ;
        int n =sc.nextInt();
        for (int i=1; i<=10; i++)
        {
            System.out.printf("%d X %d= %d\n",n,i,n*i);
        }


        //Write a program to print a multiplication table in reverse order.

        Scanner sc= new Scanner(System.in) ;
        int n =sc.nextInt();
        for (int i=10; i>=1; i--)
        {
            System.out.printf("%d X %d= %d\n",n,i,n*i);
        }



        // Write a program to find the factorial of a given number using while loops

        Scanner sc= new Scanner(System.in) ;
        int n =sc.nextInt();
        int i=1 ;
        int factorial =1 ;
        while(i<=n )
        {
            factorial *= i ;
            i++ ;

        }
        System.out.println(factorial);


        // Write a program to find the factorial of a given number using For loops
        Scanner sc= new Scanner(System.in);
                int n= sc.nextInt();
        int a=1;
        for (int i=1 ; i<=n ; i++){

            a *= i ;
        }
        System.out.println(a);

         */
        Scanner sc= new Scanner(System.in) ;
        int n =sc.nextInt();
         int sum=0 ;
        for (int i=1; i<=10; i++)
        {
            System.out.printf("%d X %d= %d\n",n,i,n*i);
        }

    }

}


