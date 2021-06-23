package Day20181219;

public class CalApp2 {
    static int plus(int x, int y) {
        int result = x + y;
        return result;
    }

    static int minus(int x, int y) {
        int result = x - y;
        return result;
    }

    static int divid(int x, int y) {
        int result = x / y;
        return result;
    }

    static int multiful(int x, int y) {
        int result = x * y;
        return result;
    }

    public static void main(String[] args) {
        int r1 = plus(6, 2);
        System.out.println("plus : " + r1);
        int r2 = minus(6, 2);
        System.out.println("minus : " + r2);
        int r3 = divid(6, 2);
        System.out.println("divid : " + r3);
        int r4 = multiful(6, 2);
        System.out.println("multiful : " + r4);
    }
}
