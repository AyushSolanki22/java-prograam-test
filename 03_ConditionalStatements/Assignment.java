//question3: not understood 
//question 4: false  63
import java.util.Scanner;

public class Assignment {
    public static void question1() {
        //To check whether a number is positive or negative 
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int num=sc.nextInt();
        System.out.println(num<0?"negative":"positive");
    }
    public static void question2() {
        //Tell about fever
        double temp=99.5;
        System.out.println(temp>100?"You have a fever":"You don't have a fever");
    }
    public static void question3() {
        //input day number and output using switch case;
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter day number(1-7): ");
        int day=sc.nextInt();

        switch (day) {
            case 1: 
                System.out.println("Monday");
                break;
            case 2: 
                System.out.println("Tuesday");
                break;
            case 3: 
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5: 
                System.out.println("Friday");
                break;
            case 6: 
                System.out.println("Saturday");
                break;
            default: 
                System.out.println("Sunday");
        }
    }
    public static void question5() {
        //print whether it's a leap year or non-leap year
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter year(----): ");
        int year=sc.nextInt();
        if (year%4==0 && year%100==0 && year%400==0) {
            System.out.println("It is a leap year");
        }
        else if (year%4==0 && year%100!=0) {
            System.out.println("It's a leap year");
        }
        else {
            System.out.println("It's not a leap year");
        }
    }

    public static void main(String[] args) {
        question1();
        question2();
        question3();
        question5();
    }
}

//Q3: it's not weel number -- it's day number