package Others;

import java.util.LinkedList;

public class SingletonDesignPattern {
    public static void main(String[] args) {
        SingletonDesignPattern singletonDesignPattern=SingletonDesignPattern.getInstance();
        System.out.println( singletonDesignPattern.hashCode());

    }

private static   SingletonDesignPattern single_Instance= null;

    private  SingletonDesignPattern() {
    }


    public synchronized static SingletonDesignPattern getInstance(){

    if (single_Instance==null) {
        single_Instance = new SingletonDesignPattern();
    }
            return single_Instance;

    }
}
