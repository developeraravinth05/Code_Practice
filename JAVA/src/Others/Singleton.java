package Others;

public class Singleton {
    public static void main(String[] args) {
        // Get the singleton instance
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        // Print hash codes to check if both references point to the same object
        System.out.println("Hashcode of singleton1: " + singleton1.hashCode());
        System.out.println("Hashcode of singleton2: " + singleton2.hashCode());

        // Check reference equality
        if (singleton1 == singleton2) {
            System.out.println("Both references point to the same singleton instance.");
        } else {
            System.out.println("The references point to different instances.");
        }
    }

    private static class SingletonHelper {
        private static final Singleton INSTANCE = new Singleton();
    }

    private Singleton() {}

    public static Singleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
