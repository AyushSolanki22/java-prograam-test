

import java.util.*;

public class continue_keyword {
    public static void main(String[] args) {
        //continue keyword  --> used to skip the iteration.
        for (int i=1; i<=5; ++i) {
            if (i==3) {
                continue;
            }
            System.out.println(i);
        }

        // keep printing number except when the user enters a multiple of 10;
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.print("Enter number: ");
            int num=sc.nextInt();
            if (num%10==0) {
                continue;
            }
            System.out.println("Number you entered: "+num);

        }
 
        
        
        
    }
}