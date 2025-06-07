import java.util.*;

public class hollow_rectangular {
    public static void pattern(int totRows,int totCols) {
        for (int i=1; i<=totRows; ++i) {
            for (int j=1; j<=totCols;++j ) {
                if (i==1||i==totRows||j==1||j==totCols) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");

                }
            
            }
            System.out.println();

         }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows to be printed: ");
        int r=sc.nextInt();
        System.out.print("Enter number of rows to be printed: ");
        int c=sc.nextInt();        

        pattern(r,c);
    }
}