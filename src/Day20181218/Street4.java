package Day20181218;

import java.util.Scanner;

public class Street4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("거리를 입력하세요.");
        int destination = in.nextInt();
        System.out.println("속력를 입력하세요.");
        int speed = in.nextInt();

        int sec = destination / speed;
        int r_sec = sec % 60;
        int min = sec / 60;
        int r_min = min % 60;
        int hour = min / 60;
        System.out.println(hour + "시간" + r_min + "분" + r_sec + "초");
    }
}
