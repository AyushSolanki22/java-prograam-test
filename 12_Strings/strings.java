import java.util.*;
public class strings {
    public static void printLetters(String f) {
        int i=0;
        while (i<f.length()) {
            System.out.print(f.charAt(i));
            ++i;
        }
    }
    public static void main(String[] args) {
        //strings are immutable;
        char arr[]={'a','b','c','d'};
        String str="abcd";
        String str2=new String("xyz");  //difference is in implentation level.

        //input output
        Scanner sc=new Scanner(System.in);
        String name=sc.next();   //or sc.nextLine() to input more than a word.
        System.out.println(name);
        
        //string length
        String fullname="tony stark";
        System.out.println(fullname.length()); //in array,length is a property(no ()) whereas in string, it is a function. 

        //concatenation
        String firstname="Ayush";
        String lastname="Solanki";
        String full_name=firstname+" "+lastname;
        System.out.println(full_name);

        //charAt method
        fullname="mrs. RS";
        printLetters(fullname);
        System.out.println("\n"+full_name.charAt(0));

        //when string is declared with new String, it creates a new memory of "Tony".
        String s1="Tony";
        String s2="Tony"; //String s1 & s2 are equal.- interning concept
        String s3=new String("Tony"); //string s1& s3 are not equal despite containing same word because of different memory locations. 
        //so it's better to compare equality of strings (on values) with different function.
        if (s1.equals(s3)) {  
            System.out.println("\nStrings are equal.");
        }
    }
}
 