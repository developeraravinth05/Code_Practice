package Others;

// Define a class that implements the Runnable interface
public class AnonymousInnerClass {
//public class AnonymousInnerClass implements Runnable {

    // Main method to demonstrate usage
    public static void main(String[] args) {
        // Creating an instance of AnonymousInnerClass (named class)
        AnonymousInnerClass anonymousInnerClass = new AnonymousInnerClass();

        // Calling the run() method of AnonymousInnerClass instance
//        anonymousInnerClass.run();
//
//        // Using a lambda expression for Runnable
//        Runnable r = () -> {
//            System.out.println("Lambda expression implementation");

      anonymousInnerClass.r.run();
    }



    Runnable r = new Runnable() {
        @Override
        public void run() {
            System.out.println("Anonymous inner class implementation");
        }
    };
//
//        // Using the instance to execute the run() method of the lambda expression
//        r.run(); // This will print: "Lambda expression implementation"
//    }
//
//    @Override
//    public void run() {
//        System.out.println("Thread");
//    }
}
