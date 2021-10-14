package com.company;

class Employee1 {
    int id;
    String name ;
    int salary ;
    public  void printdetails()
    {
        System.out.println("My id is "+ id);
        System.out.println("and my name is "+name);
        System.out.printf("My salary -%d k", salary);
    }
}
public class CHW_custom_class {
    public static void main(String[] args) {
        System.out.println("this is our custom class ");
        Employee1 tanzir = new Employee1(); // instantiationg a new employee objs
        Employee1 prince = new Employee1() ;
        //setting attributes
        tanzir.name= "Tanzir Ahmed Shaon";
        tanzir.id= 12 ;
        tanzir.salary = 20 ;

        prince.name ="Samsurjaman prince ";
        prince.id= 17 ;
        prince.salary=19 ;
        //printing the properties
        tanzir.printdetails();
        prince.printdetails();
    }
}
