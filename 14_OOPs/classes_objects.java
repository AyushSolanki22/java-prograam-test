public class classes_objects {
    public static void main(String[] args) {
        //Pen ko actual banane ke liye public class mai constructor ke through  (P)
        Pen p1=new Pen();//created a pen object called p1  //creating space in memory to store all properties of the class
        //Even if we haven't created a constructor, java would automatically create it.
        //But, by default, java creates constructor only when there is no other one.
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(10);
        System.out.println(p1.tip);
    }
}
public class Pen {
    //properties+functions
    String color="red";
    int tip;

    void setColor(String newColor) {
        color=newColor;
    }
    void setTip(int newTip) {
        tip=newTip; 
    }
}
