public class selection_sort {
    public static void selSort(int num[]) {
        int n=num.length;
        int currMin=0;
        for (int i=0; i<n-1; ++i) {
            int minNum=Integer.MAX_VALUE;  //minNum value is to be resetted every time;***###
            int index=0;    
            for (int j=i+1; j<n; ++j) {  //unsorted array-start --> i+1
                 currMin=num[j];
                 if (currMin<minNum) {
                    index=j;
                    minNum=currMin;
                 }
            }
            int temp=num[i];
            num[i]=minNum;
            num[index]=temp;

        }

    }
    public static void main(String[] args) {
        int num[]={5,4,1,3,2};

        selSort(num);
        for (int i=0; i<num.length; ++i) {
            System.out.println(num[i]);
        }
    }
}
