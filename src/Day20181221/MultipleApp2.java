package Day20181221;

public class MultipleApp2 {

    public static void main(String[] args) {
        int a[] = {32, 11, 12, 18, 36};
        for (int i = 0; i < 5; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < 5; i++) {
            int n1 = a[i] % 3;
            int n2 = a[i] % 4;
            int sum = n1 + n2;
            System.out.println(i + "번째 loop");
            System.out.println("sum : " + sum);
            if (sum == 0) {
                System.out.println(a[i] + "는 3과 4의 공배수입니다");
            } else {
                System.out.println(a[i] + "는 3과 4의 공배수가 아닙니다");
            }
        }
    }

}
