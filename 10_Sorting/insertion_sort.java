

public class insertion_sort {
    public static void insertionSort(int arr[]) {
        int n=arr.length;
        for (int i=1; i<n; ++i) {
            int cur=i;
            for (int j=i-1; j>=0; --j) {
                if (arr[j]>arr[cur] ) {
                    int temp=arr[cur];
                    arr[cur]=arr[j];
                    arr[j]=temp;
                }
                --cur;
          }
        }
        // Arrays.sort(arr);
        for (int i = 0; i <n; i++) {
         System.out.println(arr[i]);   
        }
    
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        
        insertionSort(arr);
    }
}
