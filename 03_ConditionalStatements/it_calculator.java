import java.util.Scanner;

public class it_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter income (in lakhs):");
        double income = sc.nextDouble(); // using double for decimal precision

        double tax = 0;

        if (income < 5) {
            System.out.println("0% tax");
            tax = 0;
        } else if (income >= 5 && income < 10) {
            System.out.println("20% tax");
            tax = 0.20 * income;
        } else {                               // income >= 10
            System.out.println("30% tax");
            tax = 0.30 * income;
        }

        System.out.println("Calculated tax: ₹" + tax + " lakh");
    }
}
