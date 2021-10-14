package com.company;
class Employee{
    int salary ;
    String name ;
    public int getSalary()
    {
        return salary ;
    }
    public String getname()
    {
        return name ;
    }
    public void  setname (String n)
    {
          name= n;
    }
}
class cellphone{
    public void ring()
    {
        System.out.println("ringing....");
    }
    public  void vibrate()
    {
        System.out.println("vibrating....");
    }
    public  void callfrnd()
    {
        System.out.println("calling prince ");
    }
}
class square{
    int side;
    public int area()
    {
        return side*side ;
    }
    public int perimeter(){
        return 4*side ;
    }
}
class tommy
{
    public void hit()
    {
        System.out.println("hitting the enemy");
    }
    public void fire()
    {
        System.out.println("firing the enemy");
    }
}

public class OOP_Class_type_practice {
    public static void main(String[] args) {
      /*  //problem 1
        Employee tanzir =new Employee() ;
        tanzir.setname("Tanzir Ahmed");
         tanzir.salary =233 ;
        System.out.println(tanzir.getSalary());
        System.out.println(tanzir.getname());
        //problem 2
        cellphone asus=new cellphone();
        asus.callfrnd();
        asus.ring();
        asus.vibrate();
       */
/*
//problem3

        square sq= new square() ;
        sq.side=3 ;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());



 */
        tommy player1 = new tommy() ;
                player1.hit();
        player1.fire();


    }
}
