package Multithreading;

import java.sql.Timestamp;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("THREAD 1");
        System.out.println(Thread.currentThread().getName());
        System.out.println(new Timestamp(System.currentTimeMillis()));
        Thread.sleep(3000);
        System.out.println("Thread 2");
        System.out.println(new Timestamp(System.currentTimeMillis()));
    }
}
