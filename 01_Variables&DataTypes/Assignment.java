//quesion 5: incorrect ,, variable name can also start with $;
import java.util.*;
public class Assignment {
    public static void question1() {
        Scanner sc=new Scanner(System.in);
        int num[]=new int[3];
        for (int i=1; i<=3; ++i) {
            System.out.print("Enter number "+i+": ");
            num[i-1]=sc.nextInt();
        }
        System.out.println("Average of 3 numbers: "+(num[0]+num[1]+num[2])/3);
    }
    public static void question2() {
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter side of square: ");
        int side=sc.nextInt();
        System.out.println("Area of square: "+(side*side));
    }
    public static void question3() {
        Scanner sc=new Scanner(System.in);
        int totCost=0;
        for (int i=0; i<3; ++i) {
            System.out.print("Enter cost of item "+(i+1)+": ");
            float cost=sc.nextFloat();
            totCost+=cost;
        }
        System.out.println("Total cost: "+totCost);

        //Add-on with 18% GST;
        System.out.println("Total cost of items including 18% GST Tax: "+((0.18*totCost)+totCost));
    }
    public static void question4() {
        byte b=4;
        char c='a';        //Ques: Result of which datatype 
        short s=512;       //Hint:look at the largest datatype among these
        int i=1000;
        float f=3.14f;//Implicit Typecasting: computer automatically convert result into biggest datatype involved in calcutation.
        double d=99.9954;
        double result=(f*b)+(i%c)-(d*s);
        System.out.println("Result: "+result);


    }
    
    public static void main(String[] args) {
        question1();
        question2();
        question3();
        question4();
    }

}
