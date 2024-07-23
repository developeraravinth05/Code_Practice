package Multithreading;

public class ThreadClass extends Thread{
@Override

    public void run() {

        for (int i = 0; i <5 ; i++) {
            System.out.println("child thread is executed");
            System.out.println("i am :"  + ThreadClass.currentThread().getName());
            System.out.println("i am :"  + ThreadClass.currentThread().getPriority());
        }

    }
}
