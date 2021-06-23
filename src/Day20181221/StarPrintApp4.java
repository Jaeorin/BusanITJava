package Day20181221;

public class StarPrintApp4 {

    public static void main(String[] args) {
        int h = 0;
        int k = 0;
        for (int i = 1; i < 4; i++) {
            for (int j = 3; j > i; j--) {
                System.out.print(" ");
            }
            for (k = 0; k <= h; k++) {
                System.out.print("*");
            }
            h = h + 2;
            System.out.println();
        }
        for (int i = 4; i < 6; i++) {
            for (int j = 3; j < i; j++) {
                System.out.print(" ");
            }
            for (k = 8; k >= h; k--) {
                System.out.print("*");
            }
            h = k + 3;
            System.out.println();
        }
    }

}
