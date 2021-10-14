package com.company;
class point {

    void getXY(Double x, Double y) {

    }
}

class getPoint extends point{


    double getA(int x1, int y1 ){

        return x1 ;
    }
    double getB(int x2, int y2){
        return x2;
    }
    double getC(int x3, int y3){
        return x3;

    }
    static double distance(int x1, int y1, int x2, int y2)
    {

        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) * 1.0);
    }




    }


public class question_1 {
    public static void main(String[] args) {
        getPoint obj= new getPoint();
        Double a= obj.getA(2,3);
        Double b= obj.getB(3,4);
        Double c= obj.getC(4,5);
        Double disab = Math.sqrt(Math.pow(4 - 2, 2) + Math.pow(5 - 3, 2) * 1.0);
        Double disbc = Math.sqrt(Math.pow(4 - 3, 2) + Math.pow(5 - 4, 2) * 1.0);
        Double disca = Math.sqrt(Math.pow(4 - 2, 2) + Math.pow(5 - 3 , 2) * 1.0);
        Double sum= disab+disbc+disca;
        System.out.println(sum);


    }
}
