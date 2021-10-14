package com.company;
class Shape {
    int length;
    int breadth;

    public Shape(int length){
        this.length = length;
    }

    public Shape(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public int Calculate_area(int length){
        int calculated_area;
        calculated_area = length * length;
        return calculated_area;
    }
    public int Calculate_area(int length, int breadth){
        int calculated_area;
        calculated_area = length * breadth;
        return calculated_area;
    }
    public int Calculate_perimeter(int length){
        int Calculate_perimeter;
        Calculate_perimeter = length * 4;
        return Calculate_perimeter;
    }
    public int Calculate_perimeter(int length, int breadth){
        int Calculate_perimeter;
        Calculate_perimeter = 2*(length * breadth);
        return Calculate_perimeter;
    }
}


public class Question2 {
    public static void main(String[] args) {
        int id=201002030;
        int length;
        int breadth;
        int perameter;
        int rperameter;
        int calculated_area;
        int rcalculated_area;
        length = (id%20) + 5;
        breadth= (id%10 )+ 3;
        Shape Rectangle = new Shape( length,breadth);
        Shape Square = new Shape(length);
        rperameter = Rectangle.Calculate_perimeter(length,breadth);
        rcalculated_area = Rectangle.Calculate_area(length,breadth);
        perameter = Square.Calculate_perimeter(length);
        calculated_area = Square.Calculate_area(length);
        System.out.println(rcalculated_area);
        System.out.println(rperameter);
        System.out.println(perameter);
        System.out.println(calculated_area);
    }
}

