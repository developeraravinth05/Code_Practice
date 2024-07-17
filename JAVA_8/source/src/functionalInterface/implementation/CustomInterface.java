package functionalInterface.implementation;

@FunctionalInterface
public interface CustomInterface {

void show();


    default int multiply(int a,int b) {
     return a*b;
    }
}
