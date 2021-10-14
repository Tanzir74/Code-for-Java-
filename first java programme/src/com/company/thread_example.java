package com.company;

class MyThread1 extends Thread{
    @Override
    public void run(){
        int i =0;
        while(i<4){
            System.out.println("My  Thread is Running");
            System.out.println("I am happy!");
            i++;
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        int i =0;
        while(i<4){
            System.out.println("Thread 2 is  for Chatting ");
            System.out.println("I am sad!");
            i++;
        }
    }
}
public class thread_example {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();


    }
}
