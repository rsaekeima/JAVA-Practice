import java.util.Scanner;

public class CalculatePercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter each sub total marks");
        float total_mark = sc.nextFloat();
        System.out.println("Enter Sub1 Mark");
        float sub1 = sc.nextFloat();
        System.out.println("Enter Sub2 Mark");
        float sub2 = sc.nextFloat();
        System.out.println("Enter Sub3 Mark");
        float sub3 = sc.nextFloat();
        System.out.println("Enter Sub4 Mark");
        float sub4 = sc.nextFloat();
        System.out.println("Enter Sub5 Mark");
        float sub5 = sc.nextFloat();
        float percentage = 100 * ((sub1 + sub2 + sub3 + sub4 + sub5) / (5 * total_mark));
        System.out.println("Your % is");
        System.out.println(percentage);
        sc.close();

    }
}