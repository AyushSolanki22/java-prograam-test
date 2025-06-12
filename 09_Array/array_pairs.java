public class array_pairs {
    public static void printPairs(int num[]) {
        int tp=0;
        for (int i=0; i<num.length; ++i) {           //2,4,6,8,10
            for (int j=i+1; j<num.length; ++j) {     //4,6,8,10 for i=2
                System.out.print("("+num[i]+","+ num[j]+") ");
                tp++;
            }
            System.out.println();

        }
        System.out.println("Total pairs: "+tp);   //tp = (n(n-1))/2 -- sum of n numbers.
    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,10,12};

        printPairs(num);
         
    }    
}
