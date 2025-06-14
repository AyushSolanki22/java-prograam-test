public class selection_sort {
    public static void selSort(int num[]) {
        int n=num.length;
        int currMin=0;
        int minNum=Integer.MAX_VALUE;
        
        for (int i=0; i<n; ++i) {
            for (int j=i; j<n; ++j) {
                 currMin=num[j];
                 minNum=currMin<minNum? currMin:minNum;
                 index=currMin<minNum? j:0;
            }
            num[i]=minNum;

        }

    }
    public static void main(String[] args) {
        int num[]={5,4,1,3,2};

        selSort(num);
    }
}
