package Multithreading;

public class ThreadClassR implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <1005 ; i++) {
            System.out.println("is this deamon thread"+ThreadClass.currentThread().isDaemon());
            System.out.println("child");
            System.out.println("is this deamon thread"+ThreadClass.currentThread().isDaemon());
        }
    }
}
