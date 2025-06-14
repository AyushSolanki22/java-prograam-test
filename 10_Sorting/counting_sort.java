//It  is usually used when the numbers aren't that much big' - if range(max-min) is small
//we make count array in for this.-  counting freq. of numbers.

//time complexity=0(n+range)
public class counting_sort {
    public static void countingSort(int a[]) {
        int largest=Integer.MIN_VALUE;
        // int smallest=Integer.MAX_VALUE;
        for (int i=0; i<a.length; ++i) {        //to know range ;;
            largest=Math.max(largest, a[i]);
            // smallest=Math.min(smallest,a[i]);
        }
        //making count array -- having frequencies of all numbers(indexes of a)
        int count[]=new int[largest+1];
        for (int i=0; i<a.length; ++i) {
            count[a[i]]++;
        }
        
        //sorting
        int j=0; //for index of arr[]
        for(int i=0; i<count.length; ++i) {  //iterating through count array.
            while (count[i]>0) {
                a[j]=i;
                j++;
                count[i]--;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i ]);
        }


    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};

        countingSort(arr);
    }

}
