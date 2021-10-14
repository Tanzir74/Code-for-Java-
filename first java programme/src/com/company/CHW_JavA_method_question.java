package com.company;

public class CHW_JavA_method_question {
    // Write a Java method to print the multiplication table of a number n.
  /*  static void multiplication(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%dX%d=%d\n", n, i, n * i);
        }


    }

    public static void main(String[] args) {
        multiplication(10);
    }

}

   */

    /* Write a program using functions to print the following pattern:
     *

     **

     ***

     ****

     */
   /* static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(4);
    }
}

    */
    //Write a recursive function to calculate the sum of first n natural numbers.

/*
    static int sumrect(int n)
{
    //base condition
    if (n==1)
    {
        return 1;
    }
    return n+ sumrect(n-1) ;
}

    public static void main(String[] args) {
       int c= sumrect(6) ;
        System.out.println(c);
    }
}
 */
    /*Write a function to print the following pattern:
     ****
     ***
     **
     *

     */
/*static boolean patrn(int n)
{
  for (int i=n ; i>n;i--)
  {
      for (int j=n; j>n-1;j--)
      {
          System.out.println("*");
      }
  }
    System.out.println();
    return false;
}

    public static void main(String[] args) {
   patrn(4);
    }
}


 */
// Write a function to print the nth term of the Fibonacci series using recursion.

   /* static int fibonancy(int n) {
        if (n == 1 || n == 2) {
            return n - 1;
        }

    else

    {
        return fibonancy(n - 1) + fibonancy(n - 2);
    }
}
    public static void main(String[] args) {
        int result=fibonancy(7);
        System.out.println(result);
    }
}
    */
//Write a function to find the average of a set of numbers passed as arguments.
}



