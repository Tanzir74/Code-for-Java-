package com.company;
class sem1{
    double GPA_S1(){
        double gpa_1;
        return gpa_1=4;
    }
}
class sem2 extends sem1{

     double GPA_S2(){
         double gpa_2;
        return gpa_2=3;
    }
}
class sem3 extends sem2{

    double GPA_S3(){
        double gpa_3;
        return gpa_3=6;
    }
   Double SGPA( double gpa_1,double gpa_2,double gpa_3){
        double avg_gpa;
        return avg_gpa=(gpa_1+gpa_2+gpa_3)/3 ;
    }
}

public class Oop__Midtrm_assignment_question1 {
    public static void main(String[] args) {
        sem3 a= new sem3();
        System.out.println(a.SGPA(a.GPA_S1(),a.GPA_S2(),a.GPA_S3()));

    }
}

