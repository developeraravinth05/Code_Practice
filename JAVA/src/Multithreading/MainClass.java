package Multithreading;

public class MainClass {

    public static void main(String[] args) {

        ThreadClassR threadClassR = new ThreadClassR();
        Thread thread = new Thread(threadClassR);
        thread.setDaemon(true);
        thread.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("I am Main Thread");
        }
        ThreadClass threadClass = new ThreadClass();
        threadClass.setPriority(10);
        threadClass.start();
    }
}
