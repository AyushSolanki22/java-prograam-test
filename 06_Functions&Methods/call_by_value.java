public class call_by_value {
    public static void swap(int a,int b) {
        int temp=a;
        a=b;
        b=temp;
        System.out.println("Value of a after swap: "+a);
        System.out.println("Value of b after swap: "+b);

    }

    public static void main(String[] args) {
        //@swap -- values exchange
        int a = 5;
        int b = 10;
        System.out.println("Value of a before swap: "+a);
        System.out.println("Value of b before swap: "+b);
        swap(a,b);



    }
}