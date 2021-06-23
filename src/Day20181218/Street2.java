package Day20181218;

public class Street2 {
    public static void main(String[] args) {
        int destination = 11271; // 거리
        int speed = 3; // 속도

        // 당신의 자동차가 얼마만에 목적지에 도착하는지?
        System.out.println(destination / speed);
        int sec = destination / speed;
        int min = sec / 60;
        sec = sec % 60;
        System.out.println(sec + "초");
        int hour = min / 60;
        min = min % 60;
        System.out.println(min + "분");
        System.out.println(hour + "시간");
        System.out.println(hour + "시간" + min + "분" + sec + "초 입니다.");
    }
}
