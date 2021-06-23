package Day20181219;

public class CalApp2 {

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
        int r1 = plus(6, 2);
        System.out.println("더하기 : " + r1);
        int r2 = minus(6, 2);
        System.out.println("빼  기 : " + r2);
        int r3 = divide(6, 2);
        System.out.println("나누기 : " + r3);
        int r4 = multiplication(6, 2);
        System.out.println("곱하기 : " + r4);
    }
}
