import java.util.*;
public class User_input {
    public static void main(String[] args) {
        System.out.println("taking input");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();       //takes only 1 word of input
        System.out.println(input);
        System.out.println("enter a line of input");
        // Now we can safely read a full line
        String line = sc.nextLine();    // // Consume the newline character left by next()
        System.out.println(line);
        int number=sc.nextInt();
        float fl=sc.nextFloat();

    }
}