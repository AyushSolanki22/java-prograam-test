public class inheritance {
    public static void main(String[] args) {
        Fish shark=new Fish();
        shark.swim(); 
    }    
}
//base class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }
    void breathe() {
        System.out.println("breathe");
    }
}
//derived class
class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("swims in water");
    }
}
// class Fishaa extends Animal {
//     int fins;

//     void swim() {
//         System.out.println("swimsss in water");
//     }
// }


//Four types of inheritance: single level, multi level, heirarchial inheritance, hybrid inheritance
//there is also one type of imheritance too: multiple inheritance (though not directly possible/available in java, indirectly possible through interfaces)