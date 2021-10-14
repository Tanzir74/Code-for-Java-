package com.company;
class myThreadRunable implements Runnable{
    public void run(){
        System.out.println("i am a threard 1 not a thread 1");
    }
}
class myThreadRunable2 implements Runnable{
    public void run(){
        System.out.println("i am a threard 2 not a thread 2");
    }
}

public class Creating_a_Java_ThreadUsingRunnableInterface {
    public static void main(String[] args) {
        myThreadRunable bullet1 = new myThreadRunable();
        Thread gun1= new Thread(bullet1);

        myThreadRunable bullet2 = new myThreadRunable();
        Thread gun2=new Thread(bullet2);
        gun2.start();
        gun1.start();
    }
}
