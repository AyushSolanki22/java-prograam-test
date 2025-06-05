public class largest_of_3 {
    public static void main(String[] args) {
        int A = 1;
        int B = 5;
        int C = 10;

        if (A>=B && A>=C) {
            System.out.println("A is the largest of 3");
        }
        else if (B>=C) {       //As A is already not greater than B, so common sense - B is greater than A
            System.out.println("B is the largest of 3");
        }
        else {
            System.out.println("C is the largest of 3");
        }

    }
}