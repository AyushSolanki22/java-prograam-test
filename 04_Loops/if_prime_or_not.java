import java.util.*;

public class if_prime_or_not {
    public static void main(String[] args) {
        boolean Isprime=true;
        Scanner sc = new Scanner(System.in);
        System.out.println("@Check- whether a number is prime or not\n");
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        for (int i=2; i<=Math.sqrt(n); ++i ) {
            if (n%i==0) {
                Isprime=false;
               }       }    
        if (Isprime==true) {
            System.out.println("The Entered number is a prime number.");

        }
        else {
            System.out.println("The Entered number is not a prime number.");
        }
    }
}