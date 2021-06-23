package Day20181218;

public class Street3 {
    public static void main(String[] args) {
        int destination = 87651; // 거리
        int speed = 5; // 속도

        int sec = destination / speed;
        System.out.println(sec + "초");
        int min = sec / 60;
        System.out.println(min + "분");
        int hour = min / 60;
        System.out.println(hour + "시간");
        System.out.println(hour + "시간" + min % 60 + "분" + sec % 60 + "초 입니다.");
    }
}
