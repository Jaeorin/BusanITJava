package Day20181220;

import java.util.Scanner;

public class MultiplicationApp3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("찾고싶은 단을 입력하세요(1~9)");
        int i = sc.nextInt();
        System.out.println(i + "단");
        int j = 0;

        for (j = 1; j < 10; j++) {
            System.out.println(i + "*" + j + "=" + (i * j));

        }

    }

}
