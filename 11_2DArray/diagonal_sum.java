public class diagonal_sum {
    public static void diagonalSum(int m[][]) {
        int diag_sum=0;
        int sr=0,sc=3;
        for (int i=0; i<m.length; ++i) {
            for (int j=0; j<m[0].length; ++j) {
                if (i==j) {
                    diag_sum+=m[i][j];
                }
                if (i==sr && j==sc) {
                    diag_sum+=m[i][j];
                }
            }
            sr++;
            sc--;

        }
        System.out.println("Diagonal sum: "+diag_sum);
    }
    public static void diag_sum_2(int m[][]) {
        //optimised approach,, time complexity-0(n)
        int sum=0;
        for (int i=0; i<m.length; ++i) {
            //pd
            sum+=m[i][i];
            //sd
            if (i+(m.length-i-1)==m.length-1) {   //i+j=n-1 -- sd trick
                sum+=m[i][m.length-i-1];
            }
            
        }
        System.out.println("sum: "+sum);
    }


    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        
        diagonalSum(matrix);
        diag_sum_2(matrix);
        
    }
}
