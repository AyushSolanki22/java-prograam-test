import java.util.Scanner;
//q1: already done a question like this;
//q2: done
//q3,q5: don't know how to do .. q3: palindrome_assignment
//q4: done

public class assignment {
    public static boolean  isEven(int n) {
        //ques1
        if (n%2==0) {
            return true;
        }
        return false;    
    }
    public static void ques5() {
        //sum of digits of a number;
        int digits_sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        while (n>0) {
            int last_digit=n%10;
            digits_sum+=last_digit;
            n/=10;
        }
        System.out.println("Sum of digits of a number: "+digits_sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        System.out.println(isEven(n));

        ques5();
    }
}
// Q1,Q2,Q4 -- correct