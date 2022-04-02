// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89,

public class FibonacciSeries {

    static int fibbo(int n) {
        int val = 1;
        if (n == 1) {
            val = 0;
        } else if (n == 2) {
            val = 1;
        } else if (n > 2) {
            val = fibbo(n - 1) + fibbo(n - 2);
        }
        else{
            val = 0;
            System.out.println("Wrong Input!!!");
        }
        return val;
    }

    public static void main(String[] args) {
        int r = fibbo(3);
        System.out.println(r);
    }
}
