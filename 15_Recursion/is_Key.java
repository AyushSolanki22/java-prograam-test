public class is_Key {
    public static int  isKey(int a[],int key,int i) {
        if (i==a.length){
            return -1;
        }    
        if (a[i]==key){
            return i;
        }
        return isKey(a, key, i+1);

    }
    public static void main(String[] args) {
        int a[]={8,3,6,9,5,10,2,5,3};
        int key=5;
        int i=0;

        System.out.println(isKey(a, key, i));
    }
}
