// while(condition) {
    // to do something
// }
public class while_loop {
   public static void main(String[] args) {
    System.out.println("\"@100 Times Hello World print\"\n");
    int i=1;

    while (i<=100) {                      //Caution : Not use such condition which can result in infinite iterations.
     System.out.println("Hello World");  
     ++i;       
    }
    System.out.println("\nHello World sucessfully printed "+(i-1)+" times");


   }
}