//My answers
//question 1: 2 times
//question 2: Mine was also fully correct but line 20, while loop is added after analyse of solutions
//for more optimistic better programme.
//question 5: i out of local scope can't be printed.
import java.util.*;
public class Assignment {
    public static void ques2() {
        //input set of integers, & give even &odd integers' sum.
        int evensum=0;
        int oddsum =0;
        int will=1;
        Scanner sc=new Scanner(System.in);
        while (will==1) {
            System.out.print("Enter number: ");
            int a=sc.nextInt();
            if (a%2==0) {
                evensum+=a;
            }
            else {
                oddsum+=a;
            }
             System.out.print("Do you want to continue? Press 1 for yes or 0 for no");
             will=sc.nextInt();
        }
        System.out.println("Even integer's sum: "+evensum);
        System.out.println("Odd Integer's sum: "+oddsum);
            
        }
    public static void ques3() {
        //factorial of number;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        int fact=1;
        for (int i=n; i>=1; --i) {
            fact*=i;
        }
        System.out.println("Factorial: "+fact);
    }
    public static void ques4() {
        //Multiplication tabel of N;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number N: ");
        int n=sc.nextInt();
        for (int i=1; i<=10; ++i) {
            System.out.println(n+"*"+i+"= "+(n*i));
        }
        System.out.println("Table of "+n+" printed");

    }
    public static void main(String[] args) {
        ques2();
        ques3();
        ques4();
    }
    
}
//Q1,Q2,Q3,Q4,Q5 -- correct