package com.company;

class Thread1 extends Thread {

    public  void rum(){
        for (int i=1;i<=3;i++)
        {
            System.out.println(Thread.currentThread().getId());
            System.out.println(i);
            try{
                Thread.sleep(2000);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}



public class qs1 {
    public static void main(String[] args) {
Thread1 ob1= new Thread1();
Thread1 ob2= new Thread1();
Thread t1= new Thread(ob1);
Thread t2= new Thread(ob2);
t1.start();
t2.start();
    }
}
