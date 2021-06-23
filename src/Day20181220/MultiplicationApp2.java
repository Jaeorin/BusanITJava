package Day20181220;

public class MultiplicationApp2 {

    public static void main(String[] args) {

        int k = 1;
        int sum = 0;
        int h = 2;

        for (int i = 1; i <= 80; i++) {
            if (h < 10) {
                if (k < 10) {
                    sum = h * k;
                    System.out.print(h + "*" + k + "=" + sum + "\t");
                    k++;
                } else {
                    System.out.println();
                    k = 1;
                    h = h + 1;
                }
            }
        }

    }

}
