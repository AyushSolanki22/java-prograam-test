

public class largestNo {
    public static int largestNo(int num[]) {
        int l=Integer.MIN_VALUE;  //Important Function
        int s=Integer.MAX_VALUE;
        for (int i=0; i<num.length; ++i) {
            if (num[i]>l) {
                l=num[i];
            }
            if (num[i]<s) {
                s=num[i];
                
            }
            
        }
        System.out.println("Smallest Number in Array: "+s);
        return l;
        
    }
    public static void main(String[] args) {
        int num[]= {2,4,6,8,10,18,14,16};
        int l=largestNo(num);

        System.out.println("Largest Number in Array: "+l);
    }    
}
