import java.util.*;
public class inverted_half_pyramid_with_nos {
    public static void main(String[] args) {
        System.out.print("Enter no. of lines: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=1; i<=n; ++i ) {
            for (int j=1; j<=(n+1)-i; ++j) {
                System.out.print(j);
            }

        System.out.println();
        }
    }
}