public class Recursion {

    static int factorial(int n) {
        int val = 1;
        if (n == 0 || n == 1) {
            val = 1;
        } else {
            while (n > 1) {
                val *= n;
                n--;
            }
        }
        return val;
    }

    static int rFactorial(int n) {
        int val = 1;
        if (n == 0 || n == 1) {
            val = 1;
        } else {
            val = n * factorial(n - 1);
        }
        return val;
    }

    public static void main(String[] args) {
        int a = factorial(10);
        int b = rFactorial(10);
        System.out.println(a);
        System.out.println(b);

    }
}
