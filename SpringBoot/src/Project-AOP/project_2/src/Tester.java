public class Tester {

    public static void main(String[] args) {

        Base base = new Dervied();
    base.method(39);
    }
}
class Base{
    public static void method(int a){
        System.out.println("Bas");
    }

}

class Dervied extends Base{
    public static void method(int a){
        System.out.println("der");
    }
}
