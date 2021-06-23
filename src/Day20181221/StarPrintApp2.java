package Day20181221;

public class StarPrintApp2 {

    static void printStar(int k) {
        for (int i = 0; i < k; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        for (int k = 1; k < 5; k++) {
            printStar(k);
        }
    }

}
