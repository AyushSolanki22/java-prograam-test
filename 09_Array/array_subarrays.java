
//Print subarrays;  --> = (n(n+1))/2
public class array_subarrays {
    public static void subArrays(int num[]) {
        //Three level of loops required: start- for(i to n), end- for(i+1 to n), subAr- for(start to end) 
        int ts=0;
        for (int i=0; i<num.length; ++i) {     //start--> i to n
            for(int j=i; j<num.length; ++j) {  //end--> j=i to n
                for (int k=i; k<=j; ++k) {     //start to end -- all numbers printed --> i to j;
                    System.out.print(num[k]+" ");       //subArray
                }
                
                ++ts;
                System.out.print("    ");
        }
        System.out.println();
    }
    System.out.println("Total subArrays: "+ts);
    
}
    public static void main(String[] args) {
        int num[]={1,2,3,4,5,6};

        subArrays(num);
    }    
}
