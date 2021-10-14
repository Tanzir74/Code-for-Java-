package com.company;

import java.util.Scanner;

class Myemployee
{
    private int id ;
   private String name ;
   public  String getName()
   {
       return name ;
   }
   public void setName(String n)
   {
       name=n ;
   }
   public void setId(int i)
   {
       id=i ;
   }
   public int getId()
   {
       return id ;
   }
}
public class OOP_CWH_access_modifier_getter_setter {
    public static void main(String[] args) {
    Myemployee Tanzir  = new Myemployee();
        Scanner sc= new Scanner(System.in) ;
              String n= sc.nextLine() ;
    Tanzir.setName(n);
        System.out.println(Tanzir.getName());
    }

}
