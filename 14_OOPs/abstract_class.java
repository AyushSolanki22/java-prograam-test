//real life use of abstract class in java.
public class abstract_class {
    public static void main(String[] args) {
        //Note : remember, we can't create animals object;
        // Animals ar=new Animals(); //error
        Horse h=new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color); //as it hasn't changed color, it would show default.as using child class object always parent class's constructors are used firstly.(inheritance heirarchy) 
        //as constructor initialise variables too every time whenever child class object is called/used.(work)
        //example 
        Third f=new Third();   


        Chicken c=new Chicken();
        c.eat();
        c.walk();
        c.changeColor();
        System.out.println(c.color);
    }    
}
//Abstract class  
// -- cannot create an instance of abstract class.
// -- can have abstract/non-abstract methods(functions).
// can have constrcutors.   -- is odd as can't create object but can create constrcutors.
abstract class Animals {
    String color;
    Animals(){   //constructor , by default, this construction would be always implemented whenever a derived class is called/used.(default)-- for eg. horse default color would be brown unless until changeColor function is called.
        color="brown";
    }

    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();  //as abstract thing doesn't have implementation (idea only).-- walk here doesn't have implementation in animals, it's subclasses can.

}
class Horse extends Animals {
    void changeColor(){
        color="dark brown";
    }
    //The type Horse must implement the inherited abstract method Animal.walk();
    void walk() {
         System.out.println("walks on 4 legs");
    } 
}
class Chicken extends Animals {
    void changeColor(){
        color="yellow";
    }

    void walk() {
        System.out.println("walks on 2 legs");
    }
}
class First{
    First() {
        System.out.println("1st called");
    }
}
class Second extends First {
    Second () {
        System.out.println("2nd called");
    }
}
class Third extends Second {
    Third(){
        System.out.println("3rd called");
    }
}

