public class power {
    public static int pow(int x,int n) {
        if (n==1){
            return x;
        }
        int power=x*pow(x,n-1);
        return power;
    }
    //optimized;
    //time complexity = 0(logn)
    public static int optimizedPow(int x,int n) {
        if (n==1){
            return x;
        }
        int HalfPower=optimizedPow(x, n/2); //this, to have 0(logn) time complexity;
        int HalfPowerSq=HalfPower*HalfPower;
        
        //if n is odd,             (additional)
        if (n%2!=0){
            HalfPowerSq=x*HalfPowerSq;
        }
        return HalfPowerSq;
    }
    public static void main(String[] args) {
        int x=2;
        int n=10;
        System.out.println(pow(x, n));
        System.out.println(optimizedPow(x, n));

    }
}
