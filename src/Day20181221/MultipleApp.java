package Day20181221;

public class MultipleApp {

    public static void main(String[] args) {
        //1부터 300까지의 수
        //4의 배수의 합 구하기
        int sum = 0;
        for (int i = 0; i < 301; i++) {
            if (i % 4 == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }

}
