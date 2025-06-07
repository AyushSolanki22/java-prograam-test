// primes in range --
import java.util.*;
public class primes_in_range {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        primes(n);
    }
    public static void primes(int n) {
        for (int i=2; i<=n; ++i) {
            if (isPrime(i)==true) {
                System.out.print(i+" ");
            } 
            
        }
        System.out.println("\nAll the printed numbers are prime numbers.");

        
    }
    public static boolean isPrime(int n) {
    for (int i=2; i<=(n-1); ++i) {    // or to optimise , i<=math.sqrt(n)
        if (n%i==0) {
            return false;
        }

    }
    return true;
    
    }
}