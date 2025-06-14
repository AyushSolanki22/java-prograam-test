//q1, q3 done
//ques2,q4: not understable, not expected answer as after completing, question not understandable
public class assignment {
    public static boolean ques1(int a[]) {
        for (int i=0; i<a.length; ++i) {
            int temp=a[i];
            for (int j=i+1; j<a.length; ++j) {
                if (a[j]==temp) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void ques3(int p[]) {
        int temp=0;
        int buyprice=Integer.MAX_VALUE;
        int maxpr=Integer.MIN_VALUE;
        for (int i=0; i<p.length; ++i) {
            if (p[i]<buyprice) {
                buyprice=p[i];
            }
            temp=p[i]-buyprice;
            maxpr=temp>maxpr? temp:maxpr;
        }
        System.out.println("Maximum profit= "+maxpr);

    }
    public static void ques4(int h[]) {
        //leftMax
        int n=h.length;
        int leftMax[]=new int[n];
        leftMax[0]=h[0];
        for (int i =1; i<n; ++i) {
            if (i>0) {
             leftMax[i]=Math.max(h[i],leftMax[i-1]);
            }
        }

        //rightMax
        int rightMax[]=new int[n];
        rightMax[0]=h[0];
        for (int i =n-2; i>0; --i) {
            if (i>0) {
             rightMax[i]=Math.max(h[i],rightMax[i-1]);
            }
        }

        //
        int tr=0;
        int w=0;
        for (int i = 0; i < n; ++i) {
            if (i==0 || i==n-1) {
                w=0;
            }
            else {
                w=Math.min(leftMax[i],rightMax[i]);
            }
            tr+=(w-h[i])*1;
        }
        System.out.println("Trapped Rainwater: "+tr);
    }

    public static void main(String[] args) {
        System.out.println("True - if any value appears at least twice. False- if every element distinct");
        int array1[]={ 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        System.out.println(ques1(array1));
        int array2[] = {1, 2, 3, 4};
        System.out.println(ques1(array2));

        
        //ques3
        int prices[]={7,1,5,3,6,4};
        ques3(prices);

        //ques4
        int height[]={ 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        ques4(height);

    }
}
