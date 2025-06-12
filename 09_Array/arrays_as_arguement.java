// Way 1-- pass by value (Any changes within function wouldn't be reflected to main function)
// Way 2-- by reference. 

// Passing arrays as arguement -- is by reference method.   


public class arrays_as_arguement {
    public static void update(int marks[], int nonChangeable) {
        //adding bonus marks to subject if marks in range of b/w 27 & 32
        nonChangeable=10;
        for (int i=0; i<marks.length; ++i) {
            if (marks[i]>=27 && marks[i]<=33) {
                marks[i]+=5;
            }
            else {
                continue;
            }

        }
    }
    public static void main(String[] args) {
        int marks[]={28,31,91};
        int nonChangeable=5;
        update(marks,nonChangeable);

        System.out.println(nonChangeable);    //Call by value 
        //print our marks
        for (int i=0; i<marks.length; ++i ) {
            System.out.print(marks[i]+" ");    //Proof: Call by reference
        }
        
    }    
}
