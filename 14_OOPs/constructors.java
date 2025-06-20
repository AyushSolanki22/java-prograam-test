public class constructors {
    public static void main(String[] args) {
        //constructor overloading -- when a programme do assign & work on passing given value itself to different constructors based on having difference in values automatically.--- polymorphism
        Student s1=new Student(); 
        Student s2=new Student("Ayush");
        Student s3=new Student(20);
        System.out.println(s2.name);
    }
}
class Student {
    String name;
    int roll; 
    String password;

    Student() {    // -- non-parameterized constructor
        System.out.println("constructor is called");
    }

    Student(String name) {  //--parameterized constructor
        this.name=name;
    }
    Student(int roll) {
        this.roll=roll;
    }
    
}
//3 types of constructors: parametrized , non-parametrized & copy constructor.