public class call_by_value {
    public static void swap(int a,int b) {
        int temp=a;
        a=b;
        b=temp;
        System.out.println("Value of a after swap(within function): "+a); //The swapped values remain within function swap only.
        System.out.println("Value of b after swap(within function): "+b); //As java always calls by value
        //Function taking input the values (copy) and the changes made to it would be within the func only.
        //Java mai hamesha eek value ki original nhi copy pass hoti hai - call by value feature
        //difference in call by value (java), call by reference (c++)
    }

    public static void main(String[] args) {
        //@swap -- values exchange
        int a = 5;
        int b = 10;
        System.out.println("Value of a before swap: "+a);
        System.out.println("Value of b before swap: "+b);
        swap(a,b);
        System.out.println("Value of a after swap(outside function): "+a); //The swapped values remain within function swap only.
        System.out.println("Value of b after swap(outside function): "+b); 



    }
}