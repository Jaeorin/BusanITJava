package Day20181221;

public class MultipleApp3 {

    public static void main(String[] args) {
        int a[] = {48, 17, 21, 56, 28};
        int temp = 9999;

        for (int i = 0; i < a.length; i++) {
            int num1 = a[i]%4;
            int num2 = a[i]%7;
            int sum = num1 + num2;

            if (sum == 0) {
                if (temp > a[i]) {
                    temp = a[i];
                }
            }
        }

        System.out.println("최소공배수 : " + temp);

    }

}
