public class MethodTest {

    static int add(int x, int y) {
        return x + y;
    }

    static int sum(int ...arr){
        int result = 0;
        for (int i: arr){
            result += i;
        }
        return result;

    }

    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c;
        c = sum(a, b, 5);
        System.out.println(c);
    }

}
