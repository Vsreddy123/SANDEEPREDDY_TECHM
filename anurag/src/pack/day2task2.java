package pack;
import java.util.Scanner;

public class day2task2
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name of student: ");
        String n = in.nextLine();
        System.out.print("Enter roll no of student: ");
        int r = in.nextInt();
        System.out.print("Enter marks in 1st subject: ");
        int m1 = in.nextInt();
        System.out.print("Enter marks in 2nd subject: ");
        int m2 = in.nextInt();
        System.out.print("Enter marks in 3rd subject: ");
        int m3 = in.nextInt();
        System.out.print("Enter marks in 4th subject: ");
        int m4 = in.nextInt();
        System.out.print("Enter marks in 5th subject: ");
        int m5 = in.nextInt();
        int t = m1 + m2 + m3 + m4 + m5;
        double a = t / 5;
        
        System.out.println("name of student " + n);
        System.out.println("roll no student " + r);
        System.out.println("Total Marks = " + t);
        System.out.println("Average = " + a);
       
    }
}