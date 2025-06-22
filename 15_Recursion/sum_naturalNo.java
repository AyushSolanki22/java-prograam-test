
public class sum_naturalNo {
    public static int sumNos(int n) {
        if (n==1){
            return 1;
        }
        int sum=n+sumNos(n-1);
        return sum;
    }
    public static void main(String[] args) {
        int n=10;

        System.out.println(sumNos(n));
    }
}
