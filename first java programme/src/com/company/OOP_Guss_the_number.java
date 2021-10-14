package com.company;


/*Create a class Game, which allows a user to play "Guess the Number" game once.

1.Game should have the following methods:
2.Constructor to generate the random number
3.takeUserInput() to take a user input of number
4.isCorrectNumber() to detect whether the number entered by the user is true
5.getter and setter for noOfGuesses
6. Use properties such as noOfGuesses(int), etc to get this task done!

 */


import java.util.Random;
import java.util.Scanner;

class Game
{

    public int number ;
    public int numberofguss=0;
    public int inputnumber ;

    public int getNumberofguss()
    {
        return numberofguss;
    }

    public void setNumberofguss(int numberofguss) {
        this.numberofguss = numberofguss;
    }

    Game(){
        Random rand =new Random();
        this.number=rand.nextInt(100);
    }
    void takeuserinput()
    {
        System.out.println("Guss the  number ");
        Scanner sc= new Scanner(System.in) ;
                inputnumber= sc.nextInt();

    }
    boolean iscorrectnumber()
    {
        numberofguss ++ ;
        if (inputnumber==number)
        {
            System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", number, numberofguss);
            return true ;
        }

        else if(inputnumber>number)
        {
            System.out.println("Too high.....");
        }
        else if(inputnumber<number)
        {
            System.out.println("Too low.....");
        }
        return false;


    }
}

public class OOP_Guss_the_number {
    public static void main(String[] args) {
        boolean b = false;

            Game g = new Game();
        while (!b)
        {
            g.takeuserinput();
            b = g.iscorrectnumber() ;


        }
    }
}
