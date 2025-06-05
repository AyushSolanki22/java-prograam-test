// With nested loops statement ;

// lines=4 --> outer loop =4 times
// inner loop = no. of times a character is printed in a line --> i times
// what to print

public class star_pattern {
    public static void main(String[] args) {
        for (int line=1; line<=4; ++line) {
            // if (line>1) {
            //     System.out.println();

            // }
            
            for (int star=1; star<=line; ++star) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}