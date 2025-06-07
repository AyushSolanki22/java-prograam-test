import java.util.*;
public class floyds_triangle {
    public static void main(String[] args) {
        System.out.print("Enter no. of lines: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=1;
        for (int i=1; i<=n; ++i ) {
            for (int j=1; j<=i;++j) {
                System.out.print(num+" ");
                ++num;
            }
        System.out.println();
        }
    }
}