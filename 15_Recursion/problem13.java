//Friends Pairing Problem
public class problem13 {
    public static int friendsParing(int n) {
        if (n==1||n==2){
            return n;
        }
        // //choice
        // //single
        // int fnm1=friendsParing(n);

        // //pair
        // int fnm2=friendsParing(n-2);
        // int pairWays=(n-1)*fnm2;   //pair choices*1 pair way

        // //totWays
        // int totWays=fnm1+pairWays;
        // return totWays;

        return friendsParing(n-1)+(n-1)*friendsParing(n-2);
    }

    public static void main(String[] args) {
        
    }
}
