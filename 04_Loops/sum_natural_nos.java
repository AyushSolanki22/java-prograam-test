import java.util.*;

public class sum_natural_nos {
    public static void main(String[] args) {
        int i=1;
        int sum =0;
        System.out.println("@Sum of First n natural nos.\n");
        System.out.print("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        while (i<=n) {
            sum+=i;
            ++i;
        }
        System.out.println("Sum of first n natural numbers from 1 to "+n+" is : "+sum);


    }
}