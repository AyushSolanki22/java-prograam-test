import java.util.*;
public class _2D_Array {
    //search feature;
    public static boolean search(int m[][],int key) {
        for (int i=0; i<m.length; ++i) {
            for (int j=0; j<m[0].length; ++j) {
                if (m[i][j]==key) {
                    System.out.println("found at cell ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.err.println("key not found");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][]=new int[3][3];  //just two double square brackets are used in this. //cells=3*3=9.
        int n=matrix.length,m=matrix[0].length;

        //input
        Scanner sc=new Scanner(System.in);
        //we take input row-wise firstly and then column wise.-- standard
        for (int i=0; i<n; ++i) {
            for (int j=0; j<m; ++j) {
                matrix[i][j]=sc.nextInt();
            }
        }

        //output
        for (int i=0; i<n; ++i) {
            for (int j=0; j<m; ++j) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        //search
        search(matrix,1);
        
    }
}
