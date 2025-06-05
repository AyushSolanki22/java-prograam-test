// Keep entering number untill user enters a multiple of 10;
import java.util.*;

public class break_keyword {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true) { 
         System.out.print("Enter your number: ");
         int num=sc.nextInt();
         if (num%10 ==0) {
            break;  //--> used to break the loop / to come out of the loop.
         }
         System.out.println(num);
        
        }

        
    }
}