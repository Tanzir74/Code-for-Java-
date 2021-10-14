package com.company;


public class Oop_class_lab_2<sout> {
 /* static void student(int x, int y )
    {
        ;
    }

    public static void main(String[] args) {
        //Create a class STUDENT and use constructor to initialize its instance variables.
       int a= 7 ;
       int b=6 ;
       student (a,b);
        System.out.println(a + " " +b );


  */

    // Determine the number of cutting required to split a cake into N pieces using
   /* public static int Cutting_required(int number)
    {

        int hrizntalcut = number / 2;

        return ((hrizntalcut + 1) * (number - hrizntalcut + 1));

    }

    public static void main (String[] args)
    {
         //Scanner sc= new Scanner(System.in) ;
       // int n = sc.nextInt();
        System.out.println( Cutting_required (3));

    */
    // Find the missing 9th digit of a suduko grid when 8 digits are given using methods.

    // N is the size of the 2D matrix   N*N

    //no ans of this question

   /*
   //Determine two numbers X and Y, when the summation and difference of the two numbers are given.

   public static void main(String[] args) {


        Scanner sc = new Scanner(System.in) ;
        System.out.println("enter sum-");
        float sum = sc.nextFloat();
        System.out.println("enter difference -");
        float diff = sc.nextFloat();
        float x;
        float y;
        x = (sum + diff) / 2;
        y = (sum - diff) / 2;
        System.out.println(x);
        System.out.println(y);

    */
    //determine X from logarithom
    //

  /*  public static void main(String[] args) {
        System.out.print("Enter the logarithom-");
        int component = 10 ;
        double x = Math.pow(10, component );
        System.out.println("The determination of X = " +x);


   */
    //Determine cos, sin of X using methods.
    static  double sin (double x)
    {
        double b =  Math.asin(x);

        return b ;
    }
    static double cosine (double y)
    {

       double a = Math.acos(y);
        return a ;
    }

    public static void main(String[] args) {
      double i= sin  (1) ;
      double j= cosine(1) ;
      System.out.println(i);
      System.out.println(j);

    }
    }





