package com.company;
class Base
{
    int x ;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    class derived extends Base{
        int y ;

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }

    public void printme()
    {
        System.out.println("I am a constructor ");
    }

}


public class OOP_inharitence
{
    public static void main(String[] args) {
        Base b= new Base() ;
       b.setX(4);
       

    }
}
