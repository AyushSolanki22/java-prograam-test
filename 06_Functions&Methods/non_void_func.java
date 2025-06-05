// function using parameters , return statment use (non-void function);
import java.util.Scanner;

public class non_void_func {
    public static int calculateSum(int a,int b) {  //parameters or formal parameters -- values that a function takes as a input.(during function definition)
        int sum =a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a=sc.nextInt();
        System.out.print("Enter number 2: ");
        int b=sc.nextInt();
        int sum = calculateSum(a,b); //arguments or actual parameters -- values that are passed to function
        //sum dono different diff functions mai hai toa koi prob. nahi
        System.out.println("Calculated sum: "+sum);


    }
}