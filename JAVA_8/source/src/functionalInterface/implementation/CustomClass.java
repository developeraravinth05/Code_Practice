package functionalInterface.implementation;

public class CustomClass{


    public static void main(String[] args) {

    CustomClass customClass=new CustomClass();
    customClass.customInterface.show();


    //lambda
        CustomInterface customInterface1=()->System.out.println("ddd");
            customInterface1.show();

           int multiply= customInterface1.multiply(4,4) ;
        System.out.println(multiply);



    }
        CustomInterface customInterface= new CustomInterface() {
            @Override
            public void show() {
                System.out.println("ss");

            }

        };




}

