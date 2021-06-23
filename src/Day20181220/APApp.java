package Day20181220;

public class APApp {

    public static void main(String[] args) {

        int num = 10;
        num = num + 1; // num 이 1씩 증가
        System.out.println(num);
        num++; // num 이 1씩 증가(약어)
        System.out.println(num);
        num--; // num 이 1씩 감소(약어)
        System.out.println(num);

        for (int i = 0; i < 5; i = i + 1) {
            System.out.println(i);
        }

        System.out.println("1부터 10까지 더하기");
        int sum = 0;

        for (int i = 1; i < 11; i++) {
            sum = sum + i;
        }

        System.out.println(sum);

    }

}
