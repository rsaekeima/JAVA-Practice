import java.util.Scanner;

class string_pac {
    public static void main(String[] args) {
        // String is class in Java like Scanner
        String name = new String("Raki");
        System.out.println(name);
        // But as it is used frequently, java has provided a easy way
        String new_name = "Rocky";
        System.out.println(new_name);
        // Taking input from user
        Scanner sc = new Scanner(System.in);
        String your_name = sc.nextLine();
        System.out.println(your_name);
        sc.close();
    }
}