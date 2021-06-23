package Day20181219;

public class CalApp {

    static int plus(int x, int y) {
        return x + y;
    }

    static int minus(int x, int y) {
        return x - y;
    }

    static int divide(int x, int y) {
        return x / y;
    }

    static int multiplication(int x, int y) {
        return x * y;
    }

    public static void main(String[] args) {
        int num = plus(30, 70);
        System.out.println(num);
        num = minus(num, 30);
        System.out.println(num);
        num = divide(30, 70);
        System.out.println(num);
        num = multiplication(30, 70);
        System.out.println(num);
    }
}
