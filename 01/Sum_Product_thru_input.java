// import java.util.*;

// public class Sum_Product_thru_input {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         System.out.print("Enter number 1: "); // Add this line
//         int a = s.nextInt();
//         System.out.print("Enter number 2: "); // Add this line
//         int b = s.nextInt();
//         int sum = a + b;
//         int product = a * b;
//         // Print the results
//         // System.out.println("Sum: ", sum);
//         // System.out.println("Product: " , product); // Use System.err to print the product
//         // Note: The above line will cause a compilation error. Use the following lines instead.
//         System.out.println("Sum: " + sum);
//         System.out.println("Product: "+ product);
//         s.close(); // Close the scanner to prevent resource leaks
//         }
// }

import java.util.*;

public class Sum_Product_thru_input {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter number 1: ");
            int a = s.nextInt();
            System.out.print("Enter number 2: ");
            int b = s.nextInt();
            int sum = a + b;
            int product = a * b;
            System.out.println("Sum: " + sum);
            System.out.println("Product: "+ product);
        }
    }
}