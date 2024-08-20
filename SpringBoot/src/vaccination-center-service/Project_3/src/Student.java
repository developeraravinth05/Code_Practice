public class Student {
    public static void main(String[] args) {
        Student student=new Student();
        System.out.println(student);
        System.out.println(student.age);
        System.out.println(student.id);
    }
private int id;
private int age;

//Student(){
//}

Student(int ids,int ages){
    this.id=ids;
    this.age=ages;

}

    Student(){
        this.id=5;
        this.age=6;

    }

}
